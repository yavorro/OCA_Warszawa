package p07_tablice;

import java.util.Arrays;

public class Tablice3 {

	public static void main(String... argumenty) {
		
		int[][] a = new int[3][5];
		//NK int[][] a2 = new int[3,5];
		
		System.out.println(a.length); // 3
		System.out.println(a[0].length); // 5
		System.out.println();
		
		// regularna macierz
		a[0][4] = 44;
		a[1][2] = 22;
		
		System.out.println(a[0][4]);
		System.out.println("a: " + a + " , zawartość: " + Arrays.toString(a));
		System.out.println("a[0]: " + a[0]+ " , zawartość: " + Arrays.toString(a[0]));
		System.out.println();
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.deepToString(a));
		System.out.println();
		
		int[][] b = new int[4][];
		System.out.println(Arrays.toString(b));
		
		// inicjujemy poszczególne wiersze
		b[0] = new int[7];
		Arrays.fill(b[0], 3);
		b[1] = new int[] {7,8,9};
		b[2] = null;
		b[3] = new int[0]; // pusta tablica i null to są różne rzeczy
		System.out.println(Arrays.deepToString(b));
		
		String[][] c = {
				{"Ala", "Ola", "Ela"},
				{"Jacek", "Placek"},
				null,
				{},
		};
		
		System.out.println(Arrays.deepToString(c));
	}

}
