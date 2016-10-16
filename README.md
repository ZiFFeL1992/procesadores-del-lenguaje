# Práctica Procesadores del Lenguaje (UAH 2016)

## Analizador Léxico

### Especificaciones Léxicas

- [x] **EspLex 1.** El conjunto de las palabras reservadas del lenguaje es:
**program, is, begin, end, var, integer, boolean, read, write, skip, while, do, if, then, else, and, or, true, false y not**, las cuales generan el token correspondiente a cada una de ellas.
- [x] **EspLex 2.** Operador de asignación: Símbolo **‘:=’ .**
- [x] **EspLex 3.** Operadores de relación: Símbolos **‘<=‘ , ‘<‘ , ‘=‘ , ‘>‘ , ‘>=‘ y ‘<>‘.**
- [x] **EspLex 4.** Operadores matemáticos: Símbolos **‘+‘ , ‘-‘ , ‘*‘ y ‘/‘ .**
- [x] **EspLex 5.** Signos de puntuación: Símbolos **‘(‘ , ‘)‘ , ‘,‘ , ‘;’ y ‘:‘ .**
- [x] **EspLex 6.** Identificadores: **Siempre comienzan por una letra y a continuación pueden aparecer letras y números.** Ejemplo: Ident01, a994. No son sensibles a mayúsculas y minúsculas, lo que significa que “ident01” e “IDENT01” son el mismo identificador.
- [ ] **EspLex 7.** Los valores de tipo entero (integer) están compuestos por una secuencia con, al menos, un dígito y, opcionalmente, al principio, pueden tener un símbolo (+ o -). Ejemplo: 4212, - 4212 ó +4212. Los valores de tipo booleano (boolean) aceptan únicamente true o false.
- [x] **EspLex 8.** Puede haber espacios y/o tabuladores en cualquier parte del fichero a analizar.
- [ ] **EspLex 9.** Se considera un error léxicos la detección de un carácter no definido.


### Requisitos Léxicos
- [ ] **ReqLex 1.** Se deben presentar los errores detectados e indicar para cada uno el número de línea y columna donde se ha producido. Estos errores pueden mostrarse a medida que se detectan, o almacenarse en una lista y mostrarlos al final del análisis.
- [ ] **ReqLex 2.** En la memoria justificativa se deberá incluir un Autómata Finito Determinista (AFD) por cada una de las expresiones regular definidas1.
- [ ] **ReqLex 3.** El empleo o no de estados léxicos deberá justificarse en la memoria justificativa.
- [x] **ReqLex 4.** Al analizar el archivo que contenga un programa en el lenguaje dado, creará una salida en pantalla con una lista de tokens que representan los componentes atómicos significativas del programa.

**Ejemplo entrada:**
```pascal
program switch is
    var sum,k : integer;
    var switch : boolean;
begin
    switch := true; sum := 0; k := 1;
    while k<10 do
        switch := not(switch);
        if switch then
            sum := sum+k
        end if;
        k := k+1
    end while;
    write sum
end
```

**Output:**
```
Análisis Léxico Completado

[program, ide(switch), is, var, ide(sum), coma, ide(k), dos_puntos, integer,
punto_coma, var, ide(switch), dos_puntos, boolean, punto_coma, begin,
ide(switch), asig, true, punto_coma, ide(sum), asig, num(0), punto_coma,
ide(k), asig, num(1), punto_coma, while, ide(k), comp, num(10), do, ide(switch),
asig, not, paren_izq, ide(switch), paren_der, punto_coma, if, ide(switch), then,
ide(sum), asig, ide(sum), ide(k), end, if, punto_coma, ide(k), asig, ide(k),
mas, num(1), end, while, punto_coma, write, ide(sum), end]
```