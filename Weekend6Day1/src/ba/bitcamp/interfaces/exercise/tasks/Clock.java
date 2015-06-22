package ba.bitcamp.interfaces.exercise.tasks;

public class Clock implements WriteableClock {

	private int hour;
	private int minutes;
	private int seconds;

	public Clock(int hour, int minutes, int seconds) {
		super();
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public void addToFile(String file, int format) {
		String s = "";
		if (format == WriteableClock.AMPM_FORMAT) {
			if (hour > 12) {
				hour = hour - 12;
				s += hour + ":" + minutes + ":" + ":" + seconds + "PM";
			} else {
				hour = hour;
				s += hour + ":" + minutes + ":" + ":" + seconds + "AM";
			}
		} else if (format == WriteableClock.AMPM_FORMAT_NO_SECONDS) {
			if (hour > 12) {
				hour = hour - 12;
				s += hour + ":" + minutes + "PM";
			} else {
				hour = hour;
				s += hour + ":" + minutes + "AM";
			}
		} else if (format == WriteableClock.MILITARY_FORMAT) {
			s += hour + ":" + minutes + ":" + ":" + seconds;
	
	} else if (format == WriteableClock.MILITARY_FORMAT_NO_SECONDS) {
			s += hour + ":" + minutes;
			
		}
		writeToFile(file,  s);
	}
}
