package JunitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitTest04 {
    @Test
    void Test01() {
        System.out.println("这是JunitTest04里面的Test01");
    }
    @Test
    void Test02() {
        System.out.println("这是JunitTest04里面的Test02");
    }
    @Test
    void Test03() {
        System.out.println("这是JunitTest04里面的Test03");
    }
    @BeforeEach
    void BeforeEachTest() {
        System.out.println("这是BeforeEach里面的语句");
    }
    @AfterEach
    void AfterEachTest() {
        System.out.println("这是AfterEach里面的语句");
    }
}
