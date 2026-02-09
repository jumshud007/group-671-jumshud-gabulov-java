package homework_10;

public class Rasstoyaniya {
	public static void main(String[] args) {
		double max = 0;
		double min = 0;
		double[] school = {4,3};
		System.out.println("---------School---------");
		rascet(0,0,school[0],school[1]);
		
		double[] shop = {0,8};
		System.out.println("---------Shop---------");
		rascet(0,0,shop[0],shop[1]);
		
		max = Math.max(shop[0] + shop[1] , school[0] + school[1]);
		min = Math.min(shop[0] + shop[1] , school[0] + school[1]);
		
		double[] park = {5,12};
		System.out.println("---------Park---------");
		rascet(0,0,park[0],park[1]);
		
		max = Math.max(max,park[0] + park[1] );
		min = Math.min(min,park[0] + park[1] );
		
		double[] friend = {9,0};
		System.out.println("---------Friend---------");
		rascet(0,0,friend[0],friend[1]);
		
		max = Math.max(max,friend[0] + friend[1] );
		min = Math.min(min,friend[0] + friend[1] );
		
		
		double[] cinema = {2,10};
		System.out.println("---------Cinema---------");
		rascet(0,0,cinema[0],cinema[1]);
		
		max = Math.max(max,cinema[0] + cinema[1] );
		min = Math.min(min,cinema[0] + cinema[1] );
		
		
		double[] grandma = {7,5};
		System.out.println("---------Grandma---------");
		rascet(0,0,grandma[0],grandma[1]);
		
		max = Math.max(max, grandma[0] + grandma[1] );
		min = Math.min(min, grandma[0] + grandma[1] );

		System.out.println("Самое дальнее: " + max + " метров");
		System.out.println( "Ближайшее место: " + min + " метров");
	}
	public static void rascet(double x1, double y1, double x2, double y2) {
		double x = x2 - x1; 
		double y = y2 - y1; 
		System.out.println("Расстояние от дома: " + "(" + x +"," + y +")");
		Math.sqrt(x*x + y*y);
	}
    
}
