package com.juaracoding.appium;

import com.juaracoding.appium.pages.Calculator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCalculator {
    private AndroidDriver<MobileElement> driver;
    private Calculator calculator;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_5_API_25");
        capabilities.setCapability("uuid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void pageObject() {
        calculator = new Calculator(driver);
    }

    @Test
    public void testAdd() {
        calculator.calcAdd();
        System.out.println("Hasil Penjumlahan = "+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(), "3");
    }

    @Test
    public void testSub(){
        calculator.calcSub();
        System.out.println("Hasil Pengurangan = "+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(),"2");
    }

    @Test
    public void testSubMinus(){
        calculator.calcSubMinus();
        System.out.println("Hasil Pengurangan Munus = "+calculator.getTxtResult());
        String actual = calculator.getTxtResult();
        char charActual = actual.charAt(0);
        int cekASCII = (int) charActual;
        System.out.println(cekASCII);
        int cekASCIIFromKeyboardMinus = '-';
        System.out.println(cekASCIIFromKeyboardMinus);
        Assert.assertEquals(actual, "−2");;

    }

    @Test
    public void testMul(){
        calculator.calcMul();
        System.out.println("Hasil Perkalian = "+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(),"12");
    }

    @Test
    public void testDiv(){
        calculator.calcDiv();
        System.out.println("Hasil Pembagian = "+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(),"4");
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }
}
