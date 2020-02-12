package p06_importowanie;

import javax.swing.*;

import p06_funkcje_metody.*;

//oba te pakiety zawierają klasę List
import java.util.*;
import java.awt.*;

// Tu stosuję import * - import wszystkich klas z podanego pakietu
// - to nie importuje "podpakietów"
// - nazwy zaimportowane za pomocą gwiazdki mają najniższy priorytet
public class Importy3 {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Podaj liczbę");
		double a = Double.parseDouble(s);
		
		double wynik = FunkcjeGeometryczne.poleKwadratu(a);
		JOptionPane.showMessageDialog(null,
				"Pole kwadratu wynosi\n" + wynik);
		
		// W tym momencie odwołuję się do mojej klasy JButton z bieżącego pakietu, a nie tej ze swinga
		// Klasy z bieżącego pakietu mają wyższy priorytet niż klasy importowane z gwiazdką.
		JButton button = new JButton();
		System.out.println(button.getClass());
		
		// Importowałem java.util.* i java.awt.*
		// Teraz niejednoznaczne = błąd kompilacji
		// List lista;
	}

}
