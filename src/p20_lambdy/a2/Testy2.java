package p20_lambdy.a2;

public class Testy2 {

	public static void main(String[] args) {
		FunkcjaLiczbowa f3 = (double arg) -> {return arg * arg;};
		System.out.println(f3.oblicz(5));
		
		FunkcjaLiczbowa f4 = x -> x*x;
		System.out.println(f4.oblicz(5));
		
		// tu korzystam z default implementacji z interfejsu
		System.out.println(f4.oblicz("123.4"));
		
		FunkcjaLiczbowa krok1 = x -> 10*x;
		FunkcjaLiczbowa krok2 = x -> x + 1;
		
		FunkcjaLiczbowa zlozenie = krok1.zloz(krok2);
		System.out.println(zlozenie.oblicz(5));
	}

}
