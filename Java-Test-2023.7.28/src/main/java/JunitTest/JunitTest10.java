package JunitTest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestMethodOrder(MethodOrderer.Random.class)
public class JunitTest10 {
    @Order(2)
    @Test
    void B() {
        System.out.println("B测试用例");
    }

    @Order(3)
    @Test
    void Test01() {
        System.out.println("这是Test01测试用例");
    }

    @Order(1)
    @Test
    void A() {
        System.out.println("A测试用例");
    }

    @Order(4)
    @Test
    void Test02() {
        System.out.println("被忽略的测试用例");
    }
}
