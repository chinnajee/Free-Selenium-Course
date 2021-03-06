package lessons;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_Interactions
{
    /**
     * Here are the basic interactions we can do with WebDriver on elements.
     */
    @Test
    public void d_SimpleInteractions()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://automationintesting.com/selenium/testpage");

        //We are going find a H2 element on the page, ask WebDriver to read it's text, and ask Java to write it to the console
        //getText() will read the all the text between the open and close tags of the element
        System.out.println(driver.findElement(By.tagName("h2")).getText());

        //We are going to find the First Name field, and ask WebDriver to enter 'Richard' into it
        //sendKeys() give us many options but for this stage, we are going to pass in the string 'Richard'
        driver.findElement(By.id("firstname")).sendKeys("richard");

        //We are going to ask WebDriver to read us the value within the Firstname field
        //We do this using getAttribute() we can actually be used to read any attribute of a HTML element
        System.out.println(driver.findElement(By.id("firstname")).getAttribute("value"));

        //In this line we are asking WebDriver to read the name attribute of the form element
        System.out.println(driver.findElement(By.id("contactus")).getAttribute("name"));

        //Click on the submit button, the one titled 'I do nothing!'
        //The click() method will attempt to click any element, but will only succeed if the element is visible.
        //WebDriver will scroll the page if needed in order to click a visible element
        driver.findElement(By.id("submitbutton")).click();

        driver.quit();
    }

    /**
     * There are also interactions we can do with the broswer
     * getCurrentUrl() we return you the URL in the address bar, can be could for verifying a flow took you to the right page
     * getTitle() will return you the title in the tab
     */
    @Test
    public void d_DriverInteractions()
    {
        //Start a Firefox Instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Navigate to a Website.
        driver.navigate().to("https://automationintesting.com/selenium/testpage");

        //Read the url of the page.
        System.out.println(driver.getCurrentUrl());
        //Read the page title/tab title
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
