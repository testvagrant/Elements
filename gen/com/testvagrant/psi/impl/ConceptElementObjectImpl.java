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

public class ConceptElementObjectImpl extends ConceptElementJsonImpl implements ConceptElementObject {

  public ConceptElementObjectImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ConceptVisitor visitor) {
    visitor.visitElementObject(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ConceptVisitor) accept((ConceptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ConceptProp getProp() {
    return findChildByClass(ConceptProp.class);
  }

  @Override
  @Nullable
  public ConceptProp1 getProp1() {
    return findChildByClass(ConceptProp1.class);
  }

  @Override
  @Nullable
  public ConceptProp2 getProp2() {
    return findChildByClass(ConceptProp2.class);
  }

  @Override
  @Nullable
  public ConceptProp3 getProp3() {
    return findChildByClass(ConceptProp3.class);
  }

}
