import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test04 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
        String button_value = webDriver.findElement(By.cssSelector("#su")).getAttribute("value");
        if (button_value.equals("百度一下")) {
            System.out.println("测试通过");
        }else {
            System.out.println(button_value);
            System.out.println("测试不通过");
        }
    }
}
