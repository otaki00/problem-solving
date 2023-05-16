
// solution from leetcode
// this is almost the same as me, but accurate honstly, because
//  fisrt => he check if the value is in range of 32-bit after every single itration, not as me at the ene
// then is not wrong but he used simple aprroach to add digits
public class withJava {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}