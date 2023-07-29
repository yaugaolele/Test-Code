import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Test13 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("软件测试");
        sleep(3000);
        webDriver.findElement(By.cssSelector("#su")).click();
        sleep(3000);
        //关闭整个浏览器
//        webDriver.quit();
        //关闭当前的页面,get方法获取到哪一个浏览器的页面，此时关闭的就是哪一个
        webDriver.close();
    }
}
