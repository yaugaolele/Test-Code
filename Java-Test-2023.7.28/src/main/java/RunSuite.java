import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
//通过class测试用例运行
@SelectClasses(value = {Test03.class,Test04.class})
public class RunSuite {
}
