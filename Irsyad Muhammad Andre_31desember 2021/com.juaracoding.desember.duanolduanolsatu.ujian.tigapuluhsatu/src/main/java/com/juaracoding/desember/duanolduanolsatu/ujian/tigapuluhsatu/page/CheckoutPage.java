package com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.page;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.driver.DriverSingleton;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.utils.ConstantsDriver;

public class CheckoutPage {
	private WebDriver driver;

	public CheckoutPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	// tochecout prooced
	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div.cart_totals > div > a")
	private WebElement proceedCheckout;

	// ------------------iputdata
	@FindBy(css = "#billing_first_name")
	private WebElement txtbilling_first_name;

	@FindBy(css = "#billing_last_name")
	private WebElement txtbilling_last_name;

	@FindBy(css = "#billing_company")
	private WebElement txtbilling_company;

	@FindBy(css = "#billing_country_field > span > span > span.selection > span")
	private WebElement listRegion;

	@FindBy(css = "#billing_address_1")
	private WebElement txstreetName;

	@FindBy(css = "#billing_address_2")
	private WebElement txtApartmentName;

	@FindBy(css = "#billing_city")
	private WebElement txtCity;

	@FindBy(css = "#billing_state")
	private WebElement txttState;

	@FindBy(css = "#billing_postcode")
	private WebElement txtPin;

	@FindBy(css = "#billing_phone")
	private WebElement txtPhone;

	@FindBy(css = "#order_comments")
	private WebElement additonalInfoOrder;

	@FindBy(css = "#terms")
	private WebElement agreedCheckout;
	
	@FindBy(css="#place_order")
	private WebElement btnPlaceOrder;
	
	@FindBy(css="#billing_state_field > span > span > span.selection > span")
	private WebElement listParish;
	
	@FindBy(css="#billing_state_field > span > span > span.selection > span")
	private WebElement listState;
	
	@FindBy(css="#post-7 > div > div > div > p.woocommerce-thankyou-order-received")
	private WebElement getThxFortheOrder;
	
	@FindBy(css="#billing_email")
	private WebElement emailorder;
	

	
	

	public WebElement getGetThxFortheOrder() {
		return getThxFortheOrder;
	}

	public void proceedCheckoutChart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		proceedCheckout.click();
	}

	public void inputDataCheckoutChart() {
		txtbilling_first_name.sendKeys(ConstantsDriver.USE_USERNAME);
		sleepDelayCostum();
		txtbilling_last_name.sendKeys(ConstantsDriver.USE_USERNAME);
		sleepDelayCostum();
		txtbilling_company.sendKeys("pt.vertix");
		sleepDelayCostum();
		lsRegion(3);
		sleepDelayCostum();
		txstreetName.sendKeys("jalan harimau selakopi");
		sleepDelayCostum();
		txtApartmentName.sendKeys("c1 asrama");
		sleepDelayCostum();
		txtCity.sendKeys("bogor");
		sleepDelayCostum();
		txttState.sendKeys("utah");	
		sleepDelayCostum();
		txtPin.sendKeys("141298122021");
		sleepDelayCostum();
		txtPhone.sendKeys("088283929111");
		sleepDelayCostum();
//		emailorder.sendKeys(ConstantsDriver.USE_EMAIL);
		sleepDelayCostum();
		placeOrder();
//		additonalInfoOrder.sendKeys("yang penting kelar aja kirim aja brang nya ya sans aja :)");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,-100)");
//		sleepDelayCostum();
//		sleepDelayCostum();
		
		sleepDelayCostum();
//		lslistParish(3);
		sleepDelayCostum();
		

	}
	
	private void placeOrder() {

		agreedCheckout.click();
		btnPlaceOrder.click();
		sleepDelayCostum();
		sleepDelayCostum();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	private void lsRegion(int selection) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(listRegion));

		listRegion.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
		sleepDelayCostum();
	}
	
	private void lsState(int selection) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(listState));

		listState.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
		sleepDelayCostum();
		
		sleepDelayCostum();
	}
	
	private void lslistParish(int selection) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(listParish));

		listParish.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
		
		sleepDelayCostum();

	}
	
	private void sleepDelayCostum()  {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
