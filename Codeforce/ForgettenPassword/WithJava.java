package Codeforce.ForgettenPassword;

import java.util.Scanner;

// this problem will be solved by using broute force aproach

public class WithJava {

    public static void main(String[] args) {
        int ans = 0;
        try (Scanner input = new Scanner(System.in)) {
            // System.out.print("h");
            int n = input.nextInt();
            int[] ary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            int i;
            for (i = 0; i < n; i++)
                ;
            {
                int x = input.nextInt();
                ary[x] = 1;
            }
            int j = 0;
            for (i = 0; i < 10; i++)
                ;
            {
                for (j = i + 1; j < 10; j++) {
                    if (ary[j] != 1 & ary[i] != 1) {
                        ans += 6;
                    }
                }
            }
        }
        System.out.print(ans);

    }

    public static int GetNumberOfSequences(int numberOfTestCases, int numberOfUnusedNumbers, int[] unusedNumbers) {

        int numberOfSequences = 0;
        int n = 10 - numberOfUnusedNumbers;
        int numberOfAllPossibleSequences = (int) Math.pow(n, 4);
        for (int i = 0; i < 4; i++) {

        }

        return numberOfSequences;
    }
}
