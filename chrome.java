package Week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class chrome {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Janani");
		driver.findElement(By.name("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.name("createLeadForm_description")).sendKeys("Located at pazhavanthangal");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jananinathan2001@gmail.com");
		driver.findElement(By.id("Create Lead")).click();
		driver.findElement(By.id("subMenuButton")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Must Visit");
		driver.findElement(By.id("Update")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
