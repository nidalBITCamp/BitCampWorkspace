package ba.bitcamp.exercise.task1;
/**
 * This class present life form with attribute isLIve
 * @author nidal.salkic
 *
 */
public abstract class LifeForm {
	
	private Boolean isLive;

	public LifeForm(Boolean isLive) {
	
		this.isLive = isLive;
	}
	

	public Boolean getIsLive() {
		return isLive;
	}

	public void setIsLive(Boolean isLive) {
		this.isLive = isLive;
	}

	@Override
	public String toString() {
		return "Is life form live: " + isLive + ".";
	}
	
	

}
