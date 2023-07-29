import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //允许所有的请求
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
        sleep(3000);
        //找到百度搜索框，进行输入“软件测试”
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("软件测试");
        //找到百度一下按钮，点击一下
        webDriver.findElement(By.cssSelector("#su")).click();
        //此处的submit与上述的click效果是一样的
//        webDriver.findElement(By.cssSelector("#su")).submit();
        //隐式等待
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.DAYS);
        webDriver.findElement(By.cssSelector("#kw")).clear();
    }
}
