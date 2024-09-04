package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsILCarro {
WebDriver driver=new ChromeDriver();
@Test
    public void CssSelector(){
driver.navigate().to("https://ilcarro.web.app/search");
driver.manage().window().maximize();

    WebElement elementCity=driver.findElement(By.cssSelector("input[id='city']"));
    pausa(3);
    elementCity.sendKeys("Tel Aviv-Yafo, Israel");

    WebElement elementDates= driver.findElement(By.cssSelector("input[id='dates']"));
    elementDates.sendKeys("9/4/2024 - 9/12/2024");
pausa(2);


    WebElement elementBtn=driver.findElement(By.cssSelector("button[type='submit']"));
elementBtn.click();
pausa(3);
    driver.quit();
}
private void pausa(int time){
    try {
        Thread.sleep(time*1000L);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
