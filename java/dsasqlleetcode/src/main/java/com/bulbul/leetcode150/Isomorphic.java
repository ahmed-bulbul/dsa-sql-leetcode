package com.bulbul.leetcode150;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;
        Map<Character, Character> charMappingMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!charMappingMap.containsKey(original)) {
                if (!charMappingMap.containsValue(replacement)) {
                    charMappingMap.put(original, replacement);
                } else {
                    return false;
                }
            } else {
                char mappedCharacter = charMappingMap.get(original);
                if (mappedCharacter != replacement) {
                    return false;
                }
            }

        }
        return true;
    }
}
