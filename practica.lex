import java.io.*;
import java.util.ArrayList;

%%

%unicode                // Unicode format
%line                   // Enable rows ("yyline")
%column                 // Enable columns ("yycolumn")
%ignorecase             // Case insensitive
%integer                // Return type of yylex() method

%{
class dataClass {
    private ArrayList<String> tokensList = new ArrayList<String>();

    public void add( String token ) {
        tokensList.add(token);
    }

    public String checkPuntuacion( String elem ) {
        String elem_string = "";

        switch (elem) {
            case "(":
                elem_string = "paren_izq";
                break;
            case ")":
                elem_string = "paren_der";
                break;
            case ",":
                elem_string = "coma";
                break;
            case ";":
                elem_string = "punto_coma";
                break;
            case ":":
                elem_string = "dos_puntos";
                break;
            default:
                elem_string = "Invalid element";
                break;
        }

        return elem_string;
    }

    public String printLog() {
        String output = "Análisis Léxico Completado\n\n[";

        for ( String elem : tokensList) {
            output = output + elem + ", ";
        }

        output = output.substring(0, output.length() - 2) + "]"; // Replace last ", "

        return output;
    }
}

dataClass data = new dataClass();

public static void main (String argv[]) throws java.io.IOException {

    FileInputStream fis = new FileInputStream("ficheroPrueba.txt");

    Yylex yy = new Yylex(fis);

    while (yy.yylex() != -1) ;
}

%}

%eof{
    System.out.println(data.printLog());
%eof}

PALABRAS_RESERVADAS=(program|is|begin|end|var|integer|boolean|read|write|skip|while|do|if|then|else|and|or|true|false|not)
OPERADOR_ASIGNACION=(:=)
OPERADORES_RELACION=(<=|<|=|>|=>|<>)
SIGNOS_PUNTUACION=[\(|\)|,|;|:]
IDENTIFICADOR=[a-zA-Z][a-zA-Z0-9]*
T_INTEGER=[+-]?[0-9]+


%%
[ \t]                   {/* Nada */}

{PALABRAS_RESERVADAS}   { data.add(yytext()); } /* palabras reservadas */
{OPERADOR_ASIGNACION}   { data.add("asig"); } /* Operador asignacion */
{OPERADORES_RELACION}   { data.add("comp"); } /* Operador relacion */
{SIGNOS_PUNTUACION}     { data.add(data.checkPuntuacion(yytext())); } /* Signos puntuacion */
{IDENTIFICADOR}         { data.add("ide(" + yytext() + ")"); } /* Identificador */
{T_INTEGER}             { data.add("num(" + yytext() + ")"); } /* Tipo entero */

[\r\n]                  { /* Nada */}
.                       { /* Nada */}