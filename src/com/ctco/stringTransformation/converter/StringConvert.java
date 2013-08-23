package com.ctco.stringTransformation.converter;

import com.ctco.stringTransformation.transformer.StringTransformer;

public class StringConvert {

    StringTransformer stringTransformer = new StringTransformer();



    public String transform(String inputString) {

        if (isCorrectRecord(inputString)) {
            return stringTransformer.transformsStringArray(stringTransformer.splitsString(inputString)).toString();
        } else {
            return inputString;
        }

    }

    public boolean isCorrectRecord(String inputString) {

        return inputString.contains("\\\n");

    }

}