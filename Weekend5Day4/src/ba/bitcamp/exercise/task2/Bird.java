package ba.bitcamp.exercise.task2;

public class Bird extends Animal{
	
	private boolean isImigration;
	private boolean isPredator;
	
	
	
	
	public Bird(boolean hasFur, boolean isMammal, boolean isImigration,
			boolean isPredator) {
		super(hasFur, isMammal);
		this.isImigration = isImigration;
		this.isPredator = isPredator;
	}
	public boolean isImigration() {
		return isImigration;
	}
	public void setImigration(boolean isImigration) {
		this.isImigration = isImigration;
	}
	public boolean isPredator() {
		return isPredator;
	}
	public void setPredator(boolean isPredator) {
		this.isPredator = isPredator;
	}
	
	
	
	
	
	
	
	

}
