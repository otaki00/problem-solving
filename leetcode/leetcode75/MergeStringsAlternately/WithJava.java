// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string. 

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r


package MergeStringsAlternately;
import java.util.logging.Logger;

public class WithJava {
    private static final Logger LOGGER = Logger.getLogger(WithJava.class.getName());

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "p";
        String result = mergeAlternately(word1, word2);
        LOGGER.info(result);
    }

    public static String mergeAlternately(String word1, String word2){
        if(word1 == null || word1.length() == 0 && word2 == null || word2.length() == 0)
            return null;
        if(word1.length() == 0)
            return word2;
        if(word2.length() == 0)
            return word1;
        // get the lenght of the two words 
        int word1Length = word1.length();
        int word2Length = word2.length();

        StringBuilder result = new StringBuilder();
        // then loop through them to make the result
        int i = 0;
        int j = 0;
        while (i < word1Length && j < word2Length){
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;j++;
        }
        if(i < word1Length){
            result.append(word1.substring(i));
        }
        if(j < word2Length){
            result.append(word2.substring(j));
        }
        return result.toString();
    }
}