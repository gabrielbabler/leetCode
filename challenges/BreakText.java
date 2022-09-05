package challenges;

public class BreakText {

    public static void main(String[] args) {
        String text = "In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler.";

        final String test = breakText(text);

        System.out.println(test);
    }

    public static String breakText(String text) {
        String[] words = text.split(" ");
        int limit = 40;

        StringBuilder sb = new StringBuilder();

        if(words[0].length() <= limit) {
            sb.append(words[0]);
            limit -= words[0].length();
        }

        for(int i=1; i < words.length; i++) {
            final int length = words[i].length();
            if(length + 1 <= limit) {
                sb.append(" ").append(words[i]);
                limit -= length + 1;
            }
            else {
                sb.append("\n").append(words[i]);
                limit = 40 - length;
            }
        }

        return sb.toString();
    }
}
