import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test06 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        //判断元素是否可以被点击
        WebDriverWait wait = new WebDriverWait(webDriver, 1);

        wait.until(ExpectedConditions.titleIs("百度一下，你就知道"));
    }
}
