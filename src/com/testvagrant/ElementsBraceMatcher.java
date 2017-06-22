package com.testvagrant;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.testvagrant.token.ElementTokenTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by krishnanand on 22/06/17.
 */
public class ElementsBraceMatcher implements PairedBraceMatcher {
    private static BracePair[] PAIRS = {
            new BracePair(ElementTokenTypes.BRACE1, ElementTokenTypes.BRACE2, true),
            new BracePair(ElementTokenTypes.BRACK1, ElementTokenTypes.BRACK2, true),
            new BracePair(ElementTokenTypes.QUOTE,ElementTokenTypes.QUOTE,true)
    };

    @NotNull
    @Override
    public BracePair[] getPairs() {
        return PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return openingBraceOffset;
    }
}
