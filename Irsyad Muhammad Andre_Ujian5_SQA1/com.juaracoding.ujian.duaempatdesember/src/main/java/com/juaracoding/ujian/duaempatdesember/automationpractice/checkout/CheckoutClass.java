package com.juaracoding.ujian.duaempatdesember.automationpractice.checkout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian.duaempatdesember.driver.DriverSingleton;


public class CheckoutClass  {
	
	private WebDriver driver;

	public CheckoutClass() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
	private WebElement btnCartBaguser;
	
	@FindBy(css="#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement btnProceedCheckoutFromSummary;
	@FindBy(css="#center_column > form > p > button")
	private WebElement txtMassageBeforeShipping;
	
	@FindBy(css="#center_column > form > p > button")
	private WebElement btnProceedCheckoutFromShipping;
	
	@FindBy(css="#cgv")
	private WebElement checkAgreedShipping;
	
	@FindBy(css="#form > p > button")
	private WebElement btnProceedCheckoutFromPayment;
	
	@FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p")
	private WebElement btnPaywithwire;
	
	@FindBy(css = "#cart_navigation > button")
	private WebElement btnPayConfirm;
	public void CekidotYukBelanjaan() {
		btnCartBaguser.click();
		btnProceedCheckoutFromSummary.click();
		txtMassageBeforeShipping.sendKeys("yang pnting selamat dan dilindungi oleh allah swt barang dan kurir nya dattbayooo...aamiin");
		checkAgreedShipping.click();
		btnProceedCheckoutFromPayment.click();
		btnPaywithwire.click();
		btnPayConfirm.click();
		
		
	}
	
}
