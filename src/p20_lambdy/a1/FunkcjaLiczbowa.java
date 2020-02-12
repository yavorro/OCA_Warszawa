package p20_lambdy.a1;

// Gdy interfejs zzwier dokładnie jedną metodę bez implementacji (czyli bez default),
// to jest to "interfejs funkcyjny" i można używać lambdy, aby tworzyć obiekty zgodne z tym interfejsem.
public interface FunkcjaLiczbowa {
	
	double oblicz(double arg);
	
/* Gdyby ta metoda miała domyślną implementację, to nie dałoby się używać lambd:
	 
	default double oblicz(double arg) {
		return 0;
	}
	
	Gdyby w interfejsie było więcej metod bez implementacji, też byłoby źle.
*/

}
