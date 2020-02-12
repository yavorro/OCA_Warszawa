package p19_interfejsy.v2;

public interface Interfejs {
	int wartosc();
	
	// Od Javy 8 interfejsy mogą zawierać metody z implementacjami
	// 1) "domyślne" implementacje metod instancyjnych
	default void wypisz() {
		System.out.println(wartosc());
	}
	
	default String tytul() {
		return "Warszawa";
	}
	
	// słowo default jest wymagane (ono w pewnym sensie unieważnia abstract)
	// to jest niepoprawne składniowo:
	/* abstract default void m() {
		System.out.println("cokolwiek");
	}
	*/
	
	
	// 2) metody statyczne
	public static void powtorz(Interfejs obiekt, int n) {
		for(int i = 1; i <= n; i++) {
			obiekt.wypisz();
		}
	}
}
