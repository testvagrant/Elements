package com.testvagrant;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by krishnanand on 21/06/17.
 */
public class ElementsLexerAdapter extends FlexAdapter {

    public ElementsLexerAdapter() {
        super(new _ElementsLexer((Reader)null));
    }
}
