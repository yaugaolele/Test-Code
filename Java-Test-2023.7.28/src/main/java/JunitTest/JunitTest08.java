package JunitTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class JunitTest08 {
    public static Stream<Arguments> Generator() {
        return Stream.of(Arguments.arguments(
                "1","张三"
        ));
    }

    @ParameterizedTest
    @MethodSource("Generator")
    void Test01(String num, String name) {
        System.out.println(num + ":" + name);
    }
}
