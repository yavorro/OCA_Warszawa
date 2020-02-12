package p90_przyklady.pracownicy.podejscie_funkcyjne;

import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import p90_przyklady.pracownicy.Employee;
import p90_przyklady.pracownicy.ObslugaCSV;

public class Strumienie2 {

	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.wczytajDaneScanner("pracownicy.csv");
		
		double srednia = lista.stream()
			.mapToInt(Employee::getSalary)
			.average()
			.getAsDouble();
		System.out.println("Średnia wszystkich: " + srednia);

		
		String jobTitle = "Programmer";
		
		OptionalDouble optSrednia = lista.stream()
			.filter(emp -> Objects.equals(emp.getJobTitle(), jobTitle))
			.mapToInt(Employee::getSalary)
			.average();
		
		if(optSrednia.isPresent()) {
			double sredniaWybrnaych = optSrednia.getAsDouble();
			System.out.println("Średnia na stanowisku " + jobTitle + " wynosi " + sredniaWybrnaych);
		} else {
			System.out.println("Nie ma pracowników o stanowisku " + jobTitle);
		}
	}

}
