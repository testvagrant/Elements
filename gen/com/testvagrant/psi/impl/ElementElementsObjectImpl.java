// This is a generated file. Not intended for manual editing.
package com.testvagrant.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.testvagrant.token.ElementTokenTypes.*;
import com.testvagrant.psi.*;

public class ElementElementsObjectImpl extends ElementElementJsonImpl implements ElementElementsObject {

  public ElementElementsObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElementVisitor visitor) {
    visitor.visitElementsObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElementVisitor) accept((ElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElementElementsArray getElementsArray() {
    return findChildByClass(ElementElementsArray.class);
  }

}
