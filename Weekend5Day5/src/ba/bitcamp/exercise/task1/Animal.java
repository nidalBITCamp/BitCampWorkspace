package ba.bitcamp.exercise.task1;

/**
 * This class present animal with specified attribute , this class extends class
 * LifeForm
 * 
 * @author nidal.salkic
 *
 */
public abstract class Animal extends LifeForm {

	public static final int FOOD_ANIMAL = 0;
	public static final int FOOD_PLANT = 1;

	private Integer weigth;
	private int mainFood;

	/**
	 * Constructor for animal attributes
	 * 
	 * @param isLive
	 *            - boolean is live or not
	 * @param weigth
	 *            - value of weight
	 * @param mainFood
	 *            - main food FOOD_ANIMAL = 0, FOOD_PLANT = 1
	 */
	public Animal(Boolean isLive, Integer weigth, int mainFood) {
		super(isLive);
		this.weigth = weigth;
		this.mainFood = mainFood;
	}

	public Integer getWeigth() {
		return weigth;
	}

	public void setWeigth(Integer weigth) {
		this.weigth = weigth;
	}

	public int getMainFood() {
		return mainFood;
	}

	public void setMainFood(int mainFood) {
		this.mainFood = mainFood;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (mainFood != other.mainFood)
			return false;
		if (weigth == null) {
			if (other.weigth != null)
				return false;
		} else if (!weigth.equals(other.weigth))
			return false;
		return true;
	}
	
	public abstract void eat(LifeForm l);
	

	/**
	 * Method toString which print the information to console use method
	 * toString from class LifeForm
	 */
	@Override
	public String toString() {
		super.toString();
		String l = "";
		if (super.getIsLive().equals(true)) {
			l += "Animal weigth is " + weigth;
			if (mainFood == FOOD_PLANT) {
				l += " animal food is plant and animal is live,";
			} else {
				l += " Animal food is other animal.";
			}
		} else {
			l += " Animal is not a live.";
		}
		return l;
	}

}
