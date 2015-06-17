package ba.bitcamp.exercise.task1;

/**
 * This class describes the Antenna manufactures, and status of input signalF
 * 
 * @author nidal.salkic
 *
 */
public class Antenna {

	// Attributes of antenna
	private String name;
	private int signal;
	private double consumptionOfBattery;

	public Antenna(String name, double consumptionOfBattery) {
		this.name = name;
		this.signal = 4;
		this.consumptionOfBattery = consumptionOfBattery;
	}

	/**
	 * Get name of manufactures
	 * 
	 * @return string name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get signal strength
	 * 
	 * @return byte value of signal
	 */
	public int getSignal() {
		return signal;
	}

	/**
	 * Set the signal strength from 1 to 4
	 * 
	 * @param signal
	 *            - byte value of signal from 1 to 4
	 */
	public void setSignal(int sig) {
		this.signal = sig;
		if (this.signal > 4) {
			this.signal = 4;
		} else if (this.signal < 0) {
			this.signal = 0;
		}
	}

	/**
	 * Method which check signal of antenna and type of signal
	 * 
	 * @param sig
	 *            - integer value of signal
	 * @param type
	 *            - string signal is composed of three key letters (SMS , CAL)
	 *            and numbers
	 * @return boolean False in the case when signal is higher or not to match
	 */
	public boolean typeOfSignal(int sig, String type) {

		if (type.substring(0, 3).equals("CAL")
				|| type.substring(0, 3).equals("SMS")
				&& type.substring(3, 6).equals("387") && type.length() > 14 && sig <this.signal) {
			return true;
		} else
			return false;
	}

	/**
	 * Method toString for printing name of manufacture of antenna and signal
	 * strength
	 */
	public String toString() {
		return "Antenna manufactures name is " + name + " signal strenght is "
				+ signal + ".";
	}

}
