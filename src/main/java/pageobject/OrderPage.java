package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// Класс содержит локаторы и вебэлементы для оформления заказа
public class OrderPage {
    private WebDriver driver;


    // Локаторы для проверки второго сценария
    private final By OrderHeader = By.xpath("//div[(text()= 'Для кого самокат')]"); // элемент страницы заполнения данных
    private final By RentHeader = By.xpath("//div[(text()= 'Про аренду')]"); // элемент страницы заполнения данных
    private final By InputName = By.xpath("//input[@placeholder ='* Имя']"); // поле имя
    private final By InputSurname = By.xpath("//input[@placeholder ='* Фамилия']"); // поле фамилия
    private final By InputAddress = By.xpath("//input[@placeholder ='* Адрес: куда привезти заказ']"); // поле адреса
    private final By InputMetroStation = By.xpath("//input[@placeholder ='* Станция метро']"); // поле метро
    private final By InputPhoneNumber = By.xpath("//input[@placeholder ='* Телефон: на него позвонит курьер']"); // поле телефон
    private final By InputDateCalendar = By.xpath("//input[@placeholder ='* Когда привезти самокат']"); // поле календаря
    private final By InputDate = By.xpath("//div[contains(@class, 'day--today')]"); // поле выбора даты доставки
    private final By InputRentalPeriod = By.className("Dropdown-placeholder"); // элемент выбора срока аренды
    private final By InputRentalDay = By.xpath(".//div[@class='Dropdown-menu']/div[text()='сутки']"); // элемент выбора срока аренды
    private final By CheckboxColour = By.id("grey"); // элемент выбора цвета
    private final By InputComment = By.xpath("//input[@placeholder ='Комментарий для курьера']"); // поле коментария
    private final By NextButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM"); // кнопка далее
    private final By OrderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']//button[contains(text(), 'Заказать')]"); // кнопка заказать
    private final By OrderYesButton = By.xpath("//button[contains(text(), 'Да')]"); // кнопка подтверждения заказа
    public final By OrderPlacedHeader = By.xpath("//div[(text()= 'Заказ оформлен')]");  // элемент страницы подтвержденного заказа

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }


    // Преобразование локаторов в вебэлементы
    public WebElement getName() {
        return driver.findElement(InputName);
    }

    public WebElement getSurname() {
        return driver.findElement(InputSurname);
    }

    public WebElement getAddress() {
        return driver.findElement(InputAddress);
    }

    public WebElement getPhoneNumber() {
        return driver.findElement(InputPhoneNumber);
    }

    public WebElement getStation() {
        return driver.findElement(InputMetroStation);
    }

    public WebElement getCalendar() {
        return driver.findElement(InputDateCalendar);
    }

    public WebElement getDate() {
        return driver.findElement(InputDate);
    }

    public WebElement getRentalPeriod() {
        return driver.findElement(InputRentalPeriod);
    }

    public WebElement getRentalTimeOneDay() {
        return driver.findElement(InputRentalDay);
    }

    public WebElement getColorScooter() {
        return driver.findElement(CheckboxColour);
    }

    public WebElement getComment() {
        return driver.findElement(InputComment);
    }

    public WebElement getNextButton() {
        return driver.findElement(NextButton);
    }

    public WebElement getOrderButton() {
        return driver.findElement(OrderButton);
    }

    public WebElement getPlaceAnOrderYes() {
        return driver.findElement(OrderYesButton);
    }

    public By getTitleOrder() {
        return OrderHeader;
    }

    public By getTitleRent() {
        return RentHeader;
    }

}