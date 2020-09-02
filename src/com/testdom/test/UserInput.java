package com.testdom.test;

/**
 * Created by dineshs on 6/5/2019.
 */

public class UserInput {

    public static class TextInput {
        String currentVal = "";

        public void add(char c) {
            currentVal = currentVal + c;
        }

        public String getValue() {
            return currentVal;
        }

    }

    public static class NumericInput extends TextInput{

        @Override
        public void add(char c) {
            try {
                currentVal = currentVal + Integer.parseInt(String.valueOf(c));
            }catch (Exception e){

            }
        }

    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}