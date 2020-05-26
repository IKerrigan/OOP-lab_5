package com.company;

class Letter {
    private char data;

    Letter(char c){
        data = c;
    }

    @Override
    public String toString() {
        return Character.toString(data);
    }
}
