package classwork_18;

import java.util.ArrayList;
import java.util.Arrays;

public class Classwork_18 {
	static int sumArray(int[] arr) {
		int[] sum = { 1, 2, 3, 4, 5 };
		int summ = 0;

		for (int i : sum) {
			summ += i;
		}
		return summ;

	}

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
		int[] nums = { 19, 39 };
		System.out.println(Math.max(nums[0], nums[1]));

		String sth = "Privet";
		String[] sths = sth.split("");
		System.out.println(Arrays.toString(sths));
		ArrayList glas = new ArrayList();
		glas.add("a");
		glas.add("e");
		glas.add("i");
		glas.add("o");
		glas.add("u");
		
		for (String a : sths) {
			if(glas.contains(a)) {
			}
  	  	}
		ArrayList eratos = new ArrayList();
		for(int i = 2;i < 25;i++) {
		}
	}
}