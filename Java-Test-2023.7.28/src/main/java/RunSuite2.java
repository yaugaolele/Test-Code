import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//通过包来运行测试用例
@SelectPackages({"Test1","Test2"})
public class RunSuite2 {
}
