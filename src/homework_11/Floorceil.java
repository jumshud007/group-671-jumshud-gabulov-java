package homework_11;

public class Floorceil {
    public static void main(String[] args) {
    	int z = 0;
		for(int i = 0;i < 15; i++) {
			double a = Math.round(Math.random() * 9 + 1);
			System.out.println("Number :" + a);
			Math.ceil(a);
			Math.floor(a);
			if(a < 5) {
				System.out.println("Маленькое число");
			}
			if(a > 7) {
				z++;
			}
		}

		System.out.println("Kol_vo cisel bolshe 7 :" + z);
	}
}
