package classwork_13;

public class Time {
	int hours;
	int minutes;

	public Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public  void addMinutes(int min) {
		minutes += min;
		do{minutes -= 60; hours++;}
		while(minutes > 59);};
}
