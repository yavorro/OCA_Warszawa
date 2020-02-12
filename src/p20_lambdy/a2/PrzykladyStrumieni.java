package p20_lambdy.a2;

import java.util.stream.DoubleStream;

public class PrzykladyStrumieni {

	public static void main(String[] args) {
		double[] liczby = {3, 5, 7, 12.5, 3.14, 0, 3};
		
		DoubleStream.of(liczby)
			.map(x -> x*x)
			.forEach(System.out::println);
	}

}
