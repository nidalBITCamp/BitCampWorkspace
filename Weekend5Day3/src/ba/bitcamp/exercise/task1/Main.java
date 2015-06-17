package ba.bitcamp.exercise.task1;

public class Main {

	public static void main(String[] args) {

		// Declaration new mobile speaker and print information to console
		MobileSpeaker sp1 = new MobileSpeaker("Samsung", 50, 17.2);
		System.out.println(sp1);

		// Increase volume without turn on
		sp1.increaseVolume();
		System.out.println(sp1);

		// Increase volume with turn on
		sp1.enable();
		sp1.increaseVolume();
		System.out.println(sp1);

		// Increase and lower volume few times
		sp1.increaseVolume();
		sp1.increaseVolume();
		sp1.increaseVolume();
		sp1.lowerVolume();

		// Print current volume
		System.out.println(" Volume of speaker is " + sp1.getVolume());

		// Declaration new battery and print information to console
		Battery b1 = new Battery("Samsung", 3);
		System.out.println(b1);

		// Charge battery with entered time and print status of percent of
		// battery
		b1.chargeBattery(6);
		System.out.println(" Current procent of battery is "
				+ b1.getPercentOFBattery());

		// Charge and decreases battery and print information of battery to
		// console
		b1.chargeBattery(20);
		b1.decreasesBattery(20);
		System.out.println(b1);

		
		// Declaration new antenna and print the information
		Antenna a1 = new Antenna("Maximus", 2);
		System.out.println(a1);
		
		// Test the signal and type of signal
		a1.setSignal(2);
		System.out.println(" Signal is valid " + a1.typeOfSignal(0, "SMS387634567895545"));
		
		// Declaration new Display
		Display d1 = new Display("HD Display", 5);
		d1.turnOn();
		System.out.println(d1);
		
		// Lower display strength and print status 
		d1.displayStrenghtlower();
		d1.displayStrenghtlower();
		d1.displayStrenghtlower();
		System.out.println(" Current display strength is " +d1.getDisplayStrength());
		
		

	}

}
