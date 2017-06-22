package com.testvagrant;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by krishnanand on 21/06/17.
 */
public class ElementsFileType extends LanguageFileType {

    public static final ElementsFileType INSTANCE = new ElementsFileType();

    protected ElementsFileType() {
        super(ElementsLanguage.INSTANCE);
    }


    @NotNull
    @Override
    public String getName() {
        return "Elements file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Elements Language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "elements";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ElementsIcons.FILE;
    }
}
