package JunitTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JunitTest02 {
    @Test
    void Test01() {
        System.out.println("这是JunitTest02里面的Test01");
    }
    @Test
    void Test02() {
        System.out.println("这是JunitTest02里面的Test02");
    }
    @Disabled
    @Test
    void Test03() {
        System.out.println("这是JunitTest02里面的Test03");
    }
}
