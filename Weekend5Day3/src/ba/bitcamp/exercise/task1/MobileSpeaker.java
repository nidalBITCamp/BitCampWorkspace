package ba.bitcamp.exercise.task1;

/**
 * This class describes the speaker of mobile, increase and lower the volume,
 * enable and disable speaker
 * 
 * @author nidal.salkic
 *
 */
public class MobileSpeaker {

	// Attributes of class
	private String name;
	private int price;
	private boolean isTurnOn;
	private int volume;
	private double consumptionOfBattery;

	/**
	 * Declaration constructor of mobile speaker
	 * 
	 * @param name
	 *            - name of manufacturer
	 * @param price
	 *            - price of speaker
	 * @param consumptionOfBattery
	 */
	public MobileSpeaker(String name, int price, double consumptionOfBattery) {
		super();
		this.name = name;
		this.price = price;
		this.isTurnOn = false;
		this.volume = 0;
		this.consumptionOfBattery = consumptionOfBattery;

	}

	/**
	 * Get name of manufacturer of speaker
	 * 
	 * @return - string name;
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get price of speaker
	 * 
	 * @return - integer prize
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Get is turn on
	 * 
	 * @return - default turn of - False
	 */
	public boolean isTurnOn() {
		return isTurnOn;
	}

	/**
	 * Get volume of speaker
	 * 
	 * @return integer value
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * Get consumption of battery
	 * 
	 * @return double value
	 */
	public double getConsuptionOfBatery() {
		return consumptionOfBattery;
	}

	/**
	 * Method for enable speaker
	 */
	public void enable() {
		this.isTurnOn = true;
	}

	/**
	 * Method for disable speaker
	 */
	public void disable() {
		this.isTurnOn = false;
	}

	/**
	 * Method which lower volume by 10
	 */
	public void lowerVolume() {
		if (isTurnOn == true) {
			this.volume -= 10;
			if (this.volume < 0) {
				this.volume = 0;
			}
		} else {
			System.out.println("Please turn on speaker");
		}
	}

	/**
	 * Method which increase volume by 10
	 */
	public void increaseVolume() {
		if (isTurnOn == true) {
			this.volume += 10;
			if (this.volume > 100) {
				this.volume = 100;
			}
		} else {
			this.volume = 0;
		}
	}

	/**
	 * Method to string which print to console name of manufactures and status
	 * of speaker
	 */
	public String toString() {
		String l = "";
		l +="Manufacturer name is " + name + ".";
		if (this.isTurnOn == true) {
			l += "  Volume of speaker is: " + volume + ".";
		} else {
			l += " Speaker is turn off. ";
		}
		return l;
	}

}
