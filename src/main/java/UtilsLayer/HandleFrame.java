package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass {

	public static void switchToChildFrameUsingIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public static void switchToChildFrameUsingNameOrId(String nameid)
	{
		driver.switchTo().frame(nameid);
	}
	
	public static void switchToChildFrameUsingWebElement(WebElement wb)
	{
		driver.switchTo().frame(wb);
	}
	
	public static void switchToParent()
	{
		driver.switchTo().parentFrame();
	}
	
	public static void switchToTopFrame()
	{
		driver.switchTo().defaultContent();
	}
	
}
