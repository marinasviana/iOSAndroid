package steps;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import screens.CalculadoraScreen;
	
public class CalculadoraSteps extends CalculadoraScreen{
	
	
	
	

	@Dado("^que estou com a calculadora aberta$")
	public void que_estou_com_a_calculadora_aberta() throws Throwable {
		openApp();
		
		
	}

	@Quando("^quando informo os numeros (\\d+) e (\\d+)$")
	public void quando_informo_os_numeros_e(int arg1, int arg2) {
		
		numeros( arg1,  arg2);
	}

	

	@Quando("^escolhoa a operação \"([^\"]*)\"$")
	public void escolhoa_a_operação(String arg1)  {
		operacaoMatematica(arg1);
	}

	

	@Então("^devo ver o resultado igual a (\\d+)$")
	public void devo_ver_o_resultado_igual_a(int arg1) throws Throwable {
		int resultado = Integer.valueOf(resultado().getText());
		assertEquals(arg1, resultado);
		
	}
}
