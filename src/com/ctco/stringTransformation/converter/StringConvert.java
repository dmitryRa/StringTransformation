package com.ctco.stringTransformation.converter;

import com.ctco.stringTransformation.transformer.StringTransformer;

public class StringConvert {

    StringTransformer stringTransformer = new StringTransformer();

    private String inputString;

    public StringConvert(String inputString) {
        this.inputString = inputString;
    }

    public String transform() {

        if (isCorrectRecord()) {
            return stringTransformer.transformsStringArray(stringTransformer.splitsString(inputString)).toString();
        } else {
            return this.inputString;
        }

    }

    public boolean isCorrectRecord() {

        return this.inputString.contains("\\\n");

    }

}