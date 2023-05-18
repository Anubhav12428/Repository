package Tests;

import org.testng.annotations.Test;

import BrowserFunction.Base;

public class TC1 extends Base{

	@Test
	public void GetTitle() {
		
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	
	@Test
	public void GetURL() {
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void GetWindowHandle() {
		
		String WHandle = driver.getWindowHandle();
		System.out.println(WHandle);
	}
}
