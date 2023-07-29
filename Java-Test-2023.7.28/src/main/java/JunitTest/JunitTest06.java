package JunitTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class JunitTest06 {
    @ParameterizedTest
    @CsvSource({"1","2","3"})
    void Test02(String num) {
        System.out.println(num);
    }

}
