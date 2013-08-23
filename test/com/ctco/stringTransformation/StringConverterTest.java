package com.ctco.stringTransformation;

import com.ctco.stringTransformation.converter.StringConvert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringConverterTest {

    StringConvert stringConvert = new StringConvert();
    String[] splitedString;
    String valid = "abcdef";



    @Test
    public void shouldReturnEqualString() {

        assertEquals("abc\n\\def", stringConvert.transform("abc\n\\def"));
    }

    @Test
    public void shouldReturnSameString() {

        assertEquals("abc\\def", stringConvert.transform("abc\\def"));
    }

    @Test
    public void shouldReturnSameStringWrongRecord() {

        assertEquals("abc\ndef", stringConvert.transform("abc\ndef"));
    }

    @Test
    public void shouldConvertCorrectly() {

        assertEquals(valid, stringConvert.transform("ab\\\\\ncd\\\nef"));
    }

    @Test
    public void shouldReturnSameBecauseOneBackslashIsNotNeeded() {

        assertEquals("abncdef", stringConvert.transform("ab\\\\\\ncd\\\nef"));

    }

    @Test
    public void shouldReturnTrue() {

        assertTrue(stringConvert.isCorrectRecord("ab\\\\\\ncd\\\nef"));

    }
}
