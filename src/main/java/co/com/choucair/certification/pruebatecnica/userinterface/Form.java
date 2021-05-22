package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Form {
    public static final Target INPUT_FIRSTNAME = Target.the("Nombre").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Apellido").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Email").located(By.id("email"));
    public static final Target INPUT_BIRTHMONT = Target.the("Mes de cumpleaños").located(By.id("birthMonth"));
    public static final Target INPUT_BIRTHDAY = Target.the("Día de cumpleaños").located(By.id("birthDay"));
    public static final Target INPUT_BIRTHYEAR = Target.the("Año de cumpleaños").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("Next: Location").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CITY = Target.the("Ciudad").located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the("Codigo Postal").located(By.id("zip"));
    public static final Target PUSH_COUNTRY = Target.the("Presionar en Pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target INPUT_COUNTRY = Target.the("Pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT2 = Target.the("Next: Devices").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target PUSH_COMPUTER = Target.the("Presionar en Computador").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_YOURCOMPUTER = Target.the("Computador").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target PUSH_VERSION = Target.the("Presionar en Version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_VERSION = Target.the("Version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target PUSH_LANGUAGE = Target.the("Presionar en Lenguaje").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_LANGUAGE = Target.the("Lenguaje").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target PUSH_MOBIL = Target.the("Presionar Celular").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_YOURMOBIL = Target.the("Celular").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target PUSH_MODEL = Target.the("Presionar Modelo").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("Modelo").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target PUSH_OPERATING = Target.the("Presionar Sistemas Operativo").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OPERATING = Target.the("Sistema Operativo").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_NEXT3 = Target.the("Next: Last Step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD = Target.the("Ingresar Contraseña").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Confirmar Contraseña").located(By.id("confirmPassword"));
    public static final Target SELECT_TERMS = Target.the("Aceptar terminos y condiciones").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target SELECT_POLICY = Target.the("Aceptar politicas de privacidad").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_FINAL = Target.the("Configuracion completa").located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target VERIFY = Target.the("Verifica mensaje final").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[1]"));
}
