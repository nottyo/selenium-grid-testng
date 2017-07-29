package org.nottyo.samples.testsuites;

import org.nottyo.samples.TestNgTestBase;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.nottyo.samples.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertFalse("".equals(homepage.getTitle()));
  }

  @Test
  public void testBlogNone(){
    driver.get("https://www.blognone.com");
    Assert.assertNotNull(driver.getTitle());
  }
}
