package com.pom.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CycleTimes 
{
	WebDriver driver;
	
	@FindBy (xpath="//div[text()='CYCLE TIMES']") private WebElement cycleTimesTab;
	
	@FindBy (xpath="(//div/p[contains(text(), 'Duration of')])[1]") private WebElement firstCard;
	@FindBy (xpath="(//div/p[contains(text(), 'Share of projects')])[1]") private WebElement secondCard;
	@FindBy (xpath="(//div/p[contains(text(), 'Median acceleration /')])[1]") private WebElement thirdCard;
	@FindBy (xpath="(//div/p[contains(text(), 'Median time spent')])[1]") private WebElement fourthCard;
	@FindBy (xpath="//div[@class='stacked-bar-chart']") private WebElement allCardChart;
	
	@FindBy (xpath="//span[text()='OUTLIER']") private WebElement outlier;
	@FindBy (xpath="//div[@class='scatter-plot-chart']") private WebElement outlierChart;
	@FindBy (xpath="//span[text()='View Projects List']") private WebElement viewProjectList;
	@FindBy (xpath="//div[@class='main-table']") private WebElement projectListTable;
	
	@FindBy (xpath="//span[text()='Science']") private WebElement science;
	@FindBy (xpath="(//div/p[contains(text(), 'Speed Enablers')])[1]") private WebElement firstScienceCard;
	@FindBy (xpath="(//div/p[contains(text(), 'ractability score')])[1]") private WebElement secondScienceCard;
	@FindBy (xpath="(//div/p[contains(text(), 'C2LO rea')])[1]") private WebElement thirdScienceCard;
	@FindBy (xpath="//div[@class='display-chart']") private WebElement comparativeScienceChart;
	
	@FindBy (xpath="//span[text()='Volume']") private WebElement volume;
	@FindBy (xpath="//span[text()='%']") private WebElement percentage;
	
	
	public CycleTimes(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
//Business Tab
	
	public void verifyBusinessTab() throws InterruptedException
	{
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].scrollIntoView(true);", science);
		Thread.sleep(4000);
		exe.executeScript("arguments[0].click();", cycleTimesTab);
		//cycleTimesTab.click();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		exe.executeScript("arguments[0].click();", firstCard);
		//firstCard.click();
		Thread.sleep(2000);
		System.out.println("First Card Chart:: "+allCardChart.isDisplayed());
		exe.executeScript("arguments[0].click();", secondCard);
		//secondCard.click();
		Thread.sleep(2000);
		System.out.println("Second Card Chart:: "+allCardChart.isDisplayed());
		exe.executeScript("arguments[0].click();", thirdCard);
		//thirdCard.click();
		Thread.sleep(2000);
		System.out.println("Third Card Chart:: "+allCardChart.isDisplayed());
		exe.executeScript("arguments[0].click();", fourthCard);
		//fourthCard.click();
		Thread.sleep(2000);
		System.out.println("Fourth Card Chart:: "+allCardChart.isDisplayed());
		exe.executeScript("arguments[0].click();", outlier);
		//outlier.click();
		Thread.sleep(2000);
		System.out.println("Outlier Chart:: "+outlierChart.isDisplayed());
		
		exe.executeScript("arguments[0].click();", viewProjectList);
		System.out.println("ProjectList Table:: "+projectListTable.isDisplayed());
		
		exe.executeScript("arguments[0].scrollIntoView(true);", science);
		Thread.sleep(4000);	
	}
	
	public void verifyScienceTab() throws InterruptedException
	{
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].click();", science);
		Thread.sleep(4000);	
		
		exe.executeScript("arguments[0].click();", firstScienceCard);
		//firstScienceCard.click();
		Thread.sleep(2000);
		System.out.println("First Science Tab Card Chart:: "+comparativeScienceChart.isDisplayed());
		exe.executeScript("arguments[0].click();", secondScienceCard);
		//secondScienceCard.click();
		Thread.sleep(2000);
		System.out.println("Second Science Tab Card Chart:: "+comparativeScienceChart.isDisplayed());
		exe.executeScript("arguments[0].click();", thirdScienceCard);
		//thirdScienceCard.click();
		Thread.sleep(2000);
		System.out.println("Third Science Tab Card Chart:: "+comparativeScienceChart.isDisplayed());
		Thread.sleep(2000);
		if(volume.isEnabled() && percentage.isEnabled())
		{
			exe.executeScript("arguments[0].click();", volume);
			Thread.sleep(2000);
			exe.executeScript("arguments[0].click();", percentage);
		}
		else {
			System.out.println("FAIL:: Volume and % are not clicked");
		}
	}
	
	
	
	

	

}
