package com.ctco.stringTransformation;

import com.ctco.stringTransformation.converter.StringConvert;
import com.ctco.stringTransformation.transformer.StringTransformer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class StringTransformerTest {

    String valid = "abcdef";
    StringTransformer transformer = new StringTransformer();
    String[] splitedString;

    @Test
    public void shouldReturnEqualStringWithOutAnyChange() {
        splitedString = transformer.splitsString("abcdef");
        assertEquals(valid, transformer.transformsStringArray(splitedString).toString());

    }

    @Test
    public void shouldTransformStringCorrectlyAndRemoveTwoSubString() {
        splitedString = transformer.splitsString("ab\\\ncd\\\nef");
        assertEquals(valid, transformer.transformsStringArray(splitedString).toString());

    }

    @Test
    public void shouldTransformStringCorrectlyAndRemoveOneSubString() {
        splitedString = transformer.splitsString("abc\\\ndef");
        assertEquals(valid, transformer.transformsStringArray(splitedString).toString());
    }


}


