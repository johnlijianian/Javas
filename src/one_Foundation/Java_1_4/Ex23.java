package one_Foundation.Java_1_4;

import java.util.Arrays;

public class Ex23 {
    public static int FractionBinarySearc(double key , double []fractions){
        int lo = 0;
        int hi = fractions.length - 1;
        int mid ;

        while (lo <= hi){
            mid = lo + (hi - lo) / 2;
            double threshold = 1.0 / (fractions.length * fractions.length);
            if (Math.abs(fractions[mid] - key)  <=threshold)
                return  mid;
            else if (fractions[mid] < key)
                lo = mid + 1;
            else
                hi = mid - 1;

        }
        return -1;

    }

    public static void main(String[] args) {
        double[] fractions = {1.0/2.0,2.0/3.0,3.0/4.0,4.0/5.0,5.0/6.0};
        Arrays.sort(fractions);

        int index = FractionBinarySearc(4.0/5.0,fractions);

        System.out.print("4.0/5.0 在第" + index + "个");
    }
}
