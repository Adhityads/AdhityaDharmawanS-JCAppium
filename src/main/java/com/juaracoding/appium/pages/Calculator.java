package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locator
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    private MobileElement btnSatu;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    private MobileElement btnDua;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    private MobileElement btnTiga;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    private MobileElement btnEmpat;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    private MobileElement btnLima;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_6")
    private MobileElement btnEnam;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_7")
    private MobileElement btnTujuh;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_8")
    private MobileElement btnDelapan;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_9")
    private MobileElement btnSembilan;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    private MobileElement btnTambah;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    private MobileElement btnKurang;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    private MobileElement btnBagi;
    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    private MobileElement btnKali;
    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnSamaDengan;
    @AndroidFindBy(id ="com.google.android.calculator:id/result_final")
    private MobileElement hasil;
    /* web: xpath = //taghtml[contains(@attr, value)] */

    //Method
    public void calcAdd() {
        btnSatu.click();
        btnTambah.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    public void calcSub(){
        btnSembilan.click();
        btnKurang.click();
        btnTujuh.click();
        btnSamaDengan.click();

    }

    public void calcSubMinus(){
        btnTujuh.click();
        btnKurang.click();
        btnSembilan.click();
        btnSamaDengan.click();
    }

    public void calcMul(){
        btnTiga.click();
        btnKali.click();
        btnEmpat.click();
        btnSamaDengan.click();
    }

    public void calcDiv(){
        btnDelapan.click();
        btnBagi.click();
        btnDua.click();
        btnSamaDengan.click();
    }


    //
    public String getTxtResult() {
        return hasil.getText();
    }
}
