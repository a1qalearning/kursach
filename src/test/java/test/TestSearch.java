package test;

import test.forms.*;
import webdriver.BaseTest;

public class TestSearch extends BaseTest {
	public void runTest() {
		logger.step(1);
		browser.navigate(site);
		browser.waitForPageToLoad();
		logger.step(2);
		EbayMainForm emf = new EbayMainForm();
		logger.step(3);
		emf.searchFor(searchtext);
		logger.step(4);
		EbaySearchResultsForm ecr = new EbaySearchResultsForm();
		logger.step(5);
		ecr.searchAssert(searchtext);
	}
}
