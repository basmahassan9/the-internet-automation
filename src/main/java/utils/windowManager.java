package utils;

import org.openqa.selenium.WebDriver;
import pages.DLExample2Page;

import java.util.ArrayList;
import java.util.Set;

public class windowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public windowManager(WebDriver driver){
        this.driver = driver;
        navigate =driver.navigate();
    }
    public void goBack(){
       navigate.back();
    }
    public  void goForward(){
        navigate.forward();
    }
    public  void refreshPage(){
        navigate.refresh();
    }
    public void goTo(String url){
        navigate.to(url);
    }
    public void switchToTab(String tabTitle){
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows.size());
        windows.forEach(System.out::println);

        for(String wind:windows){
            System.out.println("switching to "+ wind);
            driver.switchTo().window(wind);
            System.out.println(driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
    public DLExample2Page switchToTab1() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.get(1));
            return new DLExample2Page(driver);
        }
     return null;
    }
}
