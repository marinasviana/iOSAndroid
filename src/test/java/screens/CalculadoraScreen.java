package screens;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import steps.iOSAndroidSetup;

public class CalculadoraScreen extends iOSAndroidSetup{
		
	
	public void openApp() throws MalformedURLException {
		
		iOSAndroidSetup.instance.start();
		driver = iOSAndroidSetup.instance.driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
    @AndroidFindBy(id = "android_field_first_number")
    @iOSFindBy(xpath = "//*[@name='apple_first_input']")
    public MobileElement campo1;
    
    @AndroidFindBy(id = "android_field_second_number")
    @iOSFindBy(xpath = "//*[@name='apple_second_input']")
    public MobileElement campo2;
    
    @AndroidFindBy(id = "android_result_text")
    @iOSFindBy(id = "apple_result_text")
    public MobileElement resultado;
    
    @AndroidFindBy(id = "android_button_sum")
    @iOSFindBy(xpath = "//*[@name='apple-sum-button']")
    public MobileElement soma;
    
    @AndroidFindBy(id = "android_button_sub")
    @iOSFindBy(xpath = "//*[@name='apple-subtract-button']")
    public MobileElement subtracao;
    
    @AndroidFindBy(id = "android_button_mult")
    @iOSFindBy(xpath = "//*[@name='apple-multiply-button']")
    public MobileElement multiplicacao;
    
    @AndroidFindBy(id = "android_button_div")
    @iOSFindBy(xpath = "//*[@name='apple-divide-button']")
    public MobileElement divisao;
    
    Map<String, MobileElement> operacao = new HashMap<String, MobileElement>();
    
    
	
	public void numeros( int arg1, int  arg2) {
		campo1.clear();
		campo2.clear();
		campo1.sendKeys(Integer.toString(arg1));
		campo2.sendKeys(Integer.toString(arg2));
		//driver.navigate().back();
		driver.hideKeyboard();
	}
	
	public void operacaoMatematica(String arg1) {
		operacao.put("soma", soma);
		operacao.put("subtração", subtracao);
		operacao.put("multiplicação", multiplicacao);
		operacao.put("divisão", divisao);
		operacao.get(arg1).click();
		
	}
	
	public WebElement resultado() {
		
		return resultado;
		
	}
}
