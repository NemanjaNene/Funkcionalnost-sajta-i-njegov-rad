package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class probaproba2 {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milica\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.get("https://sso.teachable.com/secure/9521/identity/forgot_password");
		driver.findElement(By.cssSelector("#email")).sendKeys("nemanjaklara@gmail.com");
		driver.findElement(By.cssSelector(".btn-primary.button.p-v-2-xs.p-h-5-xs.m-v-3-xs.col-5-xs")).click();
	}

}

        //    SAAAMMM SI RESIO PROBLEMMMM DOKTOREEEEEEEE !!!!!!!!!
       //ukoliko dodje do situacije da se mora koristiti XPath, radimo sledece:
       // pisani kod koji je npr "#" prebacujemo u prepoznatljivi xPath tako sto cemo ispisati novi kod koji ce sadrzati potrebne reci
       // input[@placeholder='Name']
       // kod koji smo napisali u Xpath-u mozemo preveriti da li se mecuje u SelectorsHub-u
       // kod koji mi pisemo u nas program je sledeci:
       // driver.findElement(By.xpath("//input[placeholder='Name']")).sendKeys("Nemanja");