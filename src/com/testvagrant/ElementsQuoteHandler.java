package com.testvagrant;

import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler;
import com.intellij.psi.tree.TokenSet;
import com.testvagrant.token.ElementTokenTypes;

/**
 * Created by krishnanand on 22/06/17.
 */
public class ElementsQuoteHandler extends SimpleTokenSetQuoteHandler {
    public ElementsQuoteHandler() {
        super(TokenSet.create(ElementTokenTypes.STRING));
    }
}
