package com.ctco.stringTransformation.transformer;

public class StringTransformer {


    public String[] splitsString(String str)throws NullPointerException{

        return str.split("\\\n");

    }
    public StringBuilder transformsStringArray(String[] str){
        StringBuilder sb = new StringBuilder();
        for(String st:str){
           st=st.replace("\\","");
           sb.append(st);
        }
         return sb;
    }
}
