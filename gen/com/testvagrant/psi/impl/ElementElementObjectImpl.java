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

public class ElementElementObjectImpl extends ElementElementJsonImpl implements ElementElementObject {

  public ElementElementObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElementVisitor visitor) {
    visitor.visitElementObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElementVisitor) accept((ElementVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElementProp getProp() {
    return findChildByClass(ElementProp.class);
  }

  @Override
  @Nullable
  public ElementProp1 getProp1() {
    return findChildByClass(ElementProp1.class);
  }

  @Override
  @Nullable
  public ElementProp2 getProp2() {
    return findChildByClass(ElementProp2.class);
  }

  @Override
  @Nullable
  public ElementProp3 getProp3() {
    return findChildByClass(ElementProp3.class);
  }

}
