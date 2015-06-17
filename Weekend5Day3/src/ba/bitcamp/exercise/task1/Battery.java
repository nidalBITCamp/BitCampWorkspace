package ba.bitcamp.exercise.task1;

/**
 * This class describes the battery manufacture, time for charge, increases
 * battery percent and print some of information
 * 
 * @author nidal.salkic
 *
 */

public class Battery {

	// Attributes of battery
	private String name;
	private int percentOFBattery;
	private int speedOfcharging;

	/**
	 * declaration constructor of battery
	 * 
	 * @param name
	 *            - manufactures name
	 * @param speedOfcharging
	 *            - speed of charging
	 */
	public Battery(String name, int speedOfcharging) {
		this.name = name;
		this.percentOFBattery = 50;
		this.speedOfcharging = speedOfcharging;
	}

	/**
	 * Get the name of manufactures
	 * 
	 * @return - string name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get percent of battery
	 * 
	 * @return
	 */
	public int getPercentOFBattery() {
		return percentOFBattery;
	}

	/**
	 * Method which charge battery
	 * 
	 * @param time
	 *            - time of charge
	 */
	public void chargeBattery(int time) {
		this.percentOFBattery += time * this.speedOfcharging;
		if (this.percentOFBattery >= 100) {
			percentOFBattery = 100;
		}

	}

	/**
	 * Method which decreases percent of battery
	 * 
	 * @param value
	 *            - value of decreases
	 */
	public void decreasesBattery(int value) {
		this.percentOFBattery -= value;
		if (this.percentOFBattery < 0) {
			this.percentOFBattery = 0;
		}
	}

	/**
	 * Method toString for printing to console name of manufactures and percent
	 * of battery
	 */
	public String toString() {
		return "Battery  manufactures name is " + name
				+ ", percent of battery is " + percentOFBattery + ".";
	}

}
