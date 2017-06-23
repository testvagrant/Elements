package com.testvagrant;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PsiElementPattern;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

import static com.intellij.patterns.PlatformPatterns.psiElement;


public class ElementsCompletionContributor extends CompletionContributor {
    public static  PsiElementPattern spacePattern = psiElement().withText(" ");
    public static  PsiElementPattern colonPattern = psiElement().withText(":");
    public static  PsiElementPattern colonAndCommaPattern = psiElement().afterLeaf("{",",");
    public static  PsiElementPattern identifierPattern = psiElement().withText("\"identifier\"");
    public static  PsiElementPattern waitForPattern = psiElement().withText("\"waitFor\"");

    private static final PsiElementPattern.Capture<PsiElement> AFTER_COLON_IN_PROPERTY = psiElement()
            .afterLeafSkipping(spacePattern, colonAndCommaPattern);
    private static final PsiElementPattern.Capture<PsiElement> AFTER_IDENTIFIER_IN_PROPERTY = psiElement()
            .afterLeafSkipping(colonPattern, identifierPattern);
    private static final PsiElementPattern.Capture<PsiElement> AFTER_WAITFOR_IN_PROPERTY = psiElement()
            .afterLeafSkipping(colonPattern, waitForPattern);



    public ElementsCompletionContributor() {
        extend(CompletionType.BASIC, AFTER_COLON_IN_PROPERTY, KeywordsCompletionProvider.INSTANCE);
        extend(CompletionType.BASIC, AFTER_IDENTIFIER_IN_PROPERTY, IdentifierCompletionProvider.INSTANCE);
        extend(CompletionType.BASIC, AFTER_WAITFOR_IN_PROPERTY, WaitForCompletionProvider.INSTANCE);
    }
    private static class KeywordsCompletionProvider extends CompletionProvider<CompletionParameters> {
        private static final KeywordsCompletionProvider INSTANCE = new KeywordsCompletionProvider();
        private static final String[] KEYWORDS = new String[]{"\"elements\"","\"elementName\"","\"identifier\"","\"value\"","\"waitFor\"", "\"referTo\""};

        @Override
        protected void addCompletions(@NotNull CompletionParameters parameters,
                                      ProcessingContext context,
                                      @NotNull CompletionResultSet result) {
            for (String keyword : KEYWORDS) {
                result.addElement(LookupElementBuilder.create(keyword).bold());
            }
        }
    }

    private static class IdentifierCompletionProvider extends CompletionProvider<CompletionParameters> {
        private static final IdentifierCompletionProvider INSTANCE = new IdentifierCompletionProvider();
        private static final String[] IDENTIFIERS = new String[]{"\"id\"","\"css\"","\"name\"","\"xpath\"","\"className\"","\"tagName\"","\"linkText\"","\"partialLinkText\""};

        @Override
        protected void addCompletions(@NotNull CompletionParameters parameters,
                                      ProcessingContext context,
                                      @NotNull CompletionResultSet result) {
            for (String keyword : IDENTIFIERS) {
                result.addElement(LookupElementBuilder.create(keyword).bold());
            }
        }
    }

    private static class WaitForCompletionProvider extends CompletionProvider<CompletionParameters> {
        private static final WaitForCompletionProvider INSTANCE = new WaitForCompletionProvider();
        private static final String[] WAITCONDITIONS = new String[]{"\"presence\"","\"visibility\"","\"invisibility\""};

        @Override
        protected void addCompletions(@NotNull CompletionParameters parameters,
                                      ProcessingContext context,
                                      @NotNull CompletionResultSet result) {
            for (String keyword : WAITCONDITIONS) {
                result.addElement(LookupElementBuilder.create(keyword).bold());
            }
        }
    }
}
