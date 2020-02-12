package p32_streamy.a3_redukcje_i_grupowanie;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* Przykład własnej definicji Collectora.
 * Tylko, aby pokazać, jak one działają.
 * Collector o funkcjonalności łączenia napisów istnieje: Collectors.joining();
 */
public class CollectorLaczacyNapisy	implements Collector<String, StringBuilder, String> {

	@Override
	public Supplier<StringBuilder> supplier() {
		// nie tak: return new StringBullder();
		
		return StringBuilder::new;
	}

	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		return StringBuilder::append; // append(String)
	}

	@Override
	public BinaryOperator<StringBuilder> combiner() {
		return StringBuilder::append; // append(StringBuilder)
	}

	@Override
	public Function<StringBuilder, String> finisher() {
		return StringBuilder::toString;
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();				
	}
}
