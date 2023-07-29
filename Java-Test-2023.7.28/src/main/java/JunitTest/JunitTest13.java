package JunitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitTest13 {
    @ParameterizedTest
    @ValueSource(ints = {1})
    void Test01(int num) {
        System.out.println(num);
        //在这里判断接收到的参数是不是与预期的不相符，也就是断言不相等
        Assertions.assertNotEquals(1,num);
    }
}
