package UtilsLayer;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass{

	public static void clikOnOkButton()
	{
		driver.switchTo().alert().accept();
	}
	public static void clikOnCancelButton()
	{
		driver.switchTo().alert().dismiss();
	}
	public static String captureAlertText()
	{
		return driver.switchTo().alert().getText();
	}
	public static void enterDataInTextBox(String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
}
