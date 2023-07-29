package JunitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitTest14 {
    @ParameterizedTest
    @ValueSource(ints = {1})
    void Test01(int num) {
        System.out.println(num);
        //判断断言是不是空值
        Assertions.assertNull(num);
    }
}
