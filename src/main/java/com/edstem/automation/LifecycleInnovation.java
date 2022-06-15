package com.edstem.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifecycleInnovation {
    WebDriver driver;

    @FindBy(xpath = "//div[text()='LIFECYCLE INNOVATION']")
    private WebElement lifecycleInnovationTab;

    @FindBy(xpath = "//div/p/b[text()='IEF Scope list']")
    private WebElement iefScopeListCard;
    @FindBy(xpath = "//div/p/b[text()='IEF Shortlist']")
    private WebElement iefShortListCard;
    @FindBy(xpath = "//div/p/b[text()='Proposed']")
    private WebElement proposedCard;
    @FindBy(xpath = "//div/p/b[text()='Approved']")
    private WebElement approvedCard;
    @FindBy(xpath = "//div/p/b[contains(text(), 'Clinical') ]")
    private WebElement clinicalProjectCard;

    @FindBy(xpath = "//div[@class='comparision-table-of-lifecycle']")
    private WebElement comparativeChart;
    @FindBy(xpath = "//span[text()='OUTLIER']")
    private WebElement outlier;
    @FindBy(xpath = "//div[@class='scatter-plot-chart']")
    private WebElement outlierChart;
    @FindBy(xpath = "//span[text()='View Projects List']")
    private WebElement viewProjectList;
    @FindBy(xpath = "//div[@class='main-table']")
    private WebElement projectListTable;

    @FindBy(xpath = "//span[text()='Science']")
    private WebElement science;
    @FindBy(xpath = "//div[@class='display-chart']")
    private WebElement comparativeScienceChart;


    public LifecycleInnovation(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Business Tab
    public void clickOnAllCards() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", lifecycleInnovationTab);
        //lifecycleInnovationTab.click();
        Thread.sleep(5000);
        exe.executeScript("arguments[0].click();", iefScopeListCard);
        //iefScopeListCard.click();
        exe.executeScript("arguments[0].click();", iefShortListCard);
        //iefShortListCard.click();
        exe.executeScript("arguments[0].click();", proposedCard);
        //proposedCard.click();
        exe.executeScript("arguments[0].click();", approvedCard);
        //approvedCard.click();
        exe.executeScript("arguments[0].click();", clinicalProjectCard);
        //clinicalProjectCard.click();
        Thread.sleep(2000);
        System.out.println("All cards are successfully clicked...!!!!");
    }

    public void verifyAllCharts() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;

        System.out.println("Comparative Chart:: " + comparativeChart.isDisplayed());
        exe.executeScript("arguments[0].click();", outlier);
        //outlier.click();
        Thread.sleep(2000);
        System.out.println("Outlier Chart:: " + outlierChart.isDisplayed());
        exe.executeScript("arguments[0].click();", viewProjectList);
        System.out.println("ProjectList Table:: " + projectListTable.isDisplayed());

        exe.executeScript("arguments[0].scrollIntoView(true);", science);
        Thread.sleep(4000);
    }

// Science Tab

    public void verifyScienceTabCharts() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", science);
        Thread.sleep(4000);
        System.out.println("Comparative Science Tab Chart:: " + comparativeScienceChart.isDisplayed());
        exe.executeScript("arguments[0].click();", viewProjectList);
        System.out.println("ProjectList Table:: " + projectListTable.isDisplayed());
        Thread.sleep(3000);


    }

}
