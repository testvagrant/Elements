package com.testvagrant;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PsiElementPattern;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

import static com.intellij.patterns.PlatformPatterns.psiElement;


public class ElementsCompletionContributor extends CompletionContributor {
    public static  PsiElementPattern pattern = psiElement().withText(" ");
    public static  PsiElementPattern pattern1 = psiElement().afterLeaf("{",",");
    private static final PsiElementPattern.Capture<PsiElement> AFTER_COLON_IN_PROPERTY = psiElement()
            .afterLeafSkipping(pattern,pattern1);
    public ElementsCompletionContributor() {
        extend(CompletionType.BASIC, AFTER_COLON_IN_PROPERTY, MyKeywordsCompletionProvider.INSTANCE);
    }
    private static class MyKeywordsCompletionProvider extends CompletionProvider<CompletionParameters> {
        private static final MyKeywordsCompletionProvider INSTANCE = new MyKeywordsCompletionProvider();
        private static final String[] KEYWORDS = new String[]{"elements","name","identifier","referTo","value","waitFor"};

        @Override
        protected void addCompletions(@NotNull CompletionParameters parameters,
                                      ProcessingContext context,
                                      @NotNull CompletionResultSet result) {
            for (String keyword : KEYWORDS) {
                result.addElement(LookupElementBuilder.create(keyword).bold());
            }
        }
    }
}
