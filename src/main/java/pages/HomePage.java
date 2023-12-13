package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user-d")
	WebElement userId; //

	@FindBy(how = How.NAME, using = "pass-d")
	WebElement password;

	@FindBy(xpath = "//label[@id='cms-label-tc']")
	WebElement checkBox;

	@FindBy(id = "cms-login-submit")
	WebElement loginButton;

	public void inputTextInUserIdAndPasswordFieldThenClickLoginButton() {
		inputText(userId, "mahmud hasna");
		inputText(password, "Rumaisa1234559");
		pause(1);
		clickElement(checkBox);
		pause(1);
		clickElement(loginButton);
		pause(1);
	}

}
