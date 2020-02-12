package p90_przyklady.pracownicy.podejscie_imperatywne;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import p90_przyklady.pracownicy.Employee;
import p90_przyklady.pracownicy.ObslugaCSV;

public class Grupowanie4 {
	
	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.wczytajDaneScanner("pracownicy.csv");

		Map<String, Integer> sumy = new TreeMap<>();
		Map<String, Integer> ilosci = new TreeMap<>();
				
		for (Employee emp : lista) {
			final String jobTitle = emp.getJobTitle();
			
//			sumy.merge(jobTitle, emp.getSalary(), (ileBylo,zmiana)->(ileBylo+zmiana));
//			ilosci.merge(jobTitle, 1, (x,y)->(x+y));

			sumy.merge(jobTitle, emp.getSalary(), Math::addExact);
			ilosci.merge(jobTitle, 1, Math::addExact);
		}
		
		for (String job : sumy.keySet()) {
			int ilosc = ilosci.get(job);
			int suma = sumy.get(job);
			double avg = (double)suma / ilosc;
			System.out.printf("%32s : %2d :%10.2f\n", job, ilosc, avg);
		}
	}

}
