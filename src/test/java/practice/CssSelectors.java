package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CssSelectors {
WebDriver webDriver=new ChromeDriver();
@Test
    public  void cssSelector(){
    webDriver.navigate().to("https://telranedu.web.app/home");
    webDriver.manage().window().maximize();
    WebElement elementH3 =webDriver.findElement(By.cssSelector("h3"));
    System.out.println(elementH3.getText());
pausa(3);
    WebElement elementAbout=webDriver.findElement(By.cssSelector("a[href=\"/about\"]"));
    elementAbout.click();
    WebElement BtnLogin=webDriver.findElement(By.cssSelector("*[href=\"/login\"]"));
    pausa(3);
    BtnLogin.click();
    WebElement inputEmail= webDriver.findElement(By.cssSelector("input[name='email']"));
    pausa(2);
    inputEmail.sendKeys("my_email");
    pausa(3);
    webDriver.quit();
}
private void pausa(int time){
    try {
        Thread.sleep(time*1000L);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
