package com.testvagrant.psi;

import com.intellij.psi.tree.IElementType;
import com.testvagrant.ElementsLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by krishnanand on 21/06/17.
 */
public class ElementsTokenType extends IElementType {

    public ElementsTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ElementsLanguage.INSTANCE);
    }
}
