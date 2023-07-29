import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//环境测试
public class Test01 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com/");
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("软件测试");
        webDriver.findElement(By.cssSelector("#su")).click();
    }
}
