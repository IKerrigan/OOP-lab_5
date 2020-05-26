package com.company;

public class Main {
    public static void main(String[] args) {
        Letter letterA =  new Letter('a');
        Letter letterB =  new Letter('b');
        Letter letterC =  new Letter('c');
        Letter letterD =  new Letter('d');
        Letter letterE =  new Letter('e');

        Punctuation space = new Punctuation(' ');
        Punctuation coma = new Punctuation(',');
        Punctuation dot = new Punctuation('.');

        Letter[] letters1 = {letterC,letterD,letterA,letterB,letterA,letterB};
        Word word1 = new Word(letters1);

        Letter[] letters2 = {letterA,letterB,letterE,letterD};
        Word word2 = new Word(letters2);

        Object[] elements1 = {word1, space, word2, dot};
        Sentence sentence1 = new Sentence(elements1);

        Object[] elements2 = {word2, coma, word1, dot};
        Sentence sentence2 = new Sentence(elements2);

        Sentence[] sentences = {sentence1,sentence2};
        Text text = new Text(sentences);

        System.out.println(text.sortByStringEntries("ab"));
    }
}
