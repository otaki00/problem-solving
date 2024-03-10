/*
 * 
    * It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.

    Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.

    Input
    The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.

    Output
    Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.
 */



package Codeforce.Beautiful_Year;

public class WithJava {
    

    public static void main(String[] args) {
        
        // read input
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int y = sc.nextInt();
        sc.close();
        if(y < 1000 && y > 9000){
            System.exit(0);
        }
        int a = y + 1;
        while(true){
            String s = Integer.toString(a);
            if(s.charAt(0) != s.charAt(1) && s.charAt(0) != s.charAt(2) && s.charAt(0) != s.charAt(3) && s.charAt(1) != s.charAt(2) && s.charAt(1) != s.charAt(3) && s.charAt(2) != s.charAt(3)){
                System.out.println(a);
                break;
            }
            a++;
        }
    }
}
