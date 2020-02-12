package p90_przyklady.pracownicy.podejscie_imperatywne;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import p90_przyklady.pracownicy.Employee;
import p90_przyklady.pracownicy.ObslugaCSV;

public class Grupowanie0 {
	
	static double sredniaDlaStanowiska(List<Employee> lista, String job) {
		int ilosc = 0;
		int suma = 0;
		for (Employee emp : lista) {
			if(Objects.equals(emp.getJobTitle(), job)) {
				ilosc++;
				suma += emp.getSalary();
			}
		}
		return 1.0 * suma / ilosc;
	}

	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.wczytajDaneScanner("pracownicy.csv");
		Set<String> jobs = new TreeSet<>();
		for (Employee emp : lista) {
			jobs.add(emp.getJobTitle());
		}

		System.out.println("Stanowiska: " + jobs);
		System.out.println();
		
		for (String job : jobs) {
			double avg = sredniaDlaStanowiska(lista, job);
			System.out.printf("%32s : %10.2f\n", job, avg);
		}
	}

}
