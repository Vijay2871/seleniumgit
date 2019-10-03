package com.experitest.auto;

import org.junit.Before;
import org.junit.Test;


public class AndroidDemoTest extends BaseTest {

	@Before
	public void setUp() throws Exception{
		init("@os='android'", "AndroidDemoTest");
		client.install("cloud:com.experitest.ExperiBank/.LoginActivity:1.0", true, false);
		client.launch("com.experitest.ExperiBank/.LoginActivity", true, true);
	
	}
	
	@Test
	public void test(){
		client.elementSendText(in.Repo.zone("LoginDetails.Username"), in.Repo.element("LoginDetails.Username"), 0, "company");
		client.elementSendText(in.Repo.zone("LoginDetails.Password"), in.Repo.element("LoginDetails.Password"), 0, "company");
		client.click(in.Repo.zone("LoginDetails.Login"), in.Repo.element("LoginDetails.Login"), 0, 1);
		client.verifyElementFound(in.Repo.zone("MainPage.H1"), in.Repo.element("MainPage.H1"), 0);
		client.click(in.Repo.zone("MainPage.Logout"), in.Repo.element("MainPage.Logout"), 0, 1);
	}
	
	
}
