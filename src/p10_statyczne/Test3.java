package p10_statyczne;

public class Test3 {

	public static void main(String[] args) {
		A a = new A();
		
		//NK A.instancyjna();
		a.instancyjna();
		
		A.statyczna();
		a.statyczna();
	}

}
