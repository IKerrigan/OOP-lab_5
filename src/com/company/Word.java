package com.company;

class Word {
    private Letter[] data;

    Word(Letter[] letters){
        data = letters;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for(Letter letter : data) {
            builder.append(letter);
        }

        return builder.toString();
    }
}
