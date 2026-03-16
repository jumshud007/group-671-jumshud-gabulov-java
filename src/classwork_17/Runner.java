package classwork_17;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		double sum = 0;
		int j = 0;
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.round(Math.random() * 99) + 1;
		    sum += array[i]; 
		    if(array[i] % 2 == 0) {
				j++;
			}
		}
		System.out.println(sum);
		Arrays.sort(array);
		System.out.println("Max :" + array[9] + "Min :" + array[0]);
		int a = array.length - j;
	    System.out.println("чётных: " + j + " нечётных: "+ a );
	}
}
