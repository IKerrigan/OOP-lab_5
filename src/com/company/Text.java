package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Comparator;
import java.util.Arrays;

class Text {
    private Sentence[] data;

    Text(Sentence[] text){
        data = text;
    }

    private static int countMatches(Pattern pattern, String string)
    {
        Matcher matcher = pattern.matcher(string);

        int position = 0;
        int count = 0;
        while (matcher.find(position))
        {
            position = matcher.start() + 1;
            count++;
        }

        return count;
    }


    StringBuffer sortByStringEntries(String entry){
        Pattern pattern = Pattern.compile(entry);
        Object[] elements = this.getAllElements().toArray();

        ArrayList<Word> wordsArrayList = new ArrayList<>();
        for(Object element : elements){
            if(element instanceof Word) wordsArrayList.add((Word) element);
        }
        Object[] wordsArray = wordsArrayList.toArray();


        Arrays.sort(wordsArray, new Comparator<Object>() {
            public int compare(Object currentElement, Object nextElement) {
                return Integer.compare(
                        Text.countMatches(pattern, nextElement.toString()),
                        Text.countMatches(pattern, currentElement.toString())
                );
            }
        });

        int wordNumber = 0;
        for (int i=0; i < elements.length; i++) {
            if(!(elements[i] instanceof Word)) continue;
            elements[i] = wordsArray[wordNumber];
            wordNumber++;
        }

        StringBuffer result = new StringBuffer();
        for(Object element : elements) {
            result.append(element.toString());
        }
        return result;
    }

    StringBuffer sortByCharacterEntries(Character ch){
        return sortByStringEntries(Character.toString(ch));
    }

    private ArrayList getAllElements() {
        ArrayList<Object> text = new ArrayList<>();

        for(Sentence sentence : data){
            text.addAll(Arrays.asList(sentence.elements));
        }

        return text;
    }
}
