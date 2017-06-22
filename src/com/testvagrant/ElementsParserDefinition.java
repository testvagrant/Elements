package com.testvagrant;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.testvagrant.parser.ElementsParser;
import com.testvagrant.psi.ElementsFile;
import com.testvagrant.token.ElementTokenTypes;
import org.jetbrains.annotations.NotNull;

/**
 * Created by krishnanand on 21/06/17.
 */
public class ElementsParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(ElementsLanguage.INSTANCE);
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new ElementsLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new ElementsParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.create(ElementTokenTypes.STRING);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode astNode) {
        return ElementTokenTypes.Factory.createElement(astNode);
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new ElementsFile(fileViewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
        return SpaceRequirements.MAY;
    }
}
