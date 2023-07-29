import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk1.8.0_192\\bin\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
    }
}
