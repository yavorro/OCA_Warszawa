package p20_lambdy.a2;

// adnotacja opcjonalna - kompilator dodatkowo sprawdzi czy ten interfejs naprawdę jest funkcyjny
@FunctionalInterface
public interface FunkcjaLiczbowa {
	
	double oblicz(double arg);
	
	default String oblicz(String napis) {
		double x = Double.parseDouble(napis);
		double wynik = this.oblicz(x);
		return String.valueOf(wynik);
	}
	
	default FunkcjaLiczbowa zloz(FunkcjaLiczbowa innaFunkcja) {
		return x -> innaFunkcja.oblicz(this.oblicz(x));
	}
	
	static FunkcjaLiczbowa identycznosc() {
		return x -> x;
	}
}
