package p20_lambdy.a2;

/* W tym przykładzie udajemy, że tworzymy pewien "framework",
 * za pomocą którego "zwykli programiści" będą mogli aplikować funkcje liczbowe do tablic.
 */
public class ZastosowaniaFunkcjiLiczbowej {
	
	public static void zastosujdoTablicy(FunkcjaLiczbowa funkcja, double[] tablica) {
		for (int i = 0; i < tablica.length; i++) {
			// Na każdej pozycji w tablicy podmieniamy liczbę na wynik funkcji liczbowej.
			// Inaczej stosujemy funkcję liczbową dla każdego elementu tablicy.
			tablica[i] = funkcja.oblicz(tablica[i]);
		}
	}
	

}
