package p29_eksperymenty.zad50;

import java.util.ArrayList;
import java.util.List;

public class Sorter {

	public static void main(String[] args) {

		List p = new ArrayList();
		p.add(7);
		p.add(2);
		p.add(5);
		p.add(2);

		//p.sort();
		p.sort(null);

		System.out.println(p);
	}
}
