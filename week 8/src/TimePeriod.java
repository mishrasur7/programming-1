
public class TimePeriod {
	private int hours;
	private int minutes;

	public TimePeriod() {
		this.hours = hours;
		this.minutes = minutes;
	}

	public void addHours(int hoursToAdd) {
		if (hoursToAdd > 0 && hoursToAdd < 100) {
			hours = hours + hoursToAdd;
			if(hours > 99) {
				hours = 99;
			}
		} else {
				hours = hours;
		}

	}

	public void addMinutes(int minutesToAdd) {
		if (minutesToAdd > 0 && minutesToAdd < 60) {
			minutes = minutes + minutesToAdd;
			if(minutes > 59) {
				hours++; 
				if(hours > 99) {
					hours = 99; 
					minutes = minutes - minutesToAdd; 
				} else {
					minutes = minutes - 60;
				}	 
			}
		} else { 
				minutes = minutes; 
		}

	}

	public String toString() {
		return hours + " h " + minutes + " min";
	}

}
