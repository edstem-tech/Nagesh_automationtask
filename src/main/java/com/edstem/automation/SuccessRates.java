package com.edstem.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessRates {
    WebDriver driver;

    @FindBy(xpath = "//div[text()='SUCCESS RATES']")
    private WebElement successRatesTab;

    @FindBy(xpath = "//div[@class='display-chart']")
    private WebElement businessOutlierChart;
    @FindBy(xpath = "(//span[@class='arrow-icon']//*[local-name()='svg'])[8]")
    private WebElement dropDownListOfOutlier;
    @FindBy(xpath = "(//span[text()='Phase I'])[2]")
    private WebElement dropDownPhaseI;
    @FindBy(xpath = "//span[text()='View Projects List']")
    private WebElement viewProjectList;
    @FindBy(xpath = "//div[@class='main-table']")
    private WebElement projectListTable;

    @FindBy(xpath = "//span[text()='Science']")
    private WebElement science;
    @FindBy(xpath = "(//div/p[contains(text(), 'Biomarker')])[1]")
    private WebElement firstScienceCard;
    @FindBy(xpath = "(//div/p[contains(text(), 'PoPs S')])[1]")
    private WebElement secondScienceCard;
    @FindBy(xpath = "(//div/p[contains(text(), 'TIPS in')])[1]")
    private WebElement thirdScienceCard;
    @FindBy(xpath = "//div[@class='display-chart']")
    private WebElement comparativeScienceChart;

    @FindBy(xpath = "//span[text()='Volume']")
    private WebElement volume;
    @FindBy(xpath = "//span[text()='%']")
    private WebElement percentage;


    public SuccessRates(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void BusinessTab() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].scrollIntoView(true);", science);
        Thread.sleep(4000);

        exe.executeScript("arguments[0].click();", successRatesTab);
        //successRatesTab.click();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        System.out.println("OUTLIER::Pre-Clinical Evaluation Chart:: " + businessOutlierChart.isDisplayed());
        Thread.sleep(2000);
        //exe.executeScript("arguments[0].click();", dropDownListOfOutlier);
        dropDownListOfOutlier.click();
        Thread.sleep(2000);
        exe.executeScript("arguments[0].click();", dropDownPhaseI);
        Thread.sleep(2000);
        System.out.println("OUTLIER::Phase I Chart:: " + businessOutlierChart.isDisplayed());
        exe.executeScript("arguments[0].click();", viewProjectList);
        System.out.println("ProjectList Table:: " + projectListTable.isDisplayed());
        Thread.sleep(2000);
        exe.executeScript("arguments[0].scrollIntoView(true);", science);
        Thread.sleep(4000);
    }

    public void ScienceTab() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", science);
        Thread.sleep(4000);

        exe.executeScript("arguments[0].click();", firstScienceCard);
        //firstScienceCard.click();
        Thread.sleep(2000);
        System.out.println("First Science Tab Card Chart:: " + comparativeScienceChart.isDisplayed());
        exe.executeScript("arguments[0].click();", secondScienceCard);
        //secondScienceCard.click();
        Thread.sleep(2000);
        System.out.println("Second Science Tab Card Chart:: " + comparativeScienceChart.isDisplayed());
        exe.executeScript("arguments[0].click();", thirdScienceCard);
        //thirdScienceCard.click();
        Thread.sleep(2000);
        System.out.println("Third Science Tab Card Chart:: " + comparativeScienceChart.isDisplayed());
        Thread.sleep(2000);
        if (volume.isEnabled() && percentage.isEnabled()) {
            exe.executeScript("arguments[0].click();", volume);
            //volume.click();
            Thread.sleep(2000);
            exe.executeScript("arguments[0].click();", percentage);
            //percentage.click();
        } else {
            System.out.println("FAIL:: Volume and % are not clicked");
        }

    }

}
