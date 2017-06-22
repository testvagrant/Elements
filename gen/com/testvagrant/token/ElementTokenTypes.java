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
  IElementType ELEMENT_OBJECT_1 = new ElementsElementType("ELEMENT_OBJECT_1");
  IElementType PROP = new ElementsElementType("PROP");
  IElementType PROP_1 = new ElementsElementType("PROP_1");
  IElementType PROP_2 = new ElementsElementType("PROP_2");
  IElementType PROP_3 = new ElementsElementType("PROP_3");
  IElementType PROP_4 = new ElementsElementType("PROP_4");
  IElementType PROP_6 = new ElementsElementType("PROP_6");
  IElementType VALUES = new ElementsElementType("VALUES");

  IElementType BRACE1 = new ElementsTokenType("{");
  IElementType BRACE2 = new ElementsTokenType("}");
  IElementType BRACK1 = new ElementsTokenType("[");
  IElementType BRACK2 = new ElementsTokenType("]");
  IElementType COLON = new ElementsTokenType(":");
  IElementType COMMA = new ElementsTokenType(",");
  IElementType ELEMENTVALUE = new ElementsTokenType("elements");
  IElementType ID = new ElementsTokenType("id");
  IElementType IDENTIFIER = new ElementsTokenType("identifier");
  IElementType NAME = new ElementsTokenType("name");
  IElementType NUMBER = new ElementsTokenType("number");
  IElementType QUOTE = new ElementsTokenType("quote");
  IElementType REFERTO = new ElementsTokenType("referTo");
  IElementType SPACE = new ElementsTokenType("space");
  IElementType STRING = new ElementsTokenType("string");
  IElementType VALUE = new ElementsTokenType("value");
  IElementType WAITFOR = new ElementsTokenType("waitFor");

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
      else if (type == ELEMENT_OBJECT_1) {
        return new ElementElementObject1Impl(node);
      }
      else if (type == PROP) {
        return new ElementPropImpl(node);
      }
      else if (type == PROP_1) {
        return new ElementProp1Impl(node);
      }
      else if (type == PROP_2) {
        return new ElementProp2Impl(node);
      }
      else if (type == PROP_3) {
        return new ElementProp3Impl(node);
      }
      else if (type == PROP_4) {
        return new ElementProp4Impl(node);
      }
      else if (type == PROP_6) {
        return new ElementProp6Impl(node);
      }
      else if (type == VALUES) {
        return new ElementValuesImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
