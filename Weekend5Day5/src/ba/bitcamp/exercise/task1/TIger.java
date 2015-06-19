package ba.bitcamp.exercise.task1;

/**
 * This class present animal tiger with specified attributes. Class is extends
 * with class Animal
 * 
 * @author nidal.salkic
 *
 */
public class TIger extends Animal {

	public static final int SLEEPING = 0;
	public static final int HUNTER = 1;
	public static final int EATING = 2;

	private int speed;
	private int condition;

	/**
	 * Declaration constructor of Tiger
	 * 
	 * @param isLive
	 *            - attributes from class LifeForm
	 * @param weigth
	 *            - attributes from class Animal
	 * @param mainFood
	 *            - attributes from class Animal FOOD_ANIMAL = 0, FOOD_PLANT = 1
	 * @param speed
	 *            - value of speed
	 * @param condition
	 *            - LEEPING = 0; HUNTER = 1; EATING = 2;
	 */
	public TIger(Integer weigth, int speed, int condition) {
		super(true, weigth, Animal.FOOD_ANIMAL);
		this.speed = speed;
		this.condition = condition;

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TIger other = (TIger) obj;
		if (condition != other.condition)
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	public void eat(LifeForm l) {

		if (super.getIsLive().equals(true) && l instanceof Zebra) {
			Zebra z = (Zebra) l;
			if (this.condition == TIger.HUNTER  &&  z.getCondition() == z.ILL
					|| z.getCondition() == z.DEATHLY) {
				System.out
						.println("Tigar ce pojesti zebru ali ona je bila bolesna, tigar ce umrijeta za 10 dana");
				this.condition = TIger.SLEEPING;
			} else {
				System.out.println("Tigar ode sretan kuci, punog zeludca");
				this.condition = TIger.EATING;

			}

		} else {
			System.out.println("Sta to radis. To ti je buraz, a more biti i biljka.Idi ganjaj zebre");
		}

	}

	/**
	 * Method toString which print information of Tiger use method toString from
	 * classes LifeForm and Animal
	 */
	@Override
	public String toString() {
		super.toString();
		String l = "";
		if (super.getIsLive().equals(true)) {
			l += super.toString();
			l += " TIger speed is " + speed;
			if (condition == SLEEPING) {
				l += " condition is  sleepeng";
			} else if (condition == HUNTER) {
				l += " Condition is hunter ";
			} else {
				l += " condition is eating";
			}
		} else {
			l += " Tiger is not a live";
		}
		return l;

	}
}
