package com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.config.AutomationFrameworkConfiguration;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.driver.DriverSingleton;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.page.CartPage;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.page.CheckoutPage;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.page.LoginPage;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.page.RegisterPage;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.utils.ConfigurationProperties;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.utils.ConstantsDriver;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.utils.Log;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.utils.TestCase;
import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private ExtentTest extentTest;
	static ExtentReports extentReports = new ExtentReports("src/main/resources/testUjian31DESEMBER2021.html");
	private RegisterPage registerPage;
	private LoginPage loginPage;
	private CartPage cartPage;
	private CheckoutPage checkoutPage;

	@Autowired
	ConfigurationProperties configurationProperties;

	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		registerPage = new RegisterPage();
		loginPage = new LoginPage();
		cartPage = new CartPage();
		checkoutPage = new CheckoutPage();
		TestCase[] test = TestCase.values();
		extentTest = extentReports.startTest(test[Utils.testcountt].getTestNama());
		Log.getLogData(Log.class.getName()); //log4j
		Log.startTest(test[Utils.testcountt].getTestNama()); //log4j
		Utils.testcountt++;
	}

	//SESI FITUR REGISTRASI
	@Given("^berhasil masuk halaman awal akses shop.demoqa.com")
	public void goToWebsite() {
		driver = DriverSingleton.getDriver();
		driver.get(ConstantsDriver.URL);
		Log.info("INFO: Navigating to " + ConstantsDriver.URL); //log4j
		extentTest.log(LogStatus.PASS, "navigation to " + ConstantsDriver.URL);

	}

	@When("^klik myaccount untuk halaman fitur register awal di halaman utama")
	public void clickMaccoutToRegisterPage() {
		registerPage.clickMyaccoutToRegister();
		extentTest.log(LogStatus.PASS,"klik myaccount untuk halaman fitur register awal di halaman utama");
	
	
	}

	@When("^masukan username,email, dan  password untuk daftar akun dan klik tombol register dan user telah membuat akun di demoqa")
	public void inputDataRegisterPage() {
		// regis
		registerPage.RegisterAccount();
		extentTest.log(LogStatus.PASS,"masukan username,email, dan  password untuk daftar akun dan klik tombol register dan user telah membuat akun di demoqa");

	}

	@Then("^diarahkan dari registrasi ke Login akun di uiux wordpress dari akun yang sudah di registrasi")
	public void loginPage() {
		// ada sewaktu kayak timeout session dan disuruh login secara wordpress lagi
		// setelah register...pakai seperlunya aja metod dibawah ini
		// kalau g perlu komen aja
		registerPage.AfterRegisterloginOptionalWordpress();
		//fitur login aslinya
//		loginPage.loginUser();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10)");
//		assertEquals(configurationProperties.getHellokamuakun(), registerPage.getHelloToYourAccountIndicator());
		extentTest.log(LogStatus.PASS,"diarahkan dari registrasi ke Login akun di uiux wordpress dari akun yang sudah di registrasi");
	
	}
	
	//SESI FITUR CART
	
	@When("^klik cart yang masih kosong dan klik link dari cart ke shopping")
	public void fromChartToShopingMarket() {
		cartPage.hometoChartBag();
		cartPage.fromchartToBuyShop();
		extentTest.log(LogStatus.PASS,"klik cart yang masih kosong dan klik link dari cart ke shopping");
		
	}
	@Then("^Menambah Shoes from Compare Product dan Menambah Glass from Search")
	public void Shopping() {
		cartPage.Shoes_from_Compare_Product();
		cartPage.searchShopFeature("glass");
		cartPage.Glass_from_Search_Product();
		cartPage.ViewCartShooping();
		extentTest.log(LogStatus.PASS,"Menambah Shoes from Compare Product dan Menambah Glass from Search");
	
	}
	
	//SESI FITUR CHECKOUT
	
	@When("^klik proceed checkout")
	public void proceedToCheckout() {
		checkoutPage.proceedCheckoutChart();
		extentTest.log(LogStatus.PASS,"klik proceed checkout");
	
	}
	
	@And("^pengisian data diri untuk order")
	public void inputDataForCheckout() {
		checkoutPage.inputDataCheckoutChart();
		extentTest.log(LogStatus.PASS,"pengisian data diri untuk order");
	
	}
	
	@Then("^Place order untuk shipping")
	public void placeOrderForCheckout() {
//		assertEquals(configurationProperties.getThxfortheorder(),checkoutPage.getGetThxFortheOrder());
		extentTest.log(LogStatus.PASS,"Place order untuk shipping");
//	
	}
	
	@After
	public void closeObject() {
		extentReports.endTest(extentTest);
		extentReports.flush();
	}

}

//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,100)");
//
//WebDriverWait wait = new WebDriverWait(driver, 30);
//wait.until(ExpectedConditions.elementToBeClickable(birth_scrolldays));
