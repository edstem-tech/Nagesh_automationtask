package com.test.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.browsersettings.Base;
import com.pom.classes.CycleTimes;
import com.pom.classes.LifecycleInnovation;
import com.pom.classes.SuccessRates;
import com.pom.classes.SummaryTab;



public class VerifyRandDApplication extends Base
{
	WebDriver driver;
	SummaryTab summarytab;
	LifecycleInnovation lifecycleInnovation;
	CycleTimes cycletimes;
	SuccessRates successrates;

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browser) 
	{
		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
			driver = Base.chromeBrowser();
			System.out.println("chrome browser");
		}
		
		if(browser.equals("FireFox"))
		{
			driver = Base.firefoxBrowser();
			System.out.println("firefox browser");
		}
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void initializeObjects()
	{
		
		System.out.println("launching R&D MarketPlace website");
		summarytab = new SummaryTab(driver);
		lifecycleInnovation = new LifecycleInnovation(driver);
		cycletimes = new CycleTimes(driver);
		successrates = new SuccessRates(driver);
		
		driver.get(prop.getProperty("URL"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void verifywebsite()
	{
		String currentURL = driver.getCurrentUrl();

		Assert.assertEquals(currentURL, "http://ec2-3-84-237-200.compute-1.amazonaws.com:4040/rp/main" );
		System.out.println("PASS...!!!");
	}
	
	@Test (priority=1)
	public void summaryTabTest() throws InterruptedException
	{
		System.out.println("-----------------SUMMARY TAB--------------------------");
		summarytab.GeneticValidation();
		summarytab.Immunomodulation();
		summarytab.PortfolioOwner();
		summarytab.ResearchUnit();
		summarytab.Modality();
		summarytab.LifecyclePhases();
		summarytab.Time();
		summarytab.BusinessTab();
		summarytab.ScienceTab();
	
	}
	
	@Test (priority=2)
	public void lifecycleInnovationTabTest() throws InterruptedException
	{
		System.out.println("-----------------LIFECYCLE INNOVATION--------------------------");
		lifecycleInnovation.clickOnAllCards();
		lifecycleInnovation.verifyAllCharts();
		lifecycleInnovation.verifyScienceTabCharts();
	}
	
	@Test (priority=3)
	public void cycleTimes() throws InterruptedException
	{
		System.out.println("-----------------CYCLE TIMES--------------------------");
		cycletimes.verifyBusinessTab();
		cycletimes.verifyScienceTab();
		
	}
	
	@Test (priority=4)
	public void successRates() throws InterruptedException
	{
		System.out.println("-----------------SUCCESS RATES--------------------------");
		successrates.BusinessTab();
		successrates.ScienceTab();
	}
	
	@AfterClass
	public void afterClass()
	{
		summarytab=null;
		driver.close();
		System.out.println("close");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
