package com.testvagrant;

import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.testvagrant.token.ElementTokenTypes.*;

%%

%{
  public _ElementsLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _ElementsLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s

SPACE=[ \t\n\x0B\f\r]+|\n|\t
STRING=\"[^\"]*\"|'[^']*'
NUMBER=(\+|\-)?[:digit:]*
ID=[:letter:][a-zA-Z_0-9]*
QUOTE=\"

%%
<YYINITIAL> {
  {WHITE_SPACE}          { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "\"elements\""         { return ELEMENTVALUE; }
  "\"elementName\""      { return ELEMENTNAME; }
  "\"identifier\""       { return ELEMENTID; }
  "\"value\""            { return ELEMENTVAL; }
  "\"waitFor\""          { return ELEMENTWAITFOR; }
  "\"referTo\""          { return ELEMENTREFERENCE; }
  ","                    { return COMMA; }
  ":"                    { return COLON; }
  "{"                    { return BRACE1; }
  "}"                    { return BRACE2; }
  "["                    { return BRACK1; }
  "]"                    { return BRACK2; }

  {SPACE}                { return SPACE; }
  {STRING}               { return STRING; }
  {NUMBER}               { return NUMBER; }
  {ID}                   { return ID; }
  {QUOTE}                { return QUOTE; }

}

[^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
