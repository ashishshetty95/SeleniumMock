package Interface;

public class Main {
	public static void main(String[] args) {
		Travel t = new Travel();
		t.australia();
		t.srilanka();
		t.usa();
		t.India();
		
		System.out.println();
		
		Visa t1=new Travel();
		t1.australia();
		t1.usa();
		t1.srilanka();
		
		System.out.println();
		
		Country t2=new Travel();
		
		t2.srilanka();
		t2.usa();
		
		
	}
}
