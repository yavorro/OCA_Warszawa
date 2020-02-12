package p90_przyklady.pracownicy;

import java.util.List;

// To jest przykład klasy, która jest programem (klasy z mainem).
public class TestOdczytu {

	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.wczytajDaneScanner("pracownicy.csv"); 
		System.out.println("Wczytano " + lista.size() + " rekordów.");

		for(Employee employee : lista) {
			System.out.println(employee);
		}
	}

}
