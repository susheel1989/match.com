package match;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("starting firefox");
		chromeRun();
		firefoxRun();
	}
	
	
	
	public static void chromeRun() throws InterruptedException
	{
		int  userno=142;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://match.com");
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='pageBody']/div[2]/div/p/a")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='ng-app']/div[1]/p/a")).click();
		
		
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regEmail']"));
		email.sendKeys(userno+"@mailinator.com");
		System.out.println(userno+"@mailinator.com");
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regBirthday_Month']")));
		dropdown.selectByVisibleText("January");
		
		Select dropdown_day = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regBirthday_Day']")));
		dropdown_day.selectByIndex(3);
		Select dropdown_year = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regBirthday_Year']")));
		dropdown_year.selectByIndex(10);
		
		Select dropdown_state = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_uccRegistrationLocation_ctl00_ddlStates']")));
		Thread.sleep(1000);
		dropdown_state.selectByVisibleText("Delhi");
		
		Thread.sleep(2000);
		Select dropdown_state_city = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_uccRegistrationLocation_ctl00_ddlCities']")));
		dropdown_state_city.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regGenderMale']")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regGenderSeekFemale']")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regHandle']")).sendKeys("hey"+userno);
		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regPassword']")).sendKeys("F00bar123");
		System.out.println("F00bar123");

		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_btnSubmitReg']")).click();
		//NOW U R LOGGEDIN
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
				
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		
		
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='SelfEssay_Text']")).sendKeys("My friends say I'm the life of the party. I always enjoy cracking people up. I like people who enjoy comedies and have a goofy sense of humor. I also look for compassion and humilityenjoy cracking people up. I like people who enjoy comedies and have a goofy sense of humor. I also look for compassion and humility");
	
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();

		//driver.findElement(By.name(".//*[@id='ctl00_matchHeader_ctl00_PrimaryNavigationRepeater1_ctl03_HyperLink3']/div")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='Next']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		//Navigating to search
		driver.navigate().to("http://in.match.com/search/index.aspx?lid=2");
		
		
		//profile click
		String fav_Name=driver.findElement(By.xpath(".//*[@id='form-search-results']/div[3]/div[2]/div/dl/dd[1]/a")).getText();
		System.out.println(fav_Name);
				
		driver.findElement(By.xpath(".//*[@id='form-search-results']/div[3]/div[2]/div/dl/dd[1]/a")).click();	
	
		Thread.sleep(4000);
		//making fav
		driver.findElement(By.xpath(".//*[@id='module-user']/div[2]/div[1]/a")).click();
	
		Thread.sleep(4000);
		
		//Going to logout
		
		driver.navigate().to("http://in.match.com/login/logout.aspx?lid=3");
		
		//Going to signIN
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(userno+"@mailinator.com");
		
		driver.findElement(By.name("password")).sendKeys("F00bar123");
		driver.findElement(By.xpath(".//*[@id='ng-app']/div/div[2]/form/fieldset[2]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='photo-upload']/div/a[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='home']/div[1]/ul[3]/li[3]/a")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='list-page']/div/label[1]/span")).click();
		Thread.sleep(2000);
		String Fav_check=driver.findElement(By.xpath(".//*[@id='tab-cnt-fave']/div[1]/div/div/div[2]/h3/a")).getText();
		//Assertion check
		
		Assert.assertEquals(fav_Name,Fav_check);
		
}

	
	public static void firefoxRun() throws InterruptedException
	{
		int  userno=241;
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://match.com");
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='pageBody']/div[2]/div/p/a")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='ng-app']/div[1]/p/a")).click();
		
		
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regEmail']"));
		email.sendKeys(userno+"@mailinator.com");
		System.out.println(userno+"@mailinator.com");
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regBirthday_Month']")));
		dropdown.selectByVisibleText("January");
		
		Select dropdown_day = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regBirthday_Day']")));
		dropdown_day.selectByIndex(3);
		Select dropdown_year = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regBirthday_Year']")));
		dropdown_year.selectByIndex(10);
		
		Select dropdown_state = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_uccRegistrationLocation_ctl00_ddlStates']")));
		Thread.sleep(1000);
		dropdown_state.selectByVisibleText("Delhi");
		
		Thread.sleep(2000);
		Select dropdown_state_city = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_uccRegistrationLocation_ctl00_ddlCities']")));
		dropdown_state_city.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regGenderMale']")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regGenderSeekFemale']")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regHandle']")).sendKeys("hey"+userno);
		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_regPassword']")).sendKeys("F00bar123");
		System.out.println("F00bar123");

		driver.findElement(By.xpath(".//*[@id='ctl00_workarea_registrationPageView_ctl00_ShortRegistration1_ctl00_btnSubmitReg']")).click();
		//NOW U R LOGGEDIN
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
				
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		
		
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='SelfEssay_Text']")).sendKeys("My friends say I'm the life of the party. I always enjoy cracking people up. I like people who enjoy comedies and have a goofy sense of humor. I also look for compassion and humilityenjoy cracking people up. I like people who enjoy comedies and have a goofy sense of humor. I also look for compassion and humility");
	
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();

		//driver.findElement(By.name(".//*[@id='ctl00_matchHeader_ctl00_PrimaryNavigationRepeater1_ctl03_HyperLink3']/div")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='Next']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='progress']/a[1]")).click();
		
		//Navigating to search
		driver.navigate().to("http://in.match.com/search/index.aspx?lid=2");
		
		
		//profile click
		String fav_Name=driver.findElement(By.xpath(".//*[@id='form-search-results']/div[3]/div[2]/div/dl/dd[1]/a")).getText();
		System.out.println(fav_Name);
				
		driver.findElement(By.xpath(".//*[@id='form-search-results']/div[3]/div[2]/div/dl/dd[1]/a")).click();	
	
		Thread.sleep(4000);
		//making fav
		driver.findElement(By.xpath(".//*[@id='module-user']/div[2]/div[1]/a")).click();
	
		Thread.sleep(4000);
		
		//Going to logout
		
		driver.navigate().to("http://in.match.com/login/logout.aspx?lid=3");
		
		//Going to signIN
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(userno+"@mailinator.com");
		
		driver.findElement(By.name("password")).sendKeys("F00bar123");
		driver.findElement(By.xpath(".//*[@id='ng-app']/div/div[2]/form/fieldset[2]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='photo-upload']/div/a[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='home']/div[1]/ul[3]/li[3]/a")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='list-page']/div/label[1]/span")).click();
		Thread.sleep(2000);
		String Fav_check=driver.findElement(By.xpath(".//*[@id='tab-cnt-fave']/div[1]/div/div/div[2]/h3/a")).getText();
		//Assertion check
		
		Assert.assertEquals(fav_Name,Fav_check);
		
}
	

}
