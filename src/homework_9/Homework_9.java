package homework_9;

public class Homework_9 {
	public static void main(String[] args) {
    // 1
	Person person1 = new Person("Alex");
	person1.printinfo1();
//	Person person2 = new Person(null);
//	person2.printinfo1();
	// Обьяснение это один из примеров NullPointerException. Чтобы избежать этой ошибки надо или не выводить длину а просто вывести name1 или задать ему значение
    
	// 2
	Counter counter1 = new Counter();
	Counter counter2 = new Counter();
	Counter counter3 = new Counter();
	System.out.println(counter1.totalcount);
	System.out.println(counter2.totalcount);
	System.out.println(counter3.totalcount);
	System.out.println(counter1.instancecount);
	System.out.println(counter2.instancecount);
	System.out.println(counter3.instancecount);
	// Обьяснение мы создали в классе Counter два инта один статичный другой нет и написалив конструкторе ++ к обеим интам а статичный оностается всегда одинаковым ну то есть для всех переменных он одинакоый то есть за каждую переменную он прибавляется а другой инт обнуляется и так прибавляется поэтому он три а  другой один
    
	// 3
	Sumnumbers sum1 = new Sumnumbers(4,4);
	sum1.summ();
    // Обьяснение сначала мы присваиваем интеджер инту а потом даем ему значение дабл
	
	// 4
	Box C = new Box(2);
	C.ChangeValue(C);
	System.out.println(C.value);
	// Обьяснение значение изменилось потому что мы выбрали на что его изменить из нашего класса
	
	// 5
	Scopetest scope1 = new Scopetest();
	scope1.scope();
	System.out.println(Math.sqrt(1231321232));
	// Обьяснение переменная локальная поэтому ее невозможно использовать за ее блоком кода
}
}