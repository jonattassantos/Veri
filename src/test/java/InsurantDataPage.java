package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsurantDataPage {
    private WebDriver driver;

    // Adicione os localizadores e métodos para preencher os dados da aba "Enter Insurant Data"
    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By dateOfBirth = By.id("birthdate");
    private By gender = By.id("gender");
    private By streetAddress = By.id("streetaddress");
    private By country = By.id("country");
    private By zipcode = By.id("zipcode");
    private By city = By.id("city");
    private By occupation = By.id("occupation");
    private By nextButton = By.id("nextenterproductdata");

    public InsurantDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterInsurantData(String firstNameValue, String lastNameValue, String dateOfBirthValue,
                                  String genderValue, String streetAddressValue, String countryValue,
                                  String zipcodeValue, String cityValue, String occupationValue) {
        driver.findElement(firstName).sendKeys(firstNameValue);
        driver.findElement(lastName).sendKeys(lastNameValue);
        driver.findElement(dateOfBirth).sendKeys(dateOfBirthValue);
        driver.findElement(gender).sendKeys(genderValue);
        driver.findElement(streetAddress).sendKeys(streetAddressValue);
        driver.findElement(country).sendKeys(countryValue);
        driver.findElement(zipcode).sendKeys(zipcodeValue);
        driver.findElement(city).sendKeys(cityValue);
        driver.findElement(occupation).sendKeys(occupationValue);
    }

    public void clickNext() {
        driver.findElement(nextButton).click();
    }
}