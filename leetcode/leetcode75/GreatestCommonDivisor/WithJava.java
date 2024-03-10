// For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.


// Example 1:

// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"

package GreatestCommonDivisor;

public class WithJava {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2){
        
        if(str1.length() < str2.length()){
            return gcdOfStrings(str2, str1);
        }
        else if(!str1.startsWith(str2)){
            return "";
        }
        else if(str2.isEmpty()){
            return str1;
        }
        else{
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }
}
