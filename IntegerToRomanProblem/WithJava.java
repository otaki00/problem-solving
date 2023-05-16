/* 
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.
*/






package IntegerToRomanProblem;

import java.util.HashMap;

public class WithJava {


    public static void main(String[] args) {
    
    
        System.out.println(intToRoman(1994));
    }

    // this is my solution, it was a funny problem to solve, and was happy when i solve it 
    // in my approach i first create function that loop through keys array, and return the limit of keys that can represnt aout target
    // then with this limit i can easily get the romans, by loop until the number become zero, in each loop it will call (returnLimit)
    // and check if  num > limit => add the value of key(limit) from map , then sub limit from num
    // if num == limit => this means that we done add the value to result and break
    // the Time complexity here its almost constant because all arraies we loop through them are fixed length, and to get value from map takes O(constant)
    // but the funtction intToRoman => O(n) which is number of iteration until we reach 0

    public static String intToRoman(int num) {
        
        int[] keys = {1,4,5,9,10,40,50,90,100,400,500,900,1000};

        HashMap<Integer, String> romanValuesTable = new HashMap<Integer, String>();
        romanValuesTable.put(1, "I");
        romanValuesTable.put(4, "IV");
        romanValuesTable.put(5, "V");
        romanValuesTable.put(9, "IX");
        romanValuesTable.put(10, "X");
        romanValuesTable.put(40, "XL");
        romanValuesTable.put(50, "L");
        romanValuesTable.put(90, "XC");
        romanValuesTable.put(100, "C");
        romanValuesTable.put(400, "CD");
        romanValuesTable.put(500, "D");
        romanValuesTable.put(900, "CM");
        romanValuesTable.put(1000, "M");

        String result = "";

        while(num > 0){
            int limit =returnLimit(num, keys);
            if( limit < num ){
                result += romanValuesTable.get(limit);
                num = num-limit;
            }else if(limit == num){
                result += romanValuesTable.get(limit);
                break;
            }
        }


        return result;
    }
    

    public static int returnLimit(int num, int[] keys) {
        int forLimit = 0;
        // System.out.println(keys.length);
        for(int i= 0; i< keys.length; i++){
            if(num < keys[i]){
                int index = i-1;
                forLimit = keys[index];
                break;
            }
        }
        if (forLimit == 0) forLimit = keys[keys.length-1];
        return forLimit;
    }
}


