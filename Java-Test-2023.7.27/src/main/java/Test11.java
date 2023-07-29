import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Test11 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        //搜索软件测试
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("软件测试");
        sleep(3000);
        //control + A
        webDriver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"A");
        sleep(3000);
        //control + X
        webDriver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"X");
        sleep(3000);
        //control + V
        webDriver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"V");
    }
}
