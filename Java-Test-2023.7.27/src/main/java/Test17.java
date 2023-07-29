import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import static java.lang.Thread.sleep;

public class Test17 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.cssSelector("#s-top-left > a:nth-child(1)")).click();
        sleep(3000);
        //关闭整个浏览器
//        webDriver.quit();
        //关闭当前的页面,get方法获取到哪一个浏览器的页面，此时关闭的就是哪一个
        //获取到打开窗口的句柄
        Set<String> handles = webDriver.getWindowHandles();
        //获取到打开的最后一个窗口的句柄
        String target_handle = "";
        for (String handle : handles) {
            target_handle = handle;
        }
        //让驱动器跳转到当前的窗口页面
        webDriver.switchTo().window(target_handle);
//        webDriver.quit();
        webDriver.close();
    }
}
