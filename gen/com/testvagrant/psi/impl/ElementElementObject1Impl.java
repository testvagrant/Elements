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

public class ElementElementObject1Impl extends ElementElementJsonImpl implements ElementElementObject1 {

  public ElementElementObject1Impl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElementVisitor visitor) {
    visitor.visitElementObject1(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElementVisitor) accept((ElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElementProp4 getProp4() {
    return findChildByClass(ElementProp4.class);
  }

  @Override
  @Nullable
  public ElementProp6 getProp6() {
    return findChildByClass(ElementProp6.class);
  }

}
