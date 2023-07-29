import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import static java.lang.Thread.sleep;

public class Test16 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.cssSelector("#s-top-left > a:nth-child(1)")).click();
        sleep(3000);
        //通过getWindowHandles获取所有窗口句柄。
        //通过getWindowHandle获取的get打开的页面窗口句柄。
        System.out.println(webDriver.getWindowHandle());
        Set<String> handles = webDriver.getWindowHandles();
        //获取到最后一个打开的窗口的句柄
        String target_handle = "";
        for (String handle : handles) {
            target_handle = handle;
        }
        //让驱动器跳转到当前窗口的句柄
        webDriver.switchTo().window(target_handle);
        sleep(3000);
        webDriver.findElement(By.cssSelector("#ww")).sendKeys("新闻联播");
        webDriver.findElement(By.cssSelector("#s_btn_wr")).click();
    }
}
