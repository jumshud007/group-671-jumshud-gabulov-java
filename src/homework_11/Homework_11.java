package homework_11;

public class Homework_11 {
	public static void main(String[] args) {
		// 1
		Balli new1 = new Balli();
		long sumozenok = 0;
		int kolvo5 = 0;
		for(int i = 0; i < 20;i++) {
		long ii = new1.randomBall();
		sumozenok += ii;
		System.out.println("Урок " + i + " → оценка " + ii);
		if(ii == 5) {
			kolvo5++;
		}
		}
		long a = Math.round(sumozenok / 20);
		System.out.println("Srednaya summa :" + a);
        System.out.println("Количество пятёрок: " + kolvo5);
        // 2
        System.out.println("--------Температура за неделю--------");
        double coldest = 100;
        double warmest = -100;
        Weather new2 = new Weather();
        for(double i : new2.temperature) {
        System.out.println("День: " + i + " → " + new2.roundt(i));
        coldest = Math.min(coldest, new2.roundt(i));
        warmest = Math.max(warmest, new2.roundt(i));
        }
        double d = warmest - coldest;  
        System.out.println("Coldest :" + coldest);
        System.out.println("Warmest :" + warmest);
        System.out.println("Raznisa :" + d);
        // 3
        double sum = 0;
        int kol_vomonet = 1;
        Kopilka new3 = new Kopilka();
        for(int i = 1; i < 30; i++) {
        long moneta = new3.randomM();
        int moneta2 = (int) moneta;
        kol_vomonet++;
        sum += new3.moneti[moneta2];
        System.out.println(new3.moneti[moneta2]);
        if(new3.moneti[moneta2] == 10) {
			System.out.println("Большая монета!");
		} 
        }
        System.out.println("Общее количество монет :" + kol_vomonet + " Общая суммa :" + sum);
        double nominal = Math.round(sum / 10);
        System.out.println("Средний номинал :" + nominal);
        // 4
        double sum4 = 0;
        double max1 = 0;
        Houses new4 = new Houses();
        System.out.println("Комната: " + 3.2 + " × " + 4.5 + " = " + new4.shouse(4.5,3.2));
        max1 = Math.max(new4.shouse(4.5,3.2), max1);
        sum4 += new4.shouse(4.5,3.2);
        System.out.println("Комната: " + 5.0 + " × " + 4.0 + " = " + new4.shouse(5.0,4.0));
        max1 = Math.max(new4.shouse(5.0,4.0), max1);
        sum4 += new4.shouse(5.0,4.0);
        System.out.println("Комната: " + 3.8 + " × " + 3.5 + " = " + new4.shouse(3.8,3.5));
        max1 = Math.max(new4.shouse(3.8,3.5), max1);
        sum4 += new4.shouse(3.8,3.5);
        System.out.println("Комната: " + 6.1 + " × " + 2.9 + " = " + new4.shouse(6.1,2.9));
        max1 = Math.max(new4.shouse(6.1,2.9), max1);
        sum4 += new4.shouse(6.1,2.9);
        System.out.println("Комната: " + 4.2 + " × " + 4.2 + " = " + new4.shouse(4.2,4.2));
        max1 = Math.max(new4.shouse(4.2,4.2), max1);
        sum4 += new4.shouse(4.2,4.2);
        System.out.println("Obsaya plosad posle round :" + Math.round(sum4));
        System.out.println("Max plosad :" + max1);
        // 5
        Magazin new5 = new Magazin();
        double[] home = {0,0};
        for(int i = 0; i < 6; i++) {
        	new5.rasstoyaniya(home[0], home[1], Math.round(Math.random() * 5 + 1),Math.round(Math.random() * 5 + 1));
        	
        }
	}
}