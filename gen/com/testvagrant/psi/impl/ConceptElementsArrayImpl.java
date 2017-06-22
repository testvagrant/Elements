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

public class ConceptElementsArrayImpl extends ASTWrapperPsiElement implements ConceptElementsArray {

  public ConceptElementsArrayImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ConceptVisitor visitor) {
    visitor.visitElementsArray(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ConceptVisitor) accept((ConceptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ConceptElementJson> getElementJsonList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ConceptElementJson.class);
  }

}
