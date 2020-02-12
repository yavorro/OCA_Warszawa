package p32_streamy.a3_redukcje_i_grupowanie;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Silnia_Reduce {
	static long silniaFun(int n) {
		return LongStream.rangeClosed(2, n)
				.reduce(1L, (ak, i) -> ak * i);
	}

	static long silniaKlasyczna(int n) {
		// działa jak taka pętla:
		long ak = 1L;
		for(int i = 2; i <= n; i++) {
			ak = ak * i;
		}
		return ak;
	}
	
	static long silniaFun2(int n) {
		return LongStream.rangeClosed(2, n)
				.reduce(1, Math::multiplyExact);
	}

	static BigInteger silniaFunBig(int n) {
		return LongStream.rangeClosed(2, n)
			.mapToObj(BigInteger::valueOf)
			.reduce(BigInteger.ONE, BigInteger::multiply);
	}

	public static void main(String[] args) {
		System.out.println(silniaFun(5));
		System.out.println(silniaFun2(5));
		
		try {
			System.out.println(silniaFun2(21));
		} catch (Exception e) {
			System.out.println("overflow");
		}
		
		System.out.println(silniaFunBig(5));
		System.out.println(silniaFunBig(100));
	}
}
