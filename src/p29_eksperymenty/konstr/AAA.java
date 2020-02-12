package p29_eksperymenty.konstr;

public class AAA {
	
	void AAA() {
		System.out.println("jestem metodą AAA");
	}
	
	public static void main(String[] args) {
		System.out.println("1");
		AAA a = new AAA(); // nic nie pisze
		System.out.println("2");
		a.AAA(); // pisze jestem metodą AAA
		System.out.println("3");
	}

}
