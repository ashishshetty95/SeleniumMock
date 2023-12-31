package Interface;

public abstract class Visa implements Country{

	@Override
	public void usa() {
		System.out.println("Washington DC");
	}

	public abstract void australia();
	
}
