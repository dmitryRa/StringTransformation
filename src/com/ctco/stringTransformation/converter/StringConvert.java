package com.ctco.stringTransformation.converter;

import com.ctco.stringTransformation.transformer.StringTransformer;

public class StringConvert {

    StringTransformer stringTransformer = new StringTransformer();



    public String transform(String inputString) {

        String [] splitedString = stringTransformer.splitString(inputString);
        if (isCorrectRecord(inputString)) {
            return stringTransformer.transformsStringArray(splitedString).toString();
        } else {
            return inputString;
        }

    }

    public boolean isCorrectRecord(String inputString) {

        return inputString.contains("\\\n");

    }

}