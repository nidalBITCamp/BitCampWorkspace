package ba.bitcamp.exercise.task1;

/**
 * This class describes the display of mobile, increase and lower the display
 * strength, enable and disable display
 * 
 * @author nidal.salkic
 *
 */
public class Display {

	// Attributes of display
	private String name;
	private int displayStrength;
	private boolean isTurnOn;
	private double consumptionOfBattery;

	/**
	 * Declaration constructor of mobile display
	 * 
	 * @param name
	 *            name of manufactures
	 * @param consumptionOfBattery
	 *            - consumption of battery
	 */
	public Display(String name, double consumptionOfBattery) {

		this.name = name;
		this.displayStrength = 100;
		this.consumptionOfBattery = consumptionOfBattery;
		this.isTurnOn = false;
	}

	/**
	 * Get display strength
	 * 
	 * @return - value of display strength
	 */
	public int getDisplayStrength() {
		return displayStrength;
	}

	/**
	 * Method for turn on display
	 */
	public void turnOn() {
		this.isTurnOn = true;
	}

	/**
	 * Method for turn of display
	 */
	public void turnOf() {
		this.isTurnOn = false;
	}

	/**
	 * Method which increase display strength by 10
	 */
	public void displayStrenghtincrease() {
		if (this.isTurnOn = true) {
			this.displayStrength += 10;
			if (this.displayStrength > 100) {
				this.displayStrength = 100;
			}
		} else {
			System.out.println("Turn display on");

		}
	}

	/**
	 * Method which lower display strength by 10
	 */
	public void displayStrenghtlower() {
		if (this.isTurnOn = true) {
			this.displayStrength -= 10;
			if (this.displayStrength < 0) {
				this.displayStrength = 0;
			}
		} else {
			System.out.println("Turn display on");

		}
	}

	/**
	 * Method toString which print to console name of manufactures and status of
	 * display
	 */
	public String toString() {
		String line = "";
		line += "Display manufacturer name is" + name + ".";
		if (this.isTurnOn == true) {
			line += " Strength display is " + displayStrength + ".";
		} else {
			line += "Display is turn off";
		}
		return line;
	}

}
