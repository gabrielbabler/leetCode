package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsomorphicStrings {

    public static void main(String[] args) {
        final boolean isomorphic = isIsomorphic("badc", "baba");
        System.out.println(isomorphic);
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> letters = new HashMap<>();

        for(int i=0; i < s.length(); i++) {
            final char letterS = s.charAt(i);
            final char letterT = t.charAt(i);

            if(letters.containsKey(letterS)) {
                final char value = letters.get(letterS);
                if(!Objects.equals(value, letterT)) {
                    return false;
                }
            } else if(!letters.containsValue(letterT)) {
                letters.put(letterS, letterT);
            } else {
                return false;
            }
        }
        return true;
    }
}