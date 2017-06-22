package com.testvagrant.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.testvagrant.ElementsFileType;
import com.testvagrant.ElementsLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by krishnanand on 21/06/17.
 */
public class ElementsFile extends PsiFileBase {

    public ElementsFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ElementsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ElementsFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Elements File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
