package com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.driver.DriverSingleton;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.utils.ConstantsDriver;

public class LoginPage {

	private WebDriver driver;

	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#password")
	private WebElement edtxpasswordLogin;
	
	@FindBy(css="#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
	private WebElement btnLogin;
	
	@FindBy(css="#username")
	private WebElement edtusernameLogin;
	
	public void loginUser() {
//		edtusernameLogin.sendKeys(ConstantsDriver.USE_USERNAME);
		edtxpasswordLogin.sendKeys(ConstantsDriver.USE_PASSWORD);
		btnLogin.click();
	}
	
	
	
}
