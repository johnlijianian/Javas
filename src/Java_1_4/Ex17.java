package Java_1_4;

import java.util.Arrays;

public class Ex17 {
    public static void farthest(double[] a) {
        Arrays.sort(a);
        int maxI = 0;
        double maxNum = 4.9E-324D;

        for(int i = 0; i < a.length - 1; ++i) {
            if (a[i + 1] - a[i] > maxNum) {
                maxNum = a[i + 1] - a[i];
                maxI = i;
            }
        }

        System.out.println("最遥远的数为" + a[maxI] + "以及" + a[maxI + 1]);
    }

    public static void main(String[] args) {
        double[] a = new double[]{3.0D, 2.0D, 4.0D, 5.0D, 6.0D, 2.0D, 3.0D, 8.0D, 4.0D, 3.0D};
        farthest(a);
    }
}
