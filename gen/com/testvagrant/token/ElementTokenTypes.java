// This is a generated file. Not intended for manual editing.
package com.testvagrant.token;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.testvagrant.psi.ElementsElementType;
import com.testvagrant.psi.ElementsTokenType;
import com.testvagrant.psi.impl.*;

public interface ElementTokenTypes {

  IElementType ELEMENTS = new ElementsElementType("ELEMENTS");
  IElementType ELEMENTS_ARRAY = new ElementsElementType("ELEMENTS_ARRAY");
  IElementType ELEMENTS_OBJECT = new ElementsElementType("ELEMENTS_OBJECT");
  IElementType ELEMENT_JSON = new ElementsElementType("ELEMENT_JSON");
  IElementType ELEMENT_OBJECT = new ElementsElementType("ELEMENT_OBJECT");
  IElementType PROP_ID = new ElementsElementType("PROP_ID");
  IElementType PROP_VALUE = new ElementsElementType("PROP_VALUE");
  IElementType VALUES = new ElementsElementType("VALUES");

  IElementType BRACE1 = new ElementsTokenType("{");
  IElementType BRACE2 = new ElementsTokenType("}");
  IElementType BRACK1 = new ElementsTokenType("[");
  IElementType BRACK2 = new ElementsTokenType("]");
  IElementType COLON = new ElementsTokenType(":");
  IElementType COMMA = new ElementsTokenType(",");
  IElementType ELEMENTID = new ElementsTokenType("\"identifier\"");
  IElementType ELEMENTNAME = new ElementsTokenType("\"elementName\"");
  IElementType ELEMENTREFERENCE = new ElementsTokenType("\"referTo\"");
  IElementType ELEMENTVAL = new ElementsTokenType("\"value\"");
  IElementType ELEMENTVALUE = new ElementsTokenType("\"elements\"");
  IElementType ELEMENTWAITFOR = new ElementsTokenType("\"waitFor\"");
  IElementType ID = new ElementsTokenType("id");
  IElementType NUMBER = new ElementsTokenType("number");
  IElementType QUOTE = new ElementsTokenType("quote");
  IElementType SPACE = new ElementsTokenType("space");
  IElementType STRING = new ElementsTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ELEMENTS) {
        return new ElementElementsImpl(node);
      }
      else if (type == ELEMENTS_ARRAY) {
        return new ElementElementsArrayImpl(node);
      }
      else if (type == ELEMENTS_OBJECT) {
        return new ElementElementsObjectImpl(node);
      }
      else if (type == ELEMENT_OBJECT) {
        return new ElementElementObjectImpl(node);
      }
      else if (type == PROP_ID) {
        return new ElementPropIDImpl(node);
      }
      else if (type == PROP_VALUE) {
        return new ElementPropValueImpl(node);
      }
      else if (type == VALUES) {
        return new ElementValuesImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
