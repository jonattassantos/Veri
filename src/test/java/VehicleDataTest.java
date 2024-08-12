package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import pages.VehicleDataPage;
import pages.InsurantDataPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleDataTest {
    private WebDriver driver;
    private VehicleDataPage vehicleDataPage;
    private InsurantDataPage insurantDataPage;

    @BeforeEach
    public void setUp() {
        // caminho para o driver do Chrome
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://sampleapp.tricentis.com/101/app.php");

        vehicleDataPage = new VehicleDataPage(driver);
        insurantDataPage = new InsurantDataPage(driver);
    }

    @Test
    public void testVehicleDataForm() {
        vehicleDataPage.enterVehicleData("Ford", "Focus", "2000", "150", "01/01/2010", "2", "Gasoline", "500", "1500", "20000");
        vehicleDataPage.clickNext();

        // Validação 1: Verificar se o título da página está correto após o envio dos dados do veículo
        String expectedTitle = "Enter   Vehicle Data";
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.contains(expectedTitle), "O título da página não corresponde ao esperado.");

        insurantDataPage.enterInsurantData("John", "Doe", "01/01/1980", "Male", "1234 Elm Street", "USA", "12345", "Anytown", "Employee");
        insurantDataPage.clickNext();

        // Validação 2: Verificar se um elemento específico na página de dados do segurado está presente
        WebElement confirmationElement = driver.findElement(By.id("firstname"));
        assertTrue(confirmationElement.isDisplayed(), "O elemento de confirmação não está visível.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
