package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleDataPage {
    private WebDriver driver;

    private By make = By.id("make");
    private By model = By.id("model");
    private By cylinderCapacity = By.id("cylindercapacity");
    private By enginePerformance = By.id("engineperformance");
    private By dateOfManufacture = By.id("dateofmanufacture");
    private By numberOfSeats = By.id("numberofseats");
    private By fuelType = By.id("fuel");
    private By payload = By.id("payload");
    private By totalWeight = By.id("totalweight");
    private By currentMileage = By.id("mileage");
    private By nextButton = By.id("nextenterinsurantdata");

    public VehicleDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterVehicleData(String makeValue, String modelValue, String cylinderCapacityValue,
                                 String enginePerformanceValue, String dateOfManufactureValue,
                                 String numberOfSeatsValue, String fuelTypeValue, String payloadValue,
                                 String totalWeightValue, String currentMileageValue) {
        driver.findElement(make).sendKeys(makeValue);
        driver.findElement(model).sendKeys(modelValue);
        driver.findElement(cylinderCapacity).sendKeys(cylinderCapacityValue);
        driver.findElement(enginePerformance).sendKeys(enginePerformanceValue);
        driver.findElement(dateOfManufacture).sendKeys(dateOfManufactureValue);
        driver.findElement(numberOfSeats).sendKeys(numberOfSeatsValue);
        driver.findElement(fuelType).sendKeys(fuelTypeValue);
        driver.findElement(payload).sendKeys(payloadValue);
        driver.findElement(totalWeight).sendKeys(totalWeightValue);
        driver.findElement(currentMileage).sendKeys(currentMileageValue);
    }

    public void clickNext() {
        driver.findElement(nextButton).click();
        driver.close();
    }
}