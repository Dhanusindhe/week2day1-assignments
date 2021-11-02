package assignmentweek2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhanwanth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Y");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/24/99");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8682098211");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Irfan");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No 159 'Q' Block");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("V.O.C Nagar Tondiarpet");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600210");
		driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']")).sendKeys("India");
		driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")).sendKeys("TAMILNADU");
		String text = driver.findElement(By.xpath("//span[text()='First name']")).getText();
		System.out.println(text);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("submitButton")).click();

	}
}
