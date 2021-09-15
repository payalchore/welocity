package com.uitests.homepagetest;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.setup.BaseFramework;

public class HomePageTests extends BaseFramework {
	@Test
	public void verifyTitleOfHomePage() {
		Assert.assertEquals(driver.getTitle(), "Yavatmal District Central Co-Operative Bank Limited");

	}

}
