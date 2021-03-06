/* The following code was generated by JFlex 1.4.3 on 7/03/17 16:28 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/03/17 16:28 from the specification file
 * <tt>practica.fle</tt>
 */
class practica {

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
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 40,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    37, 23,  0,  0,  0,  0, 24,  0, 27, 28, 18, 16,  0, 17,  0, 19, 
     3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 26, 25, 20, 21, 22, 33, 
     0,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 31,  0, 32,  0,  2, 
     0, 10, 35, 36,  1,  8,  9,  1, 14, 15,  1,  1, 11,  1, 38,  1, 
    34,  1,  6, 12,  5,  7, 39, 13,  1,  1,  1, 29,  4, 30,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\4\2\1\4\1\5"+
    "\1\6\1\7\1\10\1\1\1\11\1\12\1\1\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\2\1\24\4\0\1\25\1\0\1\26\1\0\4\2"+
    "\2\0\1\27\1\30\1\31\1\32\1\33\1\2\1\25"+
    "\2\34\3\0\1\35\1\25\1\0\4\2\2\0\1\2"+
    "\3\0\1\36\2\2\2\0\1\2\1\34\1\0\1\37"+
    "\1\2\1\40\2\0\2\2\2\0\1\2\1\41\14\0"+
    "\1\42\1\43\2\0\1\44";

  private static int [] zzUnpackAction() {
    int [] result = new int[104];
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
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\u0171\0\u019a\0\51\0\51\0\u01c3\0\u01ec\0\u0215"+
    "\0\u023e\0\u0267\0\51\0\51\0\51\0\51\0\51\0\51"+
    "\0\51\0\51\0\51\0\u0290\0\51\0\u02b9\0\u02e2\0\u030b"+
    "\0\u0334\0\u035d\0\u0386\0\u03af\0\u03af\0\u03d8\0\u0401\0\u042a"+
    "\0\u0453\0\u047c\0\u04a5\0\51\0\51\0\51\0\51\0\51"+
    "\0\u04ce\0\u04f7\0\u0520\0\u0549\0\u0572\0\u059b\0\u05c4\0\51"+
    "\0\u05ed\0\u0616\0\u063f\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u070c"+
    "\0\u0735\0\u075e\0\u0787\0\u07b0\0\122\0\u07d9\0\u0802\0\u082b"+
    "\0\u0854\0\u087d\0\u08a6\0\u08cf\0\51\0\u08f8\0\122\0\u0921"+
    "\0\u094a\0\u0973\0\u099c\0\u09c5\0\u09ee\0\u0a17\0\u0a40\0\u0a69"+
    "\0\u0a92\0\u0abb\0\u0ae4\0\u0b0d\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1"+
    "\0\u0bda\0\u0c03\0\u0c2c\0\51\0\51\0\u0c55\0\u0c7e\0\51";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[104];
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
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\2\3"+
    "\1\10\3\3\1\11\2\3\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\2\3"+
    "\1\2\2\3\1\35\52\0\3\3\1\36\13\3\2\36"+
    "\3\0\1\37\11\0\1\40\2\0\3\3\1\41\2\3"+
    "\2\0\1\42\1\0\1\4\1\43\13\42\2\43\20\0"+
    "\3\42\1\0\2\42\2\0\1\42\1\0\1\4\1\44"+
    "\13\42\2\45\20\0\3\42\1\0\2\42\2\0\3\3"+
    "\1\36\1\3\1\46\11\3\2\36\3\0\1\37\11\0"+
    "\1\40\2\0\3\3\1\41\2\3\2\0\3\3\1\36"+
    "\3\3\1\47\7\3\2\36\3\0\1\37\11\0\1\40"+
    "\2\0\3\3\1\41\2\3\2\0\3\3\1\36\5\3"+
    "\1\50\5\3\2\36\3\0\1\37\11\0\1\40\2\0"+
    "\3\3\1\41\2\3\2\0\3\3\1\36\11\3\1\51"+
    "\1\3\2\36\3\0\1\37\11\0\1\40\2\0\3\3"+
    "\1\41\2\3\2\0\1\42\1\0\1\4\1\45\13\42"+
    "\2\45\13\0\1\52\4\0\3\42\1\0\2\42\2\0"+
    "\1\42\1\0\1\4\1\45\13\42\2\45\13\0\1\53"+
    "\4\0\3\42\1\0\2\42\26\0\1\54\50\0\1\55"+
    "\50\0\1\56\50\0\1\57\53\0\1\60\21\0\3\3"+
    "\1\36\2\3\1\61\10\3\2\36\3\0\1\37\11\0"+
    "\1\40\2\0\3\3\1\41\2\3\2\0\1\42\1\0"+
    "\2\62\13\42\2\62\20\0\3\42\1\0\2\42\2\0"+
    "\1\63\1\0\1\64\1\65\13\63\2\65\20\0\3\63"+
    "\1\37\2\63\22\0\1\66\15\0\1\67\1\70\35\0"+
    "\1\37\17\0\1\41\4\0\3\42\1\36\13\42\2\36"+
    "\20\0\3\42\1\0\2\42\2\0\1\42\1\0\1\62"+
    "\1\45\13\42\2\45\20\0\3\42\1\0\2\42\2\0"+
    "\1\71\1\0\1\62\1\72\13\71\2\72\20\0\3\71"+
    "\1\0\2\71\2\0\3\3\1\36\2\3\1\73\10\3"+
    "\2\36\3\0\1\37\11\0\1\40\2\0\3\3\1\41"+
    "\2\3\2\0\3\3\1\36\1\74\12\3\2\36\3\0"+
    "\1\37\11\0\1\40\2\0\3\3\1\41\2\3\2\0"+
    "\3\3\1\36\6\3\1\75\4\3\2\36\3\0\1\37"+
    "\11\0\1\40\2\0\3\3\1\41\2\3\2\0\3\3"+
    "\1\36\12\3\1\76\2\36\3\0\1\37\11\0\1\40"+
    "\2\0\3\3\1\41\2\3\50\0\1\77\50\0\1\100"+
    "\2\0\3\3\1\36\13\3\2\36\3\0\1\37\11\0"+
    "\1\40\2\0\1\3\1\101\1\3\1\41\2\3\2\0"+
    "\1\42\1\0\1\62\1\43\13\42\2\43\20\0\3\42"+
    "\1\0\2\42\2\0\3\63\1\102\13\63\2\102\20\0"+
    "\3\63\1\0\2\63\2\0\1\63\1\0\1\64\1\65"+
    "\13\63\2\65\20\0\3\63\1\0\2\63\2\0\1\63"+
    "\1\0\1\64\1\103\13\63\2\103\20\0\3\63\1\0"+
    "\2\63\22\0\1\104\66\0\1\67\1\70\11\0\1\42"+
    "\2\71\1\43\13\42\2\43\20\0\3\42\1\0\2\42"+
    "\2\0\1\71\3\0\13\71\22\0\3\71\1\0\2\71"+
    "\2\0\3\3\1\36\3\3\1\105\7\3\2\36\3\0"+
    "\1\37\11\0\1\40\2\0\3\3\1\41\2\3\2\0"+
    "\3\3\1\36\2\3\1\106\10\3\2\36\3\0\1\37"+
    "\11\0\1\40\2\0\3\3\1\41\2\3\2\0\3\3"+
    "\1\36\7\3\1\73\3\3\2\36\3\0\1\37\11\0"+
    "\1\40\2\0\3\3\1\41\2\3\2\0\3\3\1\36"+
    "\6\3\1\107\4\3\2\36\3\0\1\37\11\0\1\40"+
    "\2\0\3\3\1\41\2\3\13\0\1\110\50\0\1\111"+
    "\37\0\3\3\1\36\6\3\1\112\4\3\2\36\3\0"+
    "\1\37\11\0\1\40\2\0\3\3\1\41\2\3\2\0"+
    "\1\63\1\0\2\64\13\63\2\64\20\0\3\63\1\0"+
    "\2\63\2\0\1\113\1\0\1\64\1\114\13\113\2\114"+
    "\20\0\3\113\1\0\2\113\41\0\1\115\11\0\3\3"+
    "\1\36\1\3\1\116\11\3\2\36\3\0\1\37\11\0"+
    "\1\40\2\0\3\3\1\41\2\3\2\0\3\3\1\36"+
    "\3\3\1\117\7\3\2\36\3\0\1\37\11\0\1\40"+
    "\2\0\3\3\1\41\2\3\7\0\1\120\50\0\1\121"+
    "\43\0\3\3\1\36\12\3\1\122\2\36\3\0\1\37"+
    "\11\0\1\40\2\0\3\3\1\41\2\3\2\0\1\63"+
    "\2\113\1\65\13\63\2\65\20\0\3\63\1\0\2\63"+
    "\2\0\1\113\3\0\13\113\22\0\3\113\1\0\2\113"+
    "\2\0\3\3\1\36\13\3\2\36\3\0\1\37\11\0"+
    "\1\40\2\0\3\3\1\41\1\123\1\3\20\0\1\124"+
    "\50\0\1\125\32\0\3\3\1\36\13\3\2\36\3\0"+
    "\1\37\11\0\1\40\2\0\2\3\1\126\1\41\2\3"+
    "\2\0\3\3\1\36\13\3\2\36\3\0\1\37\11\0"+
    "\1\40\2\0\3\3\1\127\2\3\13\0\1\130\50\0"+
    "\1\131\37\0\3\3\1\36\13\3\2\36\3\0\1\37"+
    "\11\0\1\40\2\0\3\3\1\132\2\3\26\0\1\37"+
    "\17\0\1\127\46\0\1\133\50\0\1\134\21\0\1\135"+
    "\10\0\1\37\17\0\1\132\16\0\1\136\50\0\1\137"+
    "\42\0\1\140\53\0\1\141\50\0\1\142\52\0\1\143"+
    "\74\0\1\144\50\0\1\145\17\0\1\146\62\0\1\147"+
    "\75\0\1\150\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3239];
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
    "\1\0\1\11\11\1\2\11\5\1\11\11\1\1\1\11"+
    "\4\0\1\1\1\0\1\1\1\0\4\1\2\0\5\11"+
    "\4\1\3\0\1\11\1\1\1\0\4\1\2\0\1\1"+
    "\3\0\3\1\2\0\2\1\1\0\1\11\2\1\2\0"+
    "\2\1\2\0\2\1\14\0\2\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[104];
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
  public int cont;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  practica(java.io.Reader in) {
  	cont=0;
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  practica(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
    	System.out.println("Naturales = "+cont);

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
        case 14: 
          { System.out.println("simbolo parentesisCierre");
          }
        case 37: break;
        case 15: 
          { System.out.println("simbolo llaveApertura");
          }
        case 38: break;
        case 8: 
          { System.out.println("Expresion relacional menor que");
          }
        case 39: break;
        case 34: 
          { System.out.println("Pre-Incremento");
          }
        case 40: break;
        case 17: 
          { System.out.println("simbolo corcheteApertura");
          }
        case 41: break;
        case 32: 
          { System.out.println("Bucle while: " + yytext());
          }
        case 42: break;
        case 12: 
          { System.out.println("simbolo dosPuntos");
          }
        case 43: break;
        case 26: 
          { System.out.println("Expresion relacional distinto que");
          }
        case 44: break;
        case 7: 
          { System.out.println("Expresion aritmetica dividir");
          }
        case 45: break;
        case 22: 
          { System.out.println("Expresion logica or");
          }
        case 46: break;
        case 5: 
          { System.out.println("Expresion aritmetica restar");
          }
        case 47: break;
        case 23: 
          { System.out.println("Expresion relacional menor igual que");
          }
        case 48: break;
        case 4: 
          { System.out.println("Expresion aritmetica sumar");
          }
        case 49: break;
        case 20: 
          { System.out.print(yytext());
          }
        case 50: break;
        case 6: 
          { System.out.println("Expresion aritmetica multiplicar");
          }
        case 51: break;
        case 16: 
          { System.out.println("simbolo llaveCierre");
          }
        case 52: break;
        case 27: 
          { System.out.println("Expresion logica and");
          }
        case 53: break;
        case 10: 
          { System.out.println("Expresion logica not");
          }
        case 54: break;
        case 11: 
          { System.out.println("simbolo puntoComa");
          }
        case 55: break;
        case 31: 
          { System.out.println("Post-Decremento");
          }
        case 56: break;
        case 9: 
          { System.out.println("Expresion relacional mayor que");
          }
        case 57: break;
        case 13: 
          { System.out.println("simbolo parentesisApertura");
          }
        case 58: break;
        case 30: 
          { System.out.println("Boolean: "+yytext());
          }
        case 59: break;
        case 36: 
          { System.out.println("Cabecera metodo");
          }
        case 60: break;
        case 33: 
          { System.out.println("Return");
          }
        case 61: break;
        case 21: 
          { System.out.println("Expresion aritmetica: "+yytext());
          }
        case 62: break;
        case 3: 
          { System.out.println("Entero: " + yytext());
          }
        case 63: break;
        case 35: 
          { System.out.println("Pre-Decremento");
          }
        case 64: break;
        case 24: 
          { System.out.println("Expresion relacional igual que");
          }
        case 65: break;
        case 25: 
          { System.out.println("Expresion relacional mayor igual que");
          }
        case 66: break;
        case 28: 
          { System.out.println("Asignacion expresion: " + yytext());
          }
        case 67: break;
        case 29: 
          { System.out.println("Post-Incremento");
          }
        case 68: break;
        case 2: 
          { System.out.println("Variable: " + yytext());
          }
        case 69: break;
        case 18: 
          { System.out.println("simbolo corcheteCierre");
          }
        case 70: break;
        case 19: 
          { System.out.println("simbolo interrogacion");
          }
        case 71: break;
        case 1: 
          { 
          }
        case 72: break;
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

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java practica <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        practica scanner = null;
        try {
          scanner = new practica( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
