package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class hoverPage {
    public WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");
    public hoverPage(WebDriver driver){
        this.driver= driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index){
        System.out.println(driver.findElements(figureBox).size());
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();


        return new FigureCaption(figure.findElement(boxCaption));
    }
}

