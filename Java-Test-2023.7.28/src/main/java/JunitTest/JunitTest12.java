package JunitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitTest12 {
    @ParameterizedTest
    @ValueSource(ints = {1})
    void Test01(int num) {
        System.out.println(num);
        //在这里判断我们接收到的参数是不是1
        Assertions.assertEquals(1,num);
    }
}
