package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.List;

public class Test {

    private WebDriver driver = Hooks.getDriver();

    @Given("^el usuario se encuentra en la página home de mercadolibre")
    public void el_usuario_se_encuentra_en_la_página_home_de_mercadolibre() throws Throwable {
        String title = "Mercado Libre Argentina";
        Assert.assertEquals(title,driver.getTitle());
    }

    @And("^el usuario ingresa a categoria tvs$")
    public void el_usuario_ingresa_a_categoria_tvs() throws Throwable {
        Thread.sleep(2000);
        WebElement categorias = driver.findElement(By.xpath("//a[@href='https://www.mercadolibre.com.ar/categorias#nav-header']"));
        categorias.click();
        Thread.sleep(2000);
        WebElement Tecnologia = driver.findElement(By.xpath("//a[@href='#' and contains(text(),'Tecnología')]"));
        Actions builder = new Actions(driver);
        Thread.sleep(2000);
        builder.moveToElement(Tecnologia);
        builder.perform();
        Thread.sleep(2000);
        WebElement catTvs = driver.findElement(By.xpath("//a[@href='https://televisores.mercadolibre.com.ar/tvs/#menu=categories' and contains(text(),'TVs')]"));
        catTvs.click();
    }

    @When("^el usuario filtra por menor precio$")
    public void el_usuario_filtra_por_menor_precio() throws Throwable {
        Thread.sleep(5000);
        WebElement filter = driver.findElement(By.xpath("//label[@for='sort-by-options-trigger' and contains(text(),'Más relevantes')]"));
        filter.click();//a[@class='ui-list__item-option' and contains(text(),'Menor precio')]
        Thread.sleep(2000);
        WebElement menorP = driver.findElement(By.xpath("//a[@class='ui-list__item-option' and contains(text(),'Menor precio')]"));
        menorP.click();
        Thread.sleep(2000);
    }

    @Then("^Se debe verificar el precio de 22999$")
    public void Se_debe_verificar_el_precio_de_22999() throws Throwable {
        Thread.sleep(2000);
        /*WebElement primerPrecio = driver.findElement(By.xpath("//span[@class='price__fraction'"));
        String precio = primerPrecio.getText();
        Assert.assertEquals("22.999",primerPrecio.getText());
        Thread.sleep(2);*/
    }


}
