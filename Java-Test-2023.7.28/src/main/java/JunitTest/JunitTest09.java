package JunitTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class JunitTest09 {
    @ParameterizedTest
    @CsvSource({"1,2", "3,4"})
    void Test01(String str, int num) {
        System.out.println(str + " : " + num);
    }
}
