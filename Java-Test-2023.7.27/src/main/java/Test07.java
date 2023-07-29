import jdk.nashorn.internal.runtime.JSErrorType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Test07 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        //打开百度首页
        webDriver.get("https://www.baidu.com");
        //搜索521
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("521");
        //点击
        webDriver.findElement(By.cssSelector("#su")).click();
        //强制等待3秒
        sleep(3000);
        //浏览器后退
        webDriver.navigate().back();
        //强制等待3秒
        sleep(3000);
        //浏览器前进
        webDriver.navigate().forward();
    }
}
