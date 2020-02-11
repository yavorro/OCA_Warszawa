package p15_wyjatki;

public class ZasadyWyjatkow3 {

	public static void main(String[] args) {
	
		try {
			System.out.println();
		} catch(ArithmeticException | NullPointerException | NumberFormatException e) {
			System.out.println("multicatch złapał " + e.getMessage());
		}
/*
		try {
			System.out.println();
		} catch(NumberFormatException | IllegalArgumentException e) {
			// nie kompiluje sie bo NumberFormatException jest podklasą IllegalArgumentException
			System.out.println("multicatch złapał " + e.getMessage());
		}

		try {
			System.out.println();
		} catch(Exception | NullPointerException e) {
			System.out.println("multicatch złapał " + e.getMessage());
		}
*/
	}
}
