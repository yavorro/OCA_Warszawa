package p06_funkcje_metody;

public class KlasaUzywajacaFunkcji {

	public static void main(String[] args) {
		// Teraz do metody statycznej z innej klasy odwołamy się poprzez tej klasy:
		// klasa jest w tym samym pakiecie - nie muszę jej importować
		System.out.println(FunkcjeGeometryczne.poleKwadratu(3.3));
		
		// Jest dostęp do metody, która ma domyślną widoczność (nie jest ani private ani public)
		System.out.println(FunkcjeGeometryczne.poleProstokata(4, 5));
	}

}
