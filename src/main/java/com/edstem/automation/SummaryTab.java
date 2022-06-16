package com.edstem.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SummaryTab {
    public WebDriver driver;

    @FindBy(xpath = "//div[text()='SUMMARY']")
    private WebElement summaryTab;

    @FindBy(xpath = "(//span[text()='All'])[1]")
    private WebElement geneticValidation;
    @FindBy(xpath = "(//span[@class='checkbox-icon']//*[local-name()='svg'])[2]")
    private WebElement checkboxOfGeneticValidation;

    @FindBy(xpath = "(//span[text()='All'])[3]")
    private WebElement immunomodulation;
    @FindBy(xpath = "(//span[@class='checkbox-icon']//*[local-name()='svg'])[7]")
    private WebElement checkboxOfImmunomodulation;

    @FindBy(xpath = "(//span[text()='All'])[5]")
    private WebElement portfolioOwner;
    @FindBy(xpath = "(//span[@class='checkbox-icon']//*[local-name()='svg'])[10]")
    private WebElement checkboxOfPortfolioOwner;

    @FindBy(xpath = "(//span[text()='All'])[7]")
    private WebElement researchUnit;
    @FindBy(xpath = "(//span[@class='checkbox-icon']//*[local-name()='svg'])[14]")
    private WebElement checkboxOfResearchUnit;

    @FindBy(xpath = "(//span[text()='All'])[9]")
    private WebElement modality;
    @FindBy(xpath = "(//span[@class='checkbox-icon']//*[local-name()='svg'])[23]")
    private WebElement checkboxOfModality;

    @FindBy(xpath = "(//span[text()='All'])[11]")
    private WebElement lifecyclePhases;
    @FindBy(xpath = "(//span[@class='checkbox-icon']//*[local-name()='svg'])[29]")
    private WebElement checkboxOfLifecyclePhases;

    @FindBy(xpath = "(//span[text()='All'])[13]")
    private WebElement time;
    @FindBy(xpath = "(//span[@class='checkbox-icon']//*[local-name()='svg'])[39]")
    private WebElement checkboxOfTime;

    @FindBy(xpath = "(//span[text()='SHOW DETAILS'])[1]")
    private WebElement lifcycleInvocationDetails;
    @FindBy(xpath = "//span[text()='Lifecycle Innovation']")
    private WebElement lifcycleInvocationTitle;

    @FindBy(xpath = "(//span[text()='SHOW DETAILS'])[2]")
    private WebElement cycleTimeDetails;
    @FindBy(xpath = "//span[text()='Cycle Times']")
    private WebElement cycleTimeTitle;

    @FindBy(xpath = "(//span[text()='SHOW DETAILS'])[3]")
    private WebElement successRatesDetails;
    @FindBy(xpath = "//span[text()='Success Rates']")
    private WebElement successRatesTitle;

    @FindBy(xpath = "//span[text()='Science']")
    private WebElement science;

    public SummaryTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

// Filters

    public void GeneticValidation() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", geneticValidation);

        //geneticValidation.click();
        Thread.sleep(1000);
        String result = checkboxOfGeneticValidation.getAttribute("id");
        //System.out.println(result);
        if (result.equalsIgnoreCase("checkbox_filled_icon_18dp_")) {
            System.out.println("GeneticValidation::True");
        } else {
            System.out.println("GeneticValidation::False");
            exe.executeScript("arguments[0].click();", checkboxOfGeneticValidation);
        }
        exe.executeScript("arguments[0].click();", geneticValidation);
    }

    public void Immunomodulation() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", immunomodulation);

        //immunomodulation.click();
        Thread.sleep(1000);
        String result = checkboxOfImmunomodulation.getAttribute("id");
        //System.out.println(result);
        if (result.equalsIgnoreCase("checkbox_filled_icon_18dp_"))
            System.out.println("Immunomodulation::True");
        else {
            System.out.println("Immunomodulation::False");
            exe.executeScript("arguments[0].click();", checkboxOfImmunomodulation);
        }
        exe.executeScript("arguments[0].click();", immunomodulation);
    }

    public void PortfolioOwner() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", portfolioOwner);

        //portfolioOwner.click();
        Thread.sleep(1000);
        String result = checkboxOfPortfolioOwner.getAttribute("id");
        //System.out.println(result);
        if (result.equalsIgnoreCase("checkbox_filled_icon_18dp_"))
            System.out.println("PortfolioOwner::True");
        else {
            System.out.println("PortfolioOwner::False");
            exe.executeScript("arguments[0].click();", checkboxOfPortfolioOwner);
        }
        exe.executeScript("arguments[0].click();", portfolioOwner);
    }

    public void ResearchUnit() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", researchUnit);

        //researchUnit.click();
        Thread.sleep(1000);
        String result = checkboxOfResearchUnit.getAttribute("id");
        //System.out.println(result);
        if (result.equalsIgnoreCase("checkbox_filled_icon_18dp_"))
            System.out.println("researchUnit::True");
        else {
            System.out.println("researchUnit::False");
            exe.executeScript("arguments[0].click();", checkboxOfResearchUnit);
        }
        exe.executeScript("arguments[0].click();", researchUnit);
    }

    public void Modality() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", modality);

        //modality.click();
        Thread.sleep(1000);
        String result = checkboxOfModality.getAttribute("id");
        //System.out.println(result);
        if (result.equalsIgnoreCase("checkbox_filled_icon_18dp_"))
            System.out.println("Modality::True");
        else {
            System.out.println("Modality::False");
            exe.executeScript("arguments[0].click();", checkboxOfModality);
        }
        exe.executeScript("arguments[0].click();", modality);
    }

    public void LifecyclePhases() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", lifecyclePhases);

        //lifecyclePhases.click();
        Thread.sleep(1000);
        String result = checkboxOfLifecyclePhases.getAttribute("id");
        //System.out.println(result);
        if (result.equalsIgnoreCase("checkbox_filled_icon_18dp_"))
            System.out.println("LifecyclePhases::True");
        else {
            System.out.println("LifecyclePhases::False");
            exe.executeScript("arguments[0].click();", checkboxOfLifecyclePhases);
        }
        exe.executeScript("arguments[0].click();", lifecyclePhases);
        Thread.sleep(1000);
    }

    public void Time() throws InterruptedException {
        //time.click();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", time);
        Thread.sleep(1000);
        String result = checkboxOfTime.getAttribute("id");
        //System.out.println(result);
        if (result.equalsIgnoreCase("checkbox_filled_icon_18dp_"))
            System.out.println("Time::True");
        else {
            System.out.println("Time::False");
            checkboxOfTime.click();
        }
        exe.executeScript("arguments[0].click();", time);

    }

// Business Tab and their details

    public void BusinessTab() throws InterruptedException {
        checkDetails(lifcycleInvocationDetails, lifcycleInvocationTitle, "Lifecycle Innovation");
        checkDetails(cycleTimeDetails, cycleTimeTitle, "Cycle Times");
        checkDetails(successRatesDetails, successRatesTitle, "Success Rates");
    }


// Science Tab and their details

    public void ScienceTab() throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", science);
        //science.click();
        Thread.sleep(5000);
        checkDetails(lifcycleInvocationDetails, lifcycleInvocationTitle, "Lifecycle Innovation");
        checkDetails(cycleTimeDetails, cycleTimeTitle, "Cycle Times");
        checkDetails(successRatesDetails, successRatesTitle, "Success Rates");
    }

    public void checkDetails(WebElement element, WebElement title, String expectedTitle) throws InterruptedException {
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].click();", element);
        Thread.sleep(8000);
        String str = title.getText();
        System.out.println(str);
        if (expectedTitle.equalsIgnoreCase(str)) {
            System.out.println("PASS:: " + expectedTitle + " details are visible...!!");
        } else {
            System.out.println("FAIL:: " + expectedTitle + " details are not visible...!!");
        }

        exe.executeScript("arguments[0].click();", summaryTab);
        Thread.sleep(5000);

    }

}
