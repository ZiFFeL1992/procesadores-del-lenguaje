/* The following code was generated by JFlex 1.4.3 on 10/16/16 11:19 PM */

import java.io.*;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/16/16 11:19 PM from the specification file
 * <tt>/Users/guille/Code/Universidad/procesadores-del-lenguaje/practica.lex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\0\1\0\2\0\1\0\22\0\1\0\7\0\2\31\1\0"+
    "\1\34\1\31\1\34\2\0\12\33\1\25\1\31\1\27\1\26\1\30"+
    "\2\0\1\5\1\11\1\32\1\14\1\12\1\23\1\4\1\22\1\7"+
    "\1\32\1\21\1\17\1\6\1\13\1\3\1\1\1\32\1\2\1\10"+
    "\1\16\1\24\1\15\1\20\3\32\6\0\1\5\1\11\1\32\1\14"+
    "\1\12\1\23\1\4\1\22\1\7\1\32\1\21\1\17\1\6\1\13"+
    "\1\3\1\1\1\32\1\2\1\10\1\16\1\24\1\15\1\20\3\32"+
    "\1\0\1\31\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\17\2\1\3\3\4\1\3\1\5\1\1"+
    "\2\2\1\6\14\2\1\7\20\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[56];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\35\0\72\0\127\0\164\0\221\0\256\0\313"+
    "\0\350\0\u0105\0\u0122\0\u013f\0\u015c\0\u0179\0\u0196\0\u01b3"+
    "\0\u01d0\0\u01ed\0\u020a\0\u0227\0\35\0\35\0\u0244\0\u0244"+
    "\0\u0261\0\u027e\0\221\0\u029b\0\u02b8\0\u02d5\0\u02f2\0\u030f"+
    "\0\u032c\0\u0349\0\u0366\0\u0383\0\u03a0\0\u03bd\0\u03da\0\35"+
    "\0\u03f7\0\u0414\0\u0431\0\u044e\0\u046b\0\u0488\0\u04a5\0\u04c2"+
    "\0\u04df\0\u04fc\0\u0519\0\u0536\0\u0553\0\u0570\0\u058d\0\u05aa";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[56];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\6\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\6"+
    "\1\20\2\6\1\21\1\6\1\22\1\23\1\24\1\25"+
    "\1\26\1\6\1\27\1\30\36\0\1\6\1\31\22\6"+
    "\5\0\2\6\2\0\11\6\1\32\12\6\5\0\2\6"+
    "\2\0\1\6\1\33\22\6\5\0\2\6\2\0\24\6"+
    "\5\0\2\6\2\0\12\6\1\34\11\6\5\0\2\6"+
    "\2\0\7\6\1\33\2\6\1\35\7\6\1\33\1\6"+
    "\5\0\2\6\2\0\20\6\1\36\3\6\5\0\2\6"+
    "\2\0\2\6\1\37\6\6\1\40\12\6\5\0\2\6"+
    "\2\0\12\6\1\34\3\6\1\41\5\6\5\0\2\6"+
    "\2\0\2\6\1\42\21\6\5\0\2\6\2\0\2\6"+
    "\1\33\21\6\5\0\2\6\2\0\4\6\1\5\17\6"+
    "\5\0\2\6\2\0\1\6\1\43\17\6\1\44\2\6"+
    "\5\0\2\6\2\0\1\6\1\45\17\6\1\46\2\6"+
    "\5\0\2\6\2\0\4\6\1\47\17\6\5\0\2\6"+
    "\27\0\1\50\36\0\1\25\32\0\1\25\1\0\1\25"+
    "\37\0\1\27\2\0\2\6\1\51\21\6\5\0\2\6"+
    "\2\0\4\6\1\34\17\6\5\0\2\6\2\0\13\6"+
    "\1\33\10\6\5\0\2\6\2\0\15\6\1\52\6\6"+
    "\5\0\2\6\2\0\6\6\1\53\15\6\5\0\2\6"+
    "\2\0\2\6\1\54\21\6\5\0\2\6\2\0\3\6"+
    "\1\55\20\6\5\0\2\6\2\0\7\6\1\56\14\6"+
    "\5\0\2\6\2\0\15\6\1\33\6\6\5\0\2\6"+
    "\2\0\23\6\1\56\5\0\2\6\2\0\11\6\1\57"+
    "\12\6\5\0\2\6\2\0\6\6\1\60\15\6\5\0"+
    "\2\6\2\0\6\6\1\61\15\6\5\0\2\6\2\0"+
    "\16\6\1\41\5\6\5\0\2\6\2\0\3\6\1\62"+
    "\20\6\5\0\2\6\2\0\11\6\1\63\12\6\5\0"+
    "\2\6\2\0\1\33\23\6\5\0\2\6\2\0\16\6"+
    "\1\64\5\6\5\0\2\6\2\0\6\6\1\57\15\6"+
    "\5\0\2\6\2\0\11\6\1\33\12\6\5\0\2\6"+
    "\2\0\12\6\1\33\11\6\5\0\2\6\2\0\15\6"+
    "\1\56\6\6\5\0\2\6\2\0\16\6\1\56\5\6"+
    "\5\0\2\6\2\0\1\6\1\65\22\6\5\0\2\6"+
    "\2\0\3\6\1\66\20\6\5\0\2\6\2\0\11\6"+
    "\1\67\12\6\5\0\2\6\2\0\4\6\1\70\17\6"+
    "\5\0\2\6\2\0\11\6\1\5\12\6\5\0\2\6"+
    "\2\0\4\6\1\57\17\6\5\0\2\6\2\0\5\6"+
    "\1\33\16\6\5\0\2\6\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1479];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\22\1\2\11\21\1\1\11\20\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[56];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
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

    public String parseInteger( String elem ) {
        if (elem.charAt(0) == '+') {
            return "mas" + ", num(" + elem.substring(1) + ")";
        } else if (elem.charAt(0) == '-') {
            return "menos" + ", num(" + elem.substring(1) + ")";
        } else {
            return "num(" + elem + ")";
        }
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



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        System.out.println(data.printLog());

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 7: 
          { data.add("asig");
          }
        case 8: break;
        case 5: 
          { data.add(data.parseInteger(yytext()));
          }
        case 9: break;
        case 2: 
          { data.add("ide(" + yytext() + ")");
          }
        case 10: break;
        case 4: 
          { data.add("comp");
          }
        case 11: break;
        case 6: 
          { data.add(yytext());
          }
        case 12: break;
        case 3: 
          { data.add(data.checkPuntuacion(yytext()));
          }
        case 13: break;
        case 1: 
          { /* Nada */
          }
        case 14: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
