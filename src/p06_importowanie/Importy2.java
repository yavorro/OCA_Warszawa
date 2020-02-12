package p06_importowanie;

import javax.swing.JOptionPane;

import p06_funkcje_metody.FunkcjeGeometryczne;

import javax.swing.JButton;

// Tu stosuję importowanie pojedynczych klas - najczęstsze podejście w praktyce.
public class Importy2 {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Podaj liczbę");
		
		// Nie trzeba impotować klas z pakietu java.lang - przykładem jest Double.
		double a = Double.parseDouble(s);
		
		double wynik = FunkcjeGeometryczne.poleKwadratu(a);
		JOptionPane.showMessageDialog(null, "Pole kwadratu wynosi\n" + wynik);
		
		// Tutaj to jest JButton ze swinga, bo został wprost zaimportowany poleceniem import javax.swing.JButton;
		JButton button = new JButton();
		System.out.println(button.getClass());
	}
	
	// Kolejność szukania nazwy wpisanej w kodzie:
	// 1) bieżąca klasa
	// 2) rzeczy zaimportowane wprost (np. import javax.swing.JButton)
	// 3) bieżący pakiet
	// 4) rzeczy zaimportowane za pomocą * (np. import javax.swing.*)
	
	// Jeśli w różnych pakietach importowanych za pomocą * jest klasa o tej samej nazwie,
	// to odwołanie do tej nazwy jest niejednoznaczne - konfikt nazw, bład kompilacji.
}
