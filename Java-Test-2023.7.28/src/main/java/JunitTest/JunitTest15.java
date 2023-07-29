package JunitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTest15 {
    @Test
    void Test01() {
        String str = "1";
        Assertions.assertNotNull(str);
        System.out.println(str);
    }
}
