package com.company;

public class Punctuation {
    private char data;

    Punctuation(char c){
        data = c;
    }

    @Override
    public String toString() {
        return Character.toString(data);
    }
}
