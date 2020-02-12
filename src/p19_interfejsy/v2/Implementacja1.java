package p19_interfejsy.v2;

public class Implementacja1 implements Interfejs {

	// implementacja musi zdefiniować te metody, które nie miały implementacji w interfejsie
	// a może zaimplementować (nadpisać) metody default (niekoniecznie wszystkie)
	
	public int wartosc() {
		return 1313;
	}
	
	public void nowaMetoda() {
		// będą w implementacji interfejsu można odwoływać się do stałych
		System.out.println(NAZWA);
		
		// nie można odwoływać się w ten sposób do metod statycznych
		//NK powtorz(this, 5);
		
		Interfejs.powtorz(this, 5);
	}

}
