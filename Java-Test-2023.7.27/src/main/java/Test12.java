import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class Test12 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("软件测试");
        webDriver.findElement(By.cssSelector("#su")).click();
        sleep(3000);
        //找到图片按钮
        WebElement webElement = webDriver.findElement(By.cssSelector("#s_tab > div > a.s-tab-item.s-tab-item_1CwH-.s-tab-tieba_3gnzZ.s-tab-tieba"));
        //鼠标右击
        Actions actions = new Actions(webDriver);
        sleep(3000);
        actions.moveToElement(webElement).contextClick().perform();
    }
}
