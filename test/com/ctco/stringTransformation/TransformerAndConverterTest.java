package com.ctco.stringTransformation;

import com.ctco.stringTransformation.converter.StringConvert;
import com.ctco.stringTransformation.transformer.StringTransformer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class TransformerAndConverterTest {

    String valid = "abcdef";
    StringTransformer transformer = new StringTransformer();

    @Test
    public void shouldReturnEqualStringWithOutAnyChange() {

        assertEquals(valid, transformer.transformsStringArray(transformer.splitsString("abcdef")).toString());

    }

    @Test
    public void shouldTransformStringCorrectlyAndRemoveTwoSubString() throws Exception {

        assertEquals(valid, transformer.transformsStringArray(transformer.splitsString("ab\\\ncd\\\nef")).toString());

    }

    @Test
    public void shouldTransformStringCorrectlyAndRemoveOneSubString() {

        assertEquals(valid, transformer.transformsStringArray(transformer.splitsString("abc\\\ndef")).toString());
    }

    @Test
    public void shouldReturnEqualString() throws Exception {

        StringConvert stringConvert = new StringConvert("abc\n\\def");
        assertEquals("abc\n\\def", stringConvert.transform());
    }

    @Test
    public void shouldReturnSameString() {

        StringConvert stringConvert = new StringConvert("abc\\def");
        assertEquals("abc\\def", stringConvert.transform());
    }
    @Test
    public void shouldReturnSameStringWrongRecord() {

        StringConvert stringConvert = new StringConvert("abc\ndef");
        assertEquals("abc\ndef", stringConvert.transform());
    }
    @Test
    public void shouldConvertCorrectly() {

        StringConvert stringConvert = new StringConvert("ab\\\\\ncd\\\nef");
        assertEquals(valid, stringConvert.transform());
    }

    @Test
    public void shouldReturnSameBecauseOneBackslashIsNotNeeded() throws Exception {

        StringConvert stringConvert = new StringConvert("ab\\\\\\ncd\\\nef");
        assertEquals("abncdef", stringConvert.transform());

    }
    @Test
    public void shouldReturnTrue() throws Exception {

        StringConvert stringConvert = new StringConvert("ab\\\\\\ncd\\\nef");
        assertTrue(stringConvert.isCorrectRecord());

    }
}


