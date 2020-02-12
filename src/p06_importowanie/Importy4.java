package p06_importowanie;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;
import static p06_funkcje_metody.FunkcjeGeometryczne.poleKwadratu;
import static java.lang.Math.*;

// Tu stosuję import static - importowanie metod statycznych (i stałych) z klas.
// Wtedy w treści programu możemy wywoływać funkcje za pomocą ich nazw bez pisania klas.
public class Importy4 {
	public static void main(String[] args) {
		String s = showInputDialog("Podaj liczbę");
		double a = parseDouble(s);
		
		double wynik = poleKwadratu(a);
		showMessageDialog(null, "Pole kwadratu wynosi\n" + wynik);
		
		System.out.println("Liczba pi: " + PI);
		System.out.println("Pierwiastek z 2: " + sqrt(2));
	}
}
