package p09_inicjalizacja.v4;

public class A {

	A() {
		System.out.println("A()");
		System.out.println(" w konstruktorze x == " + x); // OK
	}

	{
		System.out.println("init A 1");
		//NK System.out.println(" w init 1 x == " + x); // zle, bo zmienna jest dalej
		y = 20;
		// System.out.println(y);
		z = 50;
		//NK System.out.println(z);
	}
	
	int x = Utils.przypisz(44);
	int y = 10;
	final int z;

	{
		System.out.println("init A 2");
		System.out.println(" w init 2 x == " + x); // OK, bo zmienna była wcześniej
		System.out.println(" w init 2 y == " + y);
	}

	A(int i) {
		System.out.println("A(int) " + i);
	}

}
