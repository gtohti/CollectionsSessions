package MyPracticJava;

import java.util.Arrays;

public class MyPracticJavaCompareArrays {
public static void main(String[] args) {
double [][] prices = new double[3][];
prices [0] = new double[] {232.34, 234.56, 778.45};
prices [1] = new double[] {232.2, 100.4};
prices [2] = new double [5];
prices[2][0] = 543.34;
prices[2][1] = 6543;
prices[2][2] = 123.54;
prices[2][3] = 659797.56;
prices[2][4] = 120004.64;

for (int i = 0; i < prices.length; i++) {
	System.out.println(Arrays.toString(prices[i]));
}
}

}
