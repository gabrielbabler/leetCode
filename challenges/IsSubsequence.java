package challenges;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class IsSubsequence {

    public static void main(String[] args) {
        final boolean subsequence = isSubsequence("abc", "ahbgdc");
        System.out.println(subsequence);
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) {
            return false;
        }

        if(s.length() == t.length()) {
            return s.equals(t);
        }

        if(s.length() == 0) {
            return true;
        }

        final char[] sChars = s.toCharArray();
        final char[] tChars = t.toCharArray();

        int sIndex = 0;

        for(int i=0; i < tChars.length; i++) {
            if(sChars[sIndex] == tChars[i]) {
                sIndex++;
                if(sIndex == sChars.length) {
                    return true;
                }
            }
        }
        return false;
    }

//    Queue<Character> queue = new ArrayDeque<>();
//
//        for(final char sChar : sChars) {
//        queue.add(sChar);
//    }
//
//        for(int i=0; i < tChars.length; i++) {
//        if(queue.isEmpty()) {
//            return true;
//        }
//
//        if(queue.peek() == tChars[i]){
//            queue.poll();
//        }
//    }
//
//        return queue.isEmpty();
}
