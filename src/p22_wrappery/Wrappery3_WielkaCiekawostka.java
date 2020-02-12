package p22_wrappery;

public class Wrappery3_WielkaCiekawostka {

	public static void main(String[] args) {
		Integer x, y;

		x = 100;
		y = 100;
		System.out.println(x == y);

		x = 200;
		y = 200;
		System.out.println(x == y);
		System.out.println();
		
		// wyjasnienie: automatyczny boxing jest robiony za pomocą valueOf:
		x = Integer.valueOf(100);
		y = Integer.valueOf(100);

		System.out.println(x == y);
		System.out.println(x.equals(y));
		System.out.println();

		x = Integer.valueOf(200);
		y = Integer.valueOf(200);

		System.out.println(x == y);
		System.out.println(x.equals(y));

	}

}
