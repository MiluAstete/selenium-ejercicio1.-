import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ejercicio14 {

    @Test
    //Subir este ejercicio a github en una rama nueva llamada selenium/ejercicio1.       Crear una pull request y agregar a seleniumcurso como revisor.
      //Crear un método con un nombre a seleccionar
    //Acceder a Netflix: https://www.netflix.com/uy/
    //Mostrar los elementos h1 y h2 que hay en el sitio
    //Refrescar la página
    //Mostrar el texto de los botones que se encuentran en la página
    //Mostrar la cantidad de elementos div que contiene el sitio
    //Obtener y mostrar el título de la página
    //Mostrar la cantidad de elementos de tipos link
    public void accederNetflix() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        String URL = ("https://www.netflix.com/pe/");
        driver.get(URL);

        System.out.println("---------Test1--------");
        System.out.println(driver.getCurrentUrl());

        List<WebElement> titulo = driver.findElements(By.tagName("h1"));
        System.out.println("----Lista de Titulos------"+titulo.size());
        for (WebElement list:titulo){
            System.out.println(list.getText());
        }
        List<WebElement> lista1=driver.findElements(By.tagName("h2"));
        System.out.println("----------Lista de Subtitulos-------"+lista1.size());
        for(WebElement list:lista1){
            System.out.println(list.getText());
        }

        driver.navigate().refresh();

        List<WebElement> text = driver.findElements(By.tagName("button"));
        System.out.println("--------Lista de button----"+text.size());
        for ( WebElement list:text){
            System.out.println(list.getText());
        }

        List<WebElement> text1 = driver.findElements(By.tagName("div"));
        System.out.println("--------Lista de div-------"+text1.size());

        System.out.println("-----------Titulo de la pagina------");
        System.out.println(driver.getTitle());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("--------La cantidad de links es: "+links.size());
        Thread.sleep(1000);

        driver.quit();


    }

}
