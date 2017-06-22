package com.testvagrant;

import com.intellij.lang.Language;


public class ElementsLanguage extends Language {
    public static final ElementsLanguage INSTANCE = new ElementsLanguage();

    private ElementsLanguage() {
        super("Elements");
    }

}
