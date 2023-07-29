package JunitTest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JunitTest11 {
    @Order(1)
    @Test
    void D() {
        System.out.println("D");
    }
    @Order(2)
    @Test
    void A() {
        System.out.println("A");
    }
    @Order(3)
    @Test
    void C() {
        System.out.println("C");
    }
    @Order(4)
    @Test
    void B() {
        System.out.println("B");
    }
}
