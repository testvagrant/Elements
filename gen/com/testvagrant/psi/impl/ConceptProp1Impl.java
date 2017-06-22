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

public class ConceptProp1Impl extends ASTWrapperPsiElement implements ConceptProp1 {

  public ConceptProp1Impl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ConceptVisitor visitor) {
    visitor.visitProp1(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ConceptVisitor) accept((ConceptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ConceptElementsArray getElementsArray() {
    return findChildByClass(ConceptElementsArray.class);
  }

  @Override
  @Nullable
  public ConceptValues getValues() {
    return findChildByClass(ConceptValues.class);
  }

}
