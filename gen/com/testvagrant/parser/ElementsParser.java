// This is a generated file. Not intended for manual editing.
package com.testvagrant.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.testvagrant.token.ElementTokenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ElementsParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ELEMENT_JSON) {
      r = elementJson(b, 0);
    }
    else if (t == ELEMENT_OBJECT) {
      r = elementObject(b, 0);
    }
    else if (t == ELEMENTS) {
      r = elements(b, 0);
    }
    else if (t == ELEMENTS_ARRAY) {
      r = elementsArray(b, 0);
    }
    else if (t == ELEMENTS_OBJECT) {
      r = elementsObject(b, 0);
    }
    else if (t == PROP_ID) {
      r = propID(b, 0);
    }
    else if (t == PROP_VALUE) {
      r = propValue(b, 0);
    }
    else if (t == VALUES) {
      r = values(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ELEMENTS_OBJECT, ELEMENT_JSON, ELEMENT_OBJECT),
  };

  /* ********************************************************** */
  // elementObject
  public static boolean elementJson(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementJson")) return false;
    if (!nextTokenIs(b, BRACE1)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ELEMENT_JSON, null);
    r = elementObject(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' [space] [!'}' propValue (!'}' ',' [space] propValue) *] [space] '}'
  public static boolean elementObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject")) return false;
    if (!nextTokenIs(b, BRACE1)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_OBJECT, null);
    r = consumeToken(b, BRACE1);
    r = r && elementObject_1(b, l + 1);
    r = r && elementObject_2(b, l + 1);
    r = r && elementObject_3(b, l + 1);
    p = r; // pin = 4
    r = r && consumeToken(b, BRACE2);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [space]
  private static boolean elementObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  // [!'}' propValue (!'}' ',' [space] propValue) *]
  private static boolean elementObject_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject_2")) return false;
    elementObject_2_0(b, l + 1);
    return true;
  }

  // !'}' propValue (!'}' ',' [space] propValue) *
  private static boolean elementObject_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementObject_2_0_0(b, l + 1);
    r = r && propValue(b, l + 1);
    r = r && elementObject_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !'}'
  private static boolean elementObject_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, BRACE2);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (!'}' ',' [space] propValue) *
  private static boolean elementObject_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!elementObject_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elementObject_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // !'}' ',' [space] propValue
  private static boolean elementObject_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementObject_2_0_2_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && elementObject_2_0_2_0_2(b, l + 1);
    r = r && propValue(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !'}'
  private static boolean elementObject_2_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject_2_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, BRACE2);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [space]
  private static boolean elementObject_2_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject_2_0_2_0_2")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  // [space]
  private static boolean elementObject_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementObject_3")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // elementsObject
  public static boolean elements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elements")) return false;
    if (!nextTokenIs(b, BRACE1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elementsObject(b, l + 1);
    exit_section_(b, m, ELEMENTS, r);
    return r;
  }

  /* ********************************************************** */
  // '['[!']' item (!']' ',' item) *] [space]']'
  public static boolean elementsArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsArray")) return false;
    if (!nextTokenIs(b, BRACK1)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELEMENTS_ARRAY, null);
    r = consumeToken(b, BRACK1);
    p = r; // pin = 1
    r = r && report_error_(b, elementsArray_1(b, l + 1));
    r = p && report_error_(b, elementsArray_2(b, l + 1)) && r;
    r = p && consumeToken(b, BRACK2) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [!']' item (!']' ',' item) *]
  private static boolean elementsArray_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsArray_1")) return false;
    elementsArray_1_0(b, l + 1);
    return true;
  }

  // !']' item (!']' ',' item) *
  private static boolean elementsArray_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsArray_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = elementsArray_1_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, item(b, l + 1));
    r = p && elementsArray_1_0_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !']'
  private static boolean elementsArray_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsArray_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, BRACK2);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (!']' ',' item) *
  private static boolean elementsArray_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsArray_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!elementsArray_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "elementsArray_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // !']' ',' item
  private static boolean elementsArray_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsArray_1_0_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = elementsArray_1_0_2_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, COMMA));
    r = p && item(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !']'
  private static boolean elementsArray_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsArray_1_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, BRACK2);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [space]
  private static boolean elementsArray_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsArray_2")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // '{' [space] [! '}'  elementValue ':' [space] elementsArray ] [space] '}'
  public static boolean elementsObject(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsObject")) return false;
    if (!nextTokenIs(b, BRACE1)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELEMENTS_OBJECT, null);
    r = consumeToken(b, BRACE1);
    p = r; // pin = 1
    r = r && report_error_(b, elementsObject_1(b, l + 1));
    r = p && report_error_(b, elementsObject_2(b, l + 1)) && r;
    r = p && report_error_(b, elementsObject_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE2) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [space]
  private static boolean elementsObject_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsObject_1")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  // [! '}'  elementValue ':' [space] elementsArray ]
  private static boolean elementsObject_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsObject_2")) return false;
    elementsObject_2_0(b, l + 1);
    return true;
  }

  // ! '}'  elementValue ':' [space] elementsArray
  private static boolean elementsObject_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsObject_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = elementsObject_2_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, ELEMENTVALUE));
    r = p && report_error_(b, consumeToken(b, COLON)) && r;
    r = p && report_error_(b, elementsObject_2_0_3(b, l + 1)) && r;
    r = p && elementsArray(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ! '}'
  private static boolean elementsObject_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsObject_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, BRACE2);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [space]
  private static boolean elementsObject_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsObject_2_0_3")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  // [space]
  private static boolean elementsObject_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elementsObject_3")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // [space] elementJson [space]
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = item_0(b, l + 1);
    r = r && elementJson(b, l + 1);
    r = r && item_2(b, l + 1);
    exit_section_(b, l, m, r, false, recover_parser_);
    return r;
  }

  // [space]
  private static boolean item_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_0")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  // [space]
  private static boolean item_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_2")) return false;
    consumeToken(b, SPACE);
    return true;
  }

  /* ********************************************************** */
  // elementName | elementId | elementVal | elementWaitFor | elementReference
  public static boolean propID(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propID")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_ID, "<prop id>");
    r = consumeToken(b, ELEMENTNAME);
    if (!r) r = consumeToken(b, ELEMENTID);
    if (!r) r = consumeToken(b, ELEMENTVAL);
    if (!r) r = consumeToken(b, ELEMENTWAITFOR);
    if (!r) r = consumeToken(b, ELEMENTREFERENCE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // propID ':' values
  public static boolean propValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "propValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_VALUE, "<prop value>");
    r = propID(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && values(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(',' | ']' | '}' | '[' | '{' | space)
  static boolean recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ',' | ']' | '}' | '[' | '{' | space
  private static boolean recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, BRACK2);
    if (!r) r = consumeToken(b, BRACE2);
    if (!r) r = consumeToken(b, BRACK1);
    if (!r) r = consumeToken(b, BRACE1);
    if (!r) r = consumeToken(b, SPACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // elements
  static boolean root(PsiBuilder b, int l) {
    return elements(b, l + 1);
  }

  /* ********************************************************** */
  // string
  public static boolean values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, VALUES, r);
    return r;
  }

  final static Parser recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return recover(b, l + 1);
    }
  };
}
