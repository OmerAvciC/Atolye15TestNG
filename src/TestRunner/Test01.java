package TestRunner;

import Pages.PlaceOrderElements;
import Utilitis.GeneralWebDriver;
import Utilitis.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test01 extends GeneralWebDriver  {



    @Test()
    void Verify01(){

        PlaceOrderElements poe = new PlaceOrderElements(driver);
        poe.homepageVerify.isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(poe.blockIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(poe.aboutUs)).click();

        System.out.println(poe.bestPart.getText());

        Assert.assertEquals(poe.bestPart.getText(),"We give our energy to build a successful team of happy and trusted individuals, providing them with the opportunity to give their best to create marvelous products. The core of our team is unity and it is vital to our success.");

    }


    @Test(dataProvider="getData",dependsOnMethods = {"Verify01"})

    void test01(String name, String companyName, String emailAdress, String contactNum, String firstProject)
    {
        PlaceOrderElements poe = new PlaceOrderElements(driver);
        poe.homepageVerify.isDisplayed();

        wait.until(ExpectedConditions.elementToBeClickable(poe.contact)).click();
        wait.until(ExpectedConditions.visibilityOf(poe.inputName));

        sendKeysFunction(poe.inputName,name);
        sendKeysFunction(poe.companyName,companyName);
        sendKeysFunction(poe.emailAdress,emailAdress);
        sendKeysFunction(poe.contactNum,contactNum);
        sendKeysFunction(poe.firstProject,firstProject);

    }

    @DataProvider
    public Iterator<Object[]> getData()
    {
        List<Object[]> data= new ArrayList<>();
        data.add(new Object[]{"Omer Avcı","Atolye15","omercavci@gmail.com","77777777","Joining this beautiful team is my first big project"});
        data.add(new Object[]{"Cihat Avcı","Techno Study","omer@gmail.com","111111111","Joining this beautiful team is my first big project"});


        return data.iterator();
    }

    @Test()
    void Verify02(){

        PlaceOrderElements poe = new PlaceOrderElements(driver);
        poe.homepageVerify.isDisplayed();
//        wait.until(ExpectedConditions.elementToBeClickable(poe.blockIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(poe.contact)).click();

        Assert.assertEquals(poe.phoneVerify.getText(),"+90 232 463 15 55");

    }
}
