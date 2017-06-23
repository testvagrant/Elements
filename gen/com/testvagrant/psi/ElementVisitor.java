// This is a generated file. Not intended for manual editing.
package com.testvagrant.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class ElementVisitor extends PsiElementVisitor {

  public void visitElementJson(@NotNull ElementElementJson o) {
    visitPsiElement(o);
  }

  public void visitElementObject(@NotNull ElementElementObject o) {
    visitElementJson(o);
  }

  public void visitElements(@NotNull ElementElements o) {
    visitPsiElement(o);
  }

  public void visitElementsArray(@NotNull ElementElementsArray o) {
    visitPsiElement(o);
  }

  public void visitElementsObject(@NotNull ElementElementsObject o) {
    visitElementJson(o);
  }

  public void visitPropID(@NotNull ElementPropID o) {
    visitPsiElement(o);
  }

  public void visitPropValue(@NotNull ElementPropValue o) {
    visitPsiElement(o);
  }

  public void visitValues(@NotNull ElementValues o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
