package p06_importowanie;

// W tej wersji nie stosujemy importów,
// do innych odwołujemy się poprzez "nazwy kwalifikowane"
public class Importy1 {
	public static void main(String[] args) {
		String s = javax.swing.JOptionPane.showInputDialog("Podaj liczbę");
		double a = Double.parseDouble(s);
		
		double wynik = p06_funkcje_metody.FunkcjeGeometryczne.poleKwadratu(a);
		javax.swing.JOptionPane.showMessageDialog(null, "Pole kwadratu wynosi\n" + wynik);
	}

}
