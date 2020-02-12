package p20_lambdy.a2;

import java.util.Arrays;

/* To jest taki kod, który będą tworzyć "zwykli programiści".
 * 
 * Tutaj już nie używamy bezpośrednio nazwy FunkcjaLiczbowa ani nazwy oblicz,
 * tylko w miejscu, gdzie jest to oczekiwane, wpisujemy wyrażenia lambda.
 * 
 * */
public class ProgramKtoryKorzystaZNaszegoSchematu {

	public static void main(String[] args) {
		double[] liczby = {1, 3, 5, 10, 5, 100};
		
		System.out.println(Arrays.toString(liczby));
		
		ZastosowaniaFunkcjiLiczbowej.zastosujdoTablicy(x -> x*x, liczby);
		System.out.println(Arrays.toString(liczby));
		
		// ZastosowaniaFunkcjiLiczbowej.zastosujdoTablicy(x -> Math.sqrt(x), liczby);
		ZastosowaniaFunkcjiLiczbowej.zastosujdoTablicy(Math::sqrt, liczby);
		System.out.println(Arrays.toString(liczby));

		ZastosowaniaFunkcjiLiczbowej.zastosujdoTablicy(x -> 10*x, liczby);
		System.out.println(Arrays.toString(liczby));

	}

}
