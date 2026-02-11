package homework_11;

public class Otriz {
   public static void main(String[] args) {
   int sum = 0;
   int max = 0;
   int min = 0;
   
   int[] array = {1, -3, 5, -10, -17, 30, -547, 90, 128, -35};
   for(int i = 0; i < array.length; i++) {
	   System.out.println(array[i] + " → модуль " + Math.abs(array[i]));
	   sum += Math.abs(array[i]);
	   max = Math.max(max, array[i]);
	   min = Math.min(min, array[i]);
   }
   System.out.println("Summa :" + sum);
   System.out.println("Max :" + max);
   System.out.println("Min :" + min);
}
}
