// This is a generated file. Not intended for manual editing.
package com.testvagrant.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.testvagrant.token.ElementTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.testvagrant.psi.*;

public class ElementPropValueImpl extends ASTWrapperPsiElement implements ElementPropValue {

  public ElementPropValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElementVisitor visitor) {
    visitor.visitPropValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElementVisitor) accept((ElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElementPropID getPropID() {
    return findNotNullChildByClass(ElementPropID.class);
  }

  @Override
  @NotNull
  public ElementValues getValues() {
    return findNotNullChildByClass(ElementValues.class);
  }

}
