package com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.driver.DriverSingleton;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.utils.ConstantsDriver;



public class RegisterPage {
	private WebDriver driver;

	public RegisterPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li:nth-child(2) > a")
	private WebElement myaccountToRegister;
	
	@FindBy(css="#reg_username")
	private WebElement txtusername;
	
	@FindBy(css="#reg_email")
	private WebElement txtreg_email;
	
	@FindBy(css="#reg_password")
	private WebElement txtreg_password;
	
	@FindBy(css="#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
	private WebElement btnregister;
	
	@FindBy(xpath="/html/body/p/a")
	private WebElement dismissinitializeweb;
	
	@FindBy(css="#user_login")
	private WebElement afterregiswordpressuser_loginaf;
	
	@FindBy(css="#user_pass")
	private WebElement afterregiswordpresspass_login;
	
	@FindBy(css="#wp-submit")
	private WebElement afterregiswordpressbtnlogin_login;
	
	@FindBy(xpath="//*[@id=\"post-8\"]/div/div/div/p[2]")
	private WebElement heloSuccesIntoAccount;
	
	public void clickMyaccoutToRegister() {
		dismissinitializeweb.click();
		myaccountToRegister.click();
	}
	
	public void RegisterAccount() {
		txtusername.sendKeys(ConstantsDriver.USE_USERNAME);
		txtreg_email.sendKeys(ConstantsDriver.USE_EMAIL);
		txtreg_password.sendKeys(ConstantsDriver.USE_PASSWORD);
		btnregister.click();
	}
	
	public void AfterRegisterloginOptionalWordpress() {
		
		afterregiswordpressuser_loginaf.sendKeys(ConstantsDriver.USE_EMAIL);
		afterregiswordpresspass_login.sendKeys(ConstantsDriver.USE_PASSWORD);
		afterregiswordpressbtnlogin_login.click();
		
	}
	
	public WebElement getHelloToYourAccountIndicator() {
		
		return heloSuccesIntoAccount;
	}


}
