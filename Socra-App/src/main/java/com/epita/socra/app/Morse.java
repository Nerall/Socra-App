package com.epita.socra.app;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    private static Map<Character, String> toMorseMap = new HashMap<>();
    private static Map<String, Character> fromMorseMap = new HashMap<>();

    static {
        toMorseMap.put('0', "_ _ _ _ _");
        toMorseMap.put('1', ". _ _ _ _");
        toMorseMap.put('2', ". . _ _ _");
        toMorseMap.put('3', ". . . _ _");
        toMorseMap.put('4', ". . . . _");
        toMorseMap.put('5', ". . . . .");
        toMorseMap.put('6', "_ . . . .");
        toMorseMap.put('7', "_ _ . . .");
        toMorseMap.put('8', "_ _ _ . .");
        toMorseMap.put('9', "_ _ _ _ .");

        fromMorseMap.put("_ _ _ _ _", '0');
        fromMorseMap.put(". _ _ _ _", '1');
        fromMorseMap.put(". . _ _ _", '2');
        fromMorseMap.put(". . . _ _", '3');
        fromMorseMap.put(". . . . _", '4');
        fromMorseMap.put(". . . . .", '5');
        fromMorseMap.put("_ . . . .", '6');
        fromMorseMap.put("_ _ . . .", '7');
        fromMorseMap.put("_ _ _ . .", '8');
        fromMorseMap.put("_ _ _ _ .", '9');
    }

    static String toMorse(String number){
        String result = toMorseMap.get(number.charAt(0));
        for (int i = 1; i < number.length(); i++) {
            result = result.concat(' ' + toMorseMap.get(number.charAt(i)));
        }

        return result;
    }

    static String fromMorse(String word){
        StringBuilder result = new StringBuilder("" + fromMorseMap.get(word.substring(0, 9)));
        for (int i = 10; i < word.length(); i += 10) {
            result.append(fromMorseMap.get(word.substring(i, i + 9)));
        }

        return result.toString();
    }
}
