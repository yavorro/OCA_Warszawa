package p32_streamy.a2_przeglad_operacji;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import p90_przyklady.pracownicy.Employee;
import p90_przyklady.pracownicy.ObslugaCSV;

public class MinMax {

	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.wczytajDaneScanner("pracownicy.csv");
		
		Optional<Employee> min = lista.stream().min(Comparator.comparing(Employee::getSalary));
		Optional<Employee> max = lista.stream().max(Comparator.comparing(Employee::getSalary));

		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println();
		
		if(min.isPresent()) {
			System.out.println("Znaleziono minimum:");
			Employee emp = min.get();
			System.out.println(emp.getFirstName() + " " + emp.getLastName() + " zarabia " + emp.getSalary());
		} else {
			System.out.println("nie ma minimum");
		}
		
		if(max.isPresent()) {
			System.out.println("Znaleziono maximum:");
			Employee emp = max.get();
			System.out.println(emp.getFirstName() + " " + emp.getLastName() + " zarabia " + emp.getSalary());
		} else {
			System.out.println("nie ma maximum");
		}
		System.out.println();
		
		
		String [] stanowiska = {"Programmer", "Shipping Clerk", "Brygadier"};
		for (String stanowisko : stanowiska) {
			String tekst = lista.stream()
				.filter(emp -> Objects.equals(emp.getJobTitle(), stanowisko))
				.max(Comparator.comparing(Employee::getSalary))
				.map(emp -> emp.getFirstName() + " " + emp.getLastName() + " zarabia " + emp.getSalary())
				.orElse("nie ma takiego gościa");
			
			// powyższe map dotyczy Optionali, a nie Streamów
			
			System.out.println("Najbogatszy " + stanowisko + ": " + tekst);
		}
	}

}
