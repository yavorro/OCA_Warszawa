package p20_lambdy.a1;

public class Testy1 {

	public static void main(String[] args) {
		FunkcjaLiczbowa f1 = new FunkcjaDoKwadratu();
		System.out.println(f1.oblicz(5));
		
		FunkcjaLiczbowa f2 = new FunkcjaLiczbowa() {
			public double oblicz(double arg) {
				return arg * arg;
			}
		};
		System.out.println(f2.oblicz(5));
		System.out.println();
		
		// Od Javy 8 takie interfejsy jak FunkcjaLiczbowa można instancjonować za pomocą wyrażeń lambda
		
		FunkcjaLiczbowa f3 = (double arg) -> {return arg * arg;};
		System.out.println(f3.oblicz(5));
		
		FunkcjaLiczbowa f4 = x -> x*x;
		System.out.println(f4.oblicz(5));
		
		// To, co daje lambda, jest obiektem. Obiektem automatycznie wygenerowaj klasy zgodnej z interfejsem. 
		Object o4 = f4;
		System.out.println(f4.getClass());

		// Lambdy można uzywać tylko w takim kontekście, gdzie oczekiwana jest wartość zgodna
		// jakimś interfejsem funkcyjnym.
		
		// Tutaj kompilator nie wie do jakiego interfejsu ma dopasować tę lambde
		//NK Object niewiadomoco = x -> x*x;

		Object o = (FunkcjaLiczbowa)x -> x*x;
	}

}
