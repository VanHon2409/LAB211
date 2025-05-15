/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public class WordCharacterCounter {
    private String input;

    public WordCharacterCounter(String input) {
        this.input = input;
    }

    Map<String, Integer> countWords() {
        Map<String, Integer> wordcount = new HashMap<>();
        String[] words = input.toLowerCase().split("\\s+");
        for (String word : words) {

            wordcount.put(word, wordcount.getOrDefault(words, 0) + 1);
        }
        return wordcount;

    }

    Map<Character, Integer> countCharacter() {
        Map<Character, Integer> charcount = new HashMap<>();
        char[] charac = input.toLowerCase().toCharArray();
        for (char c : charac) {
            if (c != ' ') {
                charcount.put(c, charcount.getOrDefault(c, 0) + 1);
            }
        }

        return charcount;
    }
}
