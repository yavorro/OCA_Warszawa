package p22_wrappery;

public class Wrappery7 {

	public static void main(String[] args) {
		String tekst = "1234";
		
		int x = Integer.parseInt(tekst);
		System.out.println(2*x);
		
		Integer y = Integer.valueOf(tekst);
		
		// skompiluje się też, ale mnie wydajne:
		int xx = Integer.valueOf(tekst);
		Integer yy = Integer.parseInt(tekst);
		
		double d = Double.parseDouble(tekst);
		System.out.println(d);
	}

}
