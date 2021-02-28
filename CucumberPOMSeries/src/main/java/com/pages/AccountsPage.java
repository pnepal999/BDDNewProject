/*
 * package com.pages;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement;
 * 
 * public class AccountsPage { private WebDriver driver;
 * 
 * private By accountSection = By.cssSelector("div#center_column span");
 * 
 * public AccountsPage(WebDriver driver) { this.driver= driver; } public int
 * getAccountSectionCount() { return
 * driver.findElements(accountSection).size()-1; } public List<String>
 * getAccountSecetionsList() { List<String> accountsList = new
 * ArrayList<String>(); List<WebElement> accountHeaderList =
 * driver.findElements(accountSection); for(WebElement e: accountHeaderList ) {
 * String text =e.getText(); System.out.println(text); accountsList.add(text); }
 * return accountsList; } }
 */