package com.testvagrant;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.testvagrant.token.ElementTokenTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by krishnanand on 21/06/17.
 */
public class ElementsSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("ELEMENT_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("ELEMENT_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("ELEMENT_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("ELEMENT_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("ELEMENT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey COMMA =
            createTextAttributesKey("ELEMENT_BAD_CHARACTER", DefaultLanguageHighlighterColors.COMMA);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ElementsLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(ElementTokenTypes.ELEMENTVALUE) || tokenType.equals(ElementTokenTypes.NAME) || tokenType.equals(ElementTokenTypes.IDENTIFIER) || tokenType.equals(ElementTokenTypes.VALUE) || tokenType.equals(ElementTokenTypes.REFERTO) || tokenType.equals(ElementTokenTypes.WAITFOR) ) {
            return KEY_KEYS;
        } else if (tokenType.equals(ElementTokenTypes.STRING)) {
            return VALUE_KEYS;
        } else if(tokenType.equals(ElementTokenTypes.COLON)) {
            return SEPARATOR_KEYS;
        } else if(tokenType.equals(ElementTokenTypes.COMMA)) {
            return COMMMA_KEYS;
        }
        return EMPTY_KEYS;
    }
}
