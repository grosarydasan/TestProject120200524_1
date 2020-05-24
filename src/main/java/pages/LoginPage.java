package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By txtUsername = By.xpath("//input[@name='uid']");
    By txtPassword = By.xpath("//input[@name='password']");
    By lblTitletext = By.className("barone");
    By btnLogin = By.name("btnLogin");

    public void setUsername(String username){
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }

    public String getLoginTitle(){
        return driver.findElement(lblTitletext).getText();
    }

    public void login(String username, String password){
        this.setUsername(username);
        this.setPassword(password);
        this.clickLogin();
    }

}
