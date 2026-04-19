package homework_14;

import java.util.Scanner;

public class StructureDemo {
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		Helper a1 = new Helper();
		a1.run();
		// мне не нужно его импортировать он уже встроен например как Math
}
}
class Helper{
static void run() {System.out.println("Running");}	
}



//В тетради выпишите рекомендуемый порядок «сверху вниз» в файле: package, import, class — и отметьте, что обязательно, что нет.
// pasckage -> import -> class
// обязательно -> не обязательно -> обязательно