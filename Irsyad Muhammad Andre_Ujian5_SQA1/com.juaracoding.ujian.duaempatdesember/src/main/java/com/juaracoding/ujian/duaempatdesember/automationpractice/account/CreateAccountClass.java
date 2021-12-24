package com.juaracoding.ujian.duaempatdesember.automationpractice.account;

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

import com.juaracoding.ujian.duaempatdesember.driver.DriverSingleton;

public class CreateAccountClass {

	private WebDriver driver;

	public CreateAccountClass() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	// 1.awal2
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignIn;
	// ---------------------------------------------------------------------------
	// 2.register awal
	@FindBy(css = "#email_create")
	private WebElement inputRegisEmail;

	@FindBy(css = "#SubmitCreate")
	private WebElement btnCreateAccount;
	// ---------------------------------------------------------------------------
	// 3.1. input data text

	@FindBy(css = "#customer_firstname")
	private WebElement txtcustomer_firstname;

	@FindBy(css = "#customer_lastname")
	private WebElement txtcustomer_lastname;

//	@FindBy(css="#email")
//	private WebElement txtemail;

	@FindBy(css = "#passwd")
	private WebElement txtpasswd;

	@FindBy(css = "#firstname")
	private WebElement txtfirstname;

	@FindBy(css = "#lastname")
	private WebElement txtlastname;

	@FindBy(css = "#company")
	private WebElement txtcompany;

	@FindBy(css = "#address1")
	private WebElement txtaddressstreet;

	@FindBy(css = "#address2")
	private WebElement txtaddressbuilding;

	@FindBy(css = "#city")
	private WebElement txtcity;

	@FindBy(css = "#postcode")
	private WebElement txtzippostcode;

	@FindBy(css = "#other")
	private WebElement txtanotherInfo;

	@FindBy(css = "#phone")
	private WebElement txtphone;

	@FindBy(css = "#phone_mobile")
	private WebElement txtphonemobile;

	@FindBy(css = "#alias")
	private WebElement txtaliasAddres;

	// 3.2. input data menu
	@FindBy(css = "#id_gender1")
	private WebElement btnregisMan;

	@FindBy(css = "#id_gender2")
	private WebElement btnregisWoMan;

	@FindBy(css = "#uniform-id_state")
	private WebElement scrollListState;

	@FindBy(css = "#id_country")
	private WebElement scrollListid_country;

	@FindBy(css = "#days")
	private WebElement birth_scrolldays;

	@FindBy(css = "#months")
	private WebElement birth_scrollmonths;

	@FindBy(css = "#years")
	private WebElement birth_scrollyears;
	
//	@FindBy(xpath = "//*[@id=\"days\"]")
//	private WebElement birth_scrolldays;
//
//	@FindBy(xpath = "//*[@id=\"months\"]")
//	private WebElement birth_scrollmonths;
//
//	@FindBy(xpath = "//*[@id=\"years\"]")
//	private WebElement birth_scrollyears;
	
	//asaas
	@FindBy(css="#email")
	private WebElement txtemaillogin;
	@FindBy(css="#passwd")
	private WebElement txtpasswdlogin;
	@FindBy(css="#SubmitLogin")
	private WebElement txtSubmitLogin;
	
	public void SinginOrRegisterElement() {
		btnSignIn.click();

	}

	public void registerAccount(String emailregist,String pass) {

		inputRegisEmail.sendKeys(emailregist);
		btnCreateAccount.click();
//		Birth(2, 2, 2);
		inputInfoUserForRegisterData(pass);
		inputMenuInfoUserForRegisterData();

	}
	public void loginAccount(String email,String pass) {
		txtemaillogin.sendKeys(email);
		txtpasswdlogin.sendKeys(pass);
		txtSubmitLogin.click();
		
	}

	private void inputInfoUserForRegisterData(String pass) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,20)");
		txtcustomer_firstname.sendKeys("irsyad");
		txtcustomer_lastname.sendKeys("andre");
		txtpasswd.sendKeys(pass);
		txtfirstname.sendKeys("irsyad");
		txtlastname.sendKeys("andre");
		txtcompany.sendKeys("PT. vertix");
		txtaddressstreet.sendKeys("komp.kehutanan selakopi jalan beruang");
		txtaddressbuilding.sendKeys("komp.kehutanan selakopi apartment kos byru beruang");
		txtcity.sendKeys("bogor");
		txtzippostcode.sendKeys("16118");
		txtanotherInfo.sendKeys("yang penting kelar aja dah boi");
		txtphone.sendKeys("02517394384");
		txtphonemobile.sendKeys("088273849433");
		txtaliasAddres.sendKeys(" :Akihabara :)");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void inputMenuInfoUserForRegisterData() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		menuGender();

		// state nya Maine
//		js.executeScript("window.scrollBy(0,20)");
//		Birth(2,2,2);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lstState(11);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lstCountry(0);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		js.executeScript("scroll(0, -500);");
		

	}

	private void menuGender() {
		btnregisWoMan.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnregisMan.click();
	}

	private void lstState(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(scrollListState));

		scrollListState.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();

	}

	private void lstCountry(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(scrollListid_country));

		scrollListid_country.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();

	}

	public void Birth(int day,int month,int year) {
		lstdaysbirth(day);
		lstmonthbirth(month);
		lstyearbirth(year);

	}

	private void lstdaysbirth(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(birth_scrolldays));

		birth_scrolldays.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void lstmonthbirth(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(birth_scrollmonths));

		birth_scrollmonths.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void lstyearbirth(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(birth_scrollyears));

		birth_scrollyears.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
