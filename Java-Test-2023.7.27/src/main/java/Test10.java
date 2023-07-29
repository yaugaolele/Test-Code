import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Test10 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        //打开百度首页
        webDriver.get("https://www.baidu.com");
        //搜索521
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("软件测试");
        //点击
        webDriver.findElement(By.cssSelector("#su")).click();
        //强制等待3秒
        sleep(3000);
        //浏览器界面的高度和宽度的设置
        webDriver.manage().window().setSize(new Dimension(500, 400));
    }
}
