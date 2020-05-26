package com.company;

import java.util.Arrays;

class Sentence {
    Object [] elements;

    Sentence(Object [] elements){
        this.elements = elements;
    }

    Object[] getWords(){
        return Arrays.stream(elements).filter(x -> x instanceof Word).toArray();
    }
}
