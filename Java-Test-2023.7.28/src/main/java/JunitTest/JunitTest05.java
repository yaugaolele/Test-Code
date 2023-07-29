package JunitTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitTest05 {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void Test01(int num) {
        System.out.println(num);
    }
    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    void Test02(String number) {
        System.out.println(number);
    }
}
