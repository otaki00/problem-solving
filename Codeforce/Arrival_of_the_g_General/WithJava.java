// A Ministry for Defense sent a general to inspect the Super Secret Military Squad under the command of the Colonel SuperDuper. Having learned the news, the colonel ordered to all n squad soldiers to line up on the parade ground.

// By the military charter the soldiers should stand in the order of non-increasing of their height. But as there's virtually no time to do that, the soldiers lined up in the arbitrary order. However, the general is rather short-sighted and he thinks that the soldiers lined up correctly if the first soldier in the line has the maximum height and the last soldier has the minimum height. Please note that the way other solders are positioned does not matter, including the case when there are several soldiers whose height is maximum or minimum. Only the heights of the first and the last soldier are important.

// For example, the general considers the sequence of heights (4, 3, 4, 2, 1, 1) correct and the sequence (4, 3, 1, 2, 2) wrong.

// Within one second the colonel can swap any two neighboring soldiers. Help him count the minimum time needed to form a line-up which the general will consider correct.

// Input
// The first input line contains the only integer n (2 ≤ n ≤ 100) which represents the number of soldiers in the line. The second line contains integers a1, a2, ..., an (1 ≤ ai ≤ 100) the values of the soldiers' heights in the order of soldiers' heights' increasing in the order from the beginning of the line to its end. The numbers are space-separated. Numbers a1, a2, ..., an are not necessarily different.

// Output
// Print the only integer — the minimum number of seconds the colonel will need to form a line-up the general will like.




package Codeforce.Arrival_of_the_g_General;

import java.util.Scanner;

public class WithJava {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int number_of_soldiers = sc.nextInt();
        int[] soldiers = new int[number_of_soldiers];
        int max_index = 0;
        int min_index = 0;

        for (int i = 0; i < number_of_soldiers; i++) {
            soldiers[i] = sc.nextInt();
            if (soldiers[i] > soldiers[max_index]) {
                max_index = i;
            }
            if (soldiers[i] <= soldiers[min_index]) {
                min_index = i;
            }
        }

        // int number_of_move = 0;
        // if (max_index > min_index) {
        //     number_of_move = max_index + (number_of_soldiers - 1 - min_index) - 1;
        // } else {
        //     number_of_move = max_index + (number_of_soldiers - 1 - min_index);
        // }



        int number_of_move = 0;
        int key_switch = 0;

        while (max_index > 0 || min_index < number_of_soldiers -1){
            System.out.println(key_switch);
            if(key_switch == 0 && max_index > 0) {
                int temp_max = max_index - 1;
                int temp = soldiers[temp_max];
                soldiers[temp_max] = soldiers[max_index];
                soldiers[max_index] = temp;
                max_index--;
                key_switch= 1;
                number_of_move++;
            }else if (key_switch == 1 && min_index < number_of_soldiers-1){
                int temp_min = min_index + 1;
                int temp = soldiers[temp_min];
                soldiers[temp_min] = soldiers[min_index];
                soldiers[min_index] = temp;
                min_index++;
                key_switch= 0;
                number_of_move++;
            }
        }
        System.out.println(max_index + " " + min_index);
        System.out.println(number_of_move);
        for (int i = 0; i < number_of_soldiers; i++) {
            System.out.print(soldiers[i] + " ");
        }
        // sc.close();
    }
    
}
