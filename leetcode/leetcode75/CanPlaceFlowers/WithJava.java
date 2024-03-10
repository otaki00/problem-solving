package CanPlaceFlowers;

public class WithJava {
    public static void main(String[] args) {
        int[] flowerbed = { 1, 0, 1, 0, 1, 0, 1};

        System.out.println(canPlaceFlower(flowerbed, 1));
    }

    public static boolean canPlaceFlower(int[] flowerbed, int n ) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n <= 0)
                return true;
            if (flowerbed[i] == 0) {
                if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    n--;
                    i++;
                    continue;
                } else {
                    i += 2;
                    continue;
                }
            } else {
                i++;
                continue;
            }
        }
        return n <= 0;
    }
}
