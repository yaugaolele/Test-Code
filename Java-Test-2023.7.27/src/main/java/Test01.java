import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static java.lang.Thread.sleep;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        int flag = 0;
        //创建一个ChromeOptions对象
        ChromeOptions options = new ChromeOptions();
        //允许访问所有
        options.addArguments("--remote-allow-origins=*");
        //创建驱动
        WebDriver webDriver = new ChromeDriver(options);
        //打开百度首页
        webDriver.get("https://www.baidu.com");
        //找到百度搜索输入框
//        WebElement element = webDriver.findElement(By.cssSelector(".s_ipt"));
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"kw\"]"));
        //输入“软件测试”
        //通过sendKeys来输入内容
        element.sendKeys("软件测试");
        //找到百度一下按钮
        //点击
        webDriver.findElement(By.cssSelector("#su")).click();
        sleep(3000);
        //校验
        //找到搜索结果
        List<WebElement> elements = webDriver.findElements(By.cssSelector("a em"));
        for (int i = 0; i < elements.size(); i++) {
            //如果返回的结果有软件测试，证明测试通过，否则测试不通过
            if (elements.get(i).getText().equals("测试")) {
                flag = 1;
                System.out.println("测试通过");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("测试不通过");
        }
    }
}
