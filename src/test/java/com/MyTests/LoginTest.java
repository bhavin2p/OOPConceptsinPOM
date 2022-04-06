package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

public class LoginTest extends BaseTest {
	
		
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("title " +title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void verifyLoginPageHeader() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
	}
	
	@Test(priority=3)
	public void doLoginTest() {
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("naveenanimation20@gmail.com", "Test@1234");
		String headerHome = homepage.getHomePageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome, "Getting started with HubSpot");
	}

}
