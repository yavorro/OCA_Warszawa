package p20_lambdy;

import java.util.Arrays;

public class PrzykladyFunkcjaLiczbowa {

	public static void main(String[] args) {
		FunkcjaLiczbowa f1 = x -> x*x;
		
		// mam obiekt, który jest zgodny z interfejsem
		System.out.println(f1 instanceof FunkcjaLiczbowa);

		// dokładnie jest klasy:
		System.out.println(f1);
		System.out.println(f1.oblicz(5));
		System.out.println();
		
		// gdy zaimplementuję schemat stosujący funkcję do tablicy, mogę teraz pisać tak:
		
		double[] liczby = {1.0, 5.0, 2.0, 0.0, 2.5};
		System.out.println(Arrays.toString(liczby));
		Algorytmy.zastosuj(x -> x*x, liczby);
		System.out.println(Arrays.toString(liczby));
		
		Algorytmy.zastosuj(Math::sqrt, liczby);
		System.out.println(Arrays.toString(liczby));
		
		Algorytmy.zastosuj(x -> 10*x + 1, liczby);
		System.out.println(Arrays.toString(liczby));
	}

}
