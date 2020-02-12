package p90_przyklady.pracownicy.podejscie_funkcyjne;

import java.io.IOException;
import java.util.Objects;
import java.util.OptionalDouble;

import p90_przyklady.pracownicy.Employee;
import p90_przyklady.pracownicy.ObslugaCSV;

public class Strumienie3 {

	public static void main(String[] args) {
		String jobTitle = "Programmer";
		
		try {
			OptionalDouble optSrednia = ObslugaCSV.wczytajDaneStream("pracownicy.csv")
				.filter(emp -> Objects.equals(emp.getJobTitle(), jobTitle))
				.mapToInt(Employee::getSalary)
				.average();
			
			if(optSrednia.isPresent()) {
				double sredniaWybrnaych = optSrednia.getAsDouble();
				System.out.println("Średnia na stanowisku " + jobTitle + " wynosi " + sredniaWybrnaych);
			} else {
				System.out.println("Nie ma pracowników o stanowisku " + jobTitle);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
