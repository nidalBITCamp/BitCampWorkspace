public class OuterClass {

	private int number;
	public InnerClass ic = new InnerClass(25);
	
	
	
	
	
	

	public OuterClass() {
		super();
		this.number = 10;
		
	}

	public void myMethod() {

		new Comparable() {
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

		};
	}

	class InnerClass  {

		private int innerNumber;
		private int number;

		public InnerClass(int number) {
			this.number = number;
		}

		public void PrintVariables(int number) {
			System.out.println("Param number: " + number);
			System.out.println("Inner number: " + this.number);
			System.out.println("Outer number: " + OuterClass.this.number);

		}

	}

}
