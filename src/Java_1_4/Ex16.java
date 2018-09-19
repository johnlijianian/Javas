package Java_1_4;

import java.util.Arrays;

public class Ex16 {
    public static void nearest(double[] a) {
        Arrays.sort(a);
        int minI = 0;
        double minNum = 1.7976931348623157E308D;

        for(int i = 0; i < a.length - 1; ++i) {
            if (a[i + 1] - a[i] < minNum) {
                minNum = a[i + 1] - a[i];
                minI = i;
            }
        }

        System.out.println("最接近的数为" + a[minI] + "以及" + a[minI + 1]);
    }

    public static void main(String[] args) {
        double[] a = new double[]{3.0D, 2.0D, 4.0D, 5.0D, 6.0D, 12.0D, 23.0D, 8.0D, 99.0D, 34.0D};
        nearest(a);
    }
}
