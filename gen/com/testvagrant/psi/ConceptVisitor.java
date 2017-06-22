// This is a generated file. Not intended for manual editing.
package com.testvagrant.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class ConceptVisitor extends PsiElementVisitor {

  public void visitElementJson(@NotNull ConceptElementJson o) {
    visitPsiElement(o);
  }

  public void visitElementObject(@NotNull ConceptElementObject o) {
    visitElementJson(o);
  }

  public void visitElements(@NotNull ConceptElements o) {
    visitPsiElement(o);
  }

  public void visitElementsArray(@NotNull ConceptElementsArray o) {
    visitPsiElement(o);
  }

  public void visitElementsObject(@NotNull ConceptElementsObject o) {
    visitElementJson(o);
  }

  public void visitProp(@NotNull ConceptProp o) {
    visitPsiElement(o);
  }

  public void visitProp1(@NotNull ConceptProp1 o) {
    visitPsiElement(o);
  }

  public void visitProp2(@NotNull ConceptProp2 o) {
    visitPsiElement(o);
  }

  public void visitProp3(@NotNull ConceptProp3 o) {
    visitPsiElement(o);
  }

  public void visitValues(@NotNull ConceptValues o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
