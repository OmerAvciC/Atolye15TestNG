package Utilitis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {


    public static void compareToList(List<String>menuExpectedList, List<WebElement>menuActualList){

        for (int i=0; i<menuExpectedList.size(); i++)
            Assert.assertEquals(menuExpectedList.get(i), menuActualList.get(i).getText(),"Compare Result");

    }
    public static void successMessageValidation(){
        WebElement yesilYaziDogrulama = GeneralWebDriver.driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(yesilYaziDogrulama.getText().toLowerCase().contains("has been success"));
    }
    public static void Bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static double webelementToDouble(WebElement e){

        String result = e.getText();
        result=result.replaceAll("[^\\d]","");

        return Double.parseDouble(result);

    }
    public static int RandomGenerator(int max){

        return (int) (Math.random() * max);

    }
}
