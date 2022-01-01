package com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.page;

import java.sql.Time;
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

public class CartPage {
	private WebDriver driver;

	public CartPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(css="#post-8 > div > div > nav > ul >li")
//	private List<WebElement> toChart;
	@FindBy(xpath="//*[@id=\"nav-menu-item-cart\"]/a")
	private WebElement toChart;

	
	@FindBy(css="#post-6 > div > div > p.return-to-shop > a")
	private WebElement chartToShopmarket;
	
	@FindBy(xpath="//*[@id=\"noo-site\"]/div[2]/div[1]/div")
	private WebElement catalog;
	
	@FindBy(css="#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1281.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme > div.owl-wrapper-outer.autoHeight > div > div.owl-item.active > a > img")
	private WebElement shoesblackheels_selected;
	
	@FindBy(css="#pa_color")
	private WebElement listColor;
	
	@FindBy(css="#pa_size")
	private WebElement listSize;
	
	@FindBy(css="#product-1281 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnAddtoChartDetailItemShoe;
	
	@FindBy(css="#product-1326 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnAddtoChartDetailItemSunGlasses;
	
	

	
	@FindBy(xpath="//*[@id=\"noo-site\"]/section/div/div/h1")
	private WebElement cartHighlightMneuToMainshop;
	
	@FindBy(css="#noo-site > div.noo-container-shop.noo-shop-wrap.noo-shop-single-fullwidth > div > div > div.woocommerce-notices-wrapper > div > a")
	private WebElement btnViewCart;
	
	@FindBy(css="#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1281.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.sale.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-meta > div.woocommerce.product.compare-button > a")
	private WebElement btncompareproduct;
	
	@FindBy(xpath="//*[@id=\"DataTables_Table_0\"]/tbody/tr[5]/td/a")
	private WebElement btnselectoptions_item_selected;

	@FindBy(xpath="//a[@aria-label='Select options for “black pointed toe barely there patent heels”']\"")
	private WebElement btnselect_option_newFromComapare;
	
	
	//-------------------------------------------------------------------------------------------------search
	@FindBy(css = "#noo-site > header > div.navbar-wrapper > div > div > div > a")
	private WebElement btnsearchShop;
	
	@FindBy(css = "#noo-site > header > div.search-header.search-header-eff > div.noo-container > form > input.form-control")
	private WebElement edtxSearchItem;
	
	//SUNGLASSES
	@FindBy(css="#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1326.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.instock.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme > div.owl-wrapper-outer.autoHeight > div > div.owl-item.active > a")
	private WebElement sunglasess_selected;

	
	public void hometoChartBag() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10)");
		toChart.click();
	}
	
	public void fromchartToBuyShop() {
		chartToShopmarket.click();
	}
	public void ChartMainShopping() {
		Shoes_from_Compare_Product();
	}
	
	public void ViewCartShooping() {
		btnViewCart.click();
	}
	
	public void searchShopFeature(String item) {
		btnsearchShop.click();
		edtxSearchItem.sendKeys(item);
		edtxSearchItem.sendKeys(Keys.ENTER);
		
	}
	public void Glass_from_Search_Product() {
		chooseSunGlasses();
		sleepDelayCostum();
		sleepDelayCostum();
		chooseSunGlassesDetail();
		
	}
	public void  Shoes_from_Compare_Product() {
		chooseShoes();
		sleepDelayCostum();
		sleepDelayCostum();
		chooseShoesDetail();
//		ContinueCartShooping();
		
//		searchShopFeature();
//		searchShopFeature();
	}
	

	private void chooseSunGlasses() {
		sunglasess_selected.click();
	}
	private void chooseShoes() {
//		Actions drandrop = new Actions(driver);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		drandrop.dragAndDrop(logo, blackheels);
//		js.executeScript("window.scrollBy(0,-100)");
//		WebDriverWait driver_wait = new WebDriverWait(driver, 5);
		
		
		
//		btncompareproduct.click();
		shoesblackheels_selected.click();
//		driver_wait.until(ExpectedConditions.elementToBeSelected(btnselect_option_newFromComapare));
//		sleepDelayCostum();
//		sleepDelayCostum();
//		btnselect_option_newFromComapare.click();
		
//		compareWindowBody.click();
//		sleepDelayCostum();
//		sleepDelayCostum();
//		btnselectoptions_item_selected.click();
//		sleepDelayCostum();
//		sleepDelayCostum();
		
	}
	
	private void chooseSunGlassesDetail() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		lstColor(1);
		lstSize(1);
		btnaddTochartSunGlasses();
	}
	private void chooseShoesDetail() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		lstColor(1);
		lstSize(1);
		btnaddTochartShoe();
	}
	
	
	
	private void btnaddTochartShoe() {
		btnAddtoChartDetailItemShoe.click();
	}
	
	private void btnaddTochartSunGlasses() {
		btnAddtoChartDetailItemSunGlasses.click();
	}
	
	private void lstColor(int selection) {
		

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(listColor));

		listColor.click();

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
	private void lstSize(int selection) {
		

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(listSize));

		listSize.click();

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
	
	private void sleepDelayCostum()  {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
