/*
 * 
    * ernary numeric notation is quite popular in Berland. To telegraph the ternary number the Borze alphabet is used. Digit 0 is transmitted as «.», 1 as «-.» and 2 as «--». You are to decode the Borze code, i.e. to find out the ternary number given its representation in Borze alphabet.

    Input
    The first line contains a number in Borze code. The length of the string is between 1 and 200 characters. It's guaranteed that the given string is a valid Borze code of some ternary number (this number can have leading zeroes).

    Output
    Output the decoded ternary number. It can have leading zeroes.
 */


package Codeforce.Broze;

public class WithJava {
    public static void main(String[] args) {

        // read input
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.next();
        sc.close();
        if(s.length() > 200 && s.length() < 1){
            System.exit(0);
        }
        String a = "";
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '.'){
                a += "0";
                i++;
            }else if(s.charAt(i) == '-' && s.charAt(i+1) == '.'){
                a += "1";
                i += 2;
            }else if(s.charAt(i) == '-' && s.charAt(i+1) == '-'){
                a += "2";
                i += 2;
            }
        }
        System.out.println(a);

    }
}
