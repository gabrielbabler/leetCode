package challenges;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

    public static void main(String[] args) {
        final int mcmxciv = romanToInt("LVIII");
        System.out.println(mcmxciv);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        int aux = 0;

        for(int i=0; i<s.length(); i++) {
            aux += romans.get(s.charAt(i));
        }

        return aux;

    }

    //    public static int romanToInt(String s) {
    //        Map<String, Integer> romans = new HashMap<>();
    //        romans.put("I", 1);
    //        romans.put("V", 5);
    //        romans.put("X", 10);
    //        romans.put("L", 50);
    //        romans.put("C", 100);
    //        romans.put("D", 500);
    //        romans.put("M", 1000);
    //        romans.put("IV", 4);
    //        romans.put("IX", 9);
    //        romans.put("XL", 40);
    //        romans.put("XC", 90);
    //        romans.put("CD", 400);
    //        romans.put("CM", 900);
    //
    ////        int aux = 0;
    ////        while (s.length() > 1) {
    ////            if(romans.containsKey(s.substring(s.length() - 2))) {
    ////                aux += romans.get(s.substring(s.length() - 2));
    ////                s = s.substring(0, s.length() - 2);
    ////            } else {
    ////                aux += romans.get(s.substring(s.length() - 1));
    ////                s = s.substring(0, s.length() - 1);
    ////            }
    ////        }
    ////        if(s.length() == 1) {
    ////            aux += romans.get(s);
    ////        }
    //        return aux;
    //    }

    /**
     * int res = 0;
     *         int prevDigit = Integer.MIN_VALUE;
     *         for(int i=s.length()-1;i>=0;i--) {
     *             int currDigit =getNum(s.charAt(i));
     *             if (currDigit < prevDigit) {
     *                 res -= currDigit;
     *             } else {
     *                 res += currDigit;
     *             }
     *             prevDigit = currDigit;
     *         }
     *
     *         return res;
     *     }
     *
     *     private int getNum(char c) {
     *         if (c == 'I') return 1;
     *         if (c == 'V') return 5;
     *         if (c == 'X') return 10;
     *         if (c == 'L') return 50;
     *         if (c == 'C') return 100;
     *         if (c == 'D') return 500;
     *         if (c == 'M') return 1000;
     *         return 0;
     *     }
     */
}
