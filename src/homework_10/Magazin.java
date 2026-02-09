package homework_10;

import java.util.Iterator;

public class Magazin {
	public static void main(String[] args) {
	double[] seni = {45.6, 19.9, 99.4, 8.2, 150.7, 33.1, 67.8, 12.5, 200.0, 55.3};
	long num = 0;
	double sum = 0.0;
	
	for(int i = 0; i < seni.length; i++) {
		num = Math.round(seni[i]);
		sum += seni[i];
		System.out.println( "Игрушка: " + i + " → после округления: " + num);
	}
	long sredne = Math.round(sum / 10);
    System.out.println("Средняя цена ≈ " + sredne);
	}
}
