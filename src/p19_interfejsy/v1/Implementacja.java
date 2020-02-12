package p19_interfejsy.v1;

import javax.swing.JButton;

public class Implementacja implements Interfejs {

	public void wypisz() {
		// w klasie, która implementuje interfejs, jest bezpośredni dostęp do stałych deklarowanych w interfejsie
		System.out.println("aaa " + NAZWA);
		System.out.println("aaa " + Interfejs.NAZWA);
	}

	public double oblicz(double arg1, double arg2) {
		return arg1 + arg2;
	}

	public void p() {
		System.out.println("ppp");
		
	}

	public static void main(String[] args) {
		Implementacja obiekt = new Implementacja();
		obiekt.wypisz();
		// klasa "dziedziczy" stałe z interfejsu, który implementuje
		System.out.println(obiekt.NAZWA);
		System.out.println(Implementacja.NAZWA);
		
		// przykład zastosowania:
		JButton button = new JButton();
		button.setHorizontalAlignment(JButton.CENTER);
		// CENTER pochodzi z interfejsu SwingConstants
	}
}
