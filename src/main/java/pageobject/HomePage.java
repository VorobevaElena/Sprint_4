package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

// Класс содержит локаторы, элементы с главной страницы
public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage() {
    }
    // Локаторы на главной странице
    private By AcceptCookieButton = By.id("rcc-confirm-button");  // кнопка согласия использования куки
    private By ImgScooter = By.xpath("//img[@alt='Scooter blueprint']"); // элемент самокат
    private By HeadingQuest = By.xpath("//div[text() = 'Вопросы о важном']"); // элемент заголовка Вопросы о важном
    private By OrderButtonTop = By.className("Button_Button__ra12g"); // кнопка заказать вверху сайта
    private By OrderButtonDown = By.xpath("//button[contains(@class, 'Button_Middle')]"); // кнопка заказать внизу сайта
    // Локаторы из списка вопросов и ответов
    private By ListQuestions = By.xpath("//*[@class='accordion__button']"); // элемент вопросов
    private By ListAnswers = By.xpath("//div[@data-accordion-component='AccordionItemPanel']"); // элемент ответов
    // Преобразование локаторов в вебэлементы
    public By getImage() {
        return ImgScooter;
    }
    public WebElement getCookie() {
        return driver.findElement(AcceptCookieButton);
    }
    public WebElement getModQuest() {
        return driver.findElement(HeadingQuest);
    }
    public By getOrderedTop() {
        return OrderButtonTop;
    }
    public By getOrderedDown() {
        return OrderButtonDown;
    }
    // Коллекция из элементов вопросов
    public List<WebElement> getListQuestions() {
        return driver.findElements(ListQuestions);
    }
    // Коллекция из элементов ответов
    public List<WebElement> getListAnswer() {
        return driver.findElements(ListAnswers);
    }
}
