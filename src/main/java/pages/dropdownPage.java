package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class dropdownPage {
    public WebDriver driver;
    public dropdownPage(WebDriver driver){
        this.driver= driver;
    }
    public  By dropdown = By.id("dropdown");

    public void selectItem(String option){
        findItem().selectByVisibleText(option);
    }
    public List<String> getItemsValue(){
        List<WebElement> selectedItems = findItem().getAllSelectedOptions();
        return selectedItems.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findItem(){
        return new Select(driver.findElement(dropdown));
    }
}
