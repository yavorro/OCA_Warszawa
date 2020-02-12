package p90_przyklady.pracownicy;

import java.time.LocalDate;
import java.util.Objects;

// To jest przykład "klasy modelu", czyli klasy, której obiekty przechowują dane, są "rekordami".
// W typowej aplikacji jest tworzonych dużo obiektów takiej klasy.
public class Employee {
	private int id;
	private String firstName, lastName;
	private String jobTitle;
	private int salary;
	private LocalDate hireDate;
	private String departmentName;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String country;
	
	public Employee(int id, String firstName, String lastName, String jobTitle, int salary, LocalDate hireDate,
			String departmentName, String streetAddress, String postalCode, String city, String country) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.hireDate = hireDate;
		this.departmentName = departmentName;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", jobTitle=" + jobTitle
				+ ", salary=" + salary + ", hireDate=" + hireDate + ", departmentName=" + departmentName
				+ ", streetAddress=" + streetAddress + ", postalCode=" + postalCode + ", city=" + city + ", country="
				+ country + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, departmentName, firstName, hireDate, id, jobTitle, lastName, postalCode,
				salary, streetAddress);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(departmentName, other.departmentName) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(hireDate, other.hireDate) && id == other.id
				&& Objects.equals(jobTitle, other.jobTitle) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(postalCode, other.postalCode) && salary == other.salary
				&& Objects.equals(streetAddress, other.streetAddress);
	}
}
