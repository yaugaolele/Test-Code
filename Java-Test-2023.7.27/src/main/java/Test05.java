import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test05 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.baidu.com");
        String url = webDriver.getCurrentUrl();
        String title = webDriver.getTitle();
        if (url.equals("https://www.baidu.com/") && title.equals("百度一下，你就知道")) {
            System.out.println("当前页面url: " + url + ", 当前页面title：" + title);
            System.out.println("测试通过");
        }else {
            System.out.println("测试不通过");
        }
    }
}
