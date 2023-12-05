package Interface;

public class Travel extends Visa  {

	@Override
	public void srilanka() {
		System.out.println("Colombo");
	}
	
	public void India() {
		System.out.println("New Delhi");
	}

	@Override
	public void usa() {
		System.out.println("WDC");
	}

	@Override
	public void australia() {
		System.out.println("Canberra");
	}

}
