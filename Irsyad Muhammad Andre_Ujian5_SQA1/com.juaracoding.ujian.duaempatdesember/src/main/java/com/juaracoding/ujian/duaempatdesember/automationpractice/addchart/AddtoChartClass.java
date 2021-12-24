package com.juaracoding.ujian.duaempatdesember.automationpractice.addchart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian.duaempatdesember.driver.DriverSingleton;


public class AddtoChartClass {

	private WebDriver driver;

	public AddtoChartClass() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#block_top_menu > ul > li:nth-child(2)")
	private WebElement btndressCatgory;

	@FindBy(css="#block_top_menu > ul > li:nth-child(3) > a")
	private WebElement btntshirtCatgory;
	
	@FindBy(css="#subcategories > ul > li:nth-child(1) > div.subcategory-image > a > img")
	private WebElement btndressCatgorycasual;

	@FindBy(css="#center_column > ul > li > div > div.left-block > div > a.product_img_link > img")
	private WebElement dropitem;
	
	@FindBy(css="#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
	private WebElement selectitem;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span")
	private WebElement continueShopping;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement proceedShoppingChart;
	
	public void buyDress() {
		btndressCatgory.click();
		btndressCatgorycasual.click();
		Actions drandrop = new Actions(driver);
		drandrop.dragAndDrop(btndressCatgory, dropitem).build().perform();
		selectitem.click();
		continueShopping.click();
	}
	public void buyTshirt() {
		btntshirtCatgory.click();
		Actions drandrop = new Actions(driver);
		drandrop.dragAndDrop(btntshirtCatgory, dropitem).build().perform();
		selectitem.click();
		proceedShoppingChart.click();
		
	}
	
	
}
