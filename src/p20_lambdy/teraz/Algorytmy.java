package p20_lambdy.teraz;

public class Algorytmy {
	
	/** Aplikuje funkcję f do wszystkich elementów tablicy t
	 */
	public static void zastosuj(FunkcjaLiczbowa f, double[] t) {
		for (int i = 0; i < t.length; i++) {
			t[i] = f.oblicz(t[i]);
		}
	}
	
}
