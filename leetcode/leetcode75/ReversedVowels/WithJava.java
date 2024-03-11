package leetcode.leetcode75.ReversedVowels;

public class WithJava {

    public static void main(String[] args) {
        
        String s = "hello";
        System.out.println(reverseVowels(s));
    }


    public static String reverseVowels(String s) {

        int pointerAtStart = 0 ; 
        int pointerAtEnd = s.length()-1;
        char[] arr = s.toCharArray();

        while ( pointerAtEnd > pointerAtStart ) {
            if ( isVowel(s.charAt(pointerAtStart)) && isVowel(s.charAt(pointerAtEnd)) ) {
                s = swap(arr, s, pointerAtStart, pointerAtEnd);
                pointerAtStart++;
                pointerAtEnd--;
            } else if ( isVowel(s.charAt(pointerAtStart)) ) {
                pointerAtEnd--;
            } else if ( isVowel(s.charAt(pointerAtEnd)) ) {
                pointerAtStart++;
            } else {
                pointerAtStart++;
                pointerAtEnd--;
            }
            
        }
        return s;
    }
    

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ;
    }

    public static String swap(char[] arr, String s, int i, int j) {
        
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
}
