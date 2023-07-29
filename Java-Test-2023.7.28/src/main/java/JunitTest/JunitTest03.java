package JunitTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JunitTest03 {
    @Test
    void Test01() {
        System.out.println("这是JunitTest03里面的Test01");
    }
    @Test
    void Test02() {
        System.out.println("这是JunitTest03里面的Test02");
    }
    @Test
    void Test03() {
        System.out.println("这是JunitTest03里面的Test03");
    }
    @BeforeAll
    static void SetUp() {
        System.out.println("这是BeforeAll里面的语句");
    }
    @AfterAll
    static void TearDown() {
        System.out.println("这是AfterAll里面的语句");
    }
}
