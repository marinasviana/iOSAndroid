package steps;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import screens.CalculadoraScreen;
	
public class CalculadoraSteps extends CalculadoraScreen{
	
	@Dado("^que estou com a calculadora aberta$")
	public void queEstouComCalculadoraAberta() throws MalformedURLException {
		openApp(iOSAndroidSetup.start(System.getProperty("environment")));
	}

	@Quando("^quando informo os numeros \"([^\"]*)\" e \"([^\"]*)\"$")
	public void quandoInformoOsNumeros(String primeiroNumero, String segundoNumero) {
		numeros( primeiroNumero,  segundoNumero);
	}

	@Quando("^escolhoa a operação \"([^\"]*)\"$")
	public void escolhoOperação(String arg1)  {
		operacaoMatematica(arg1);
	}

	@Então("^devo ver o resultado igual a \"([^\"]*)\"$")
	public void devoVerResultadoIgual(String resultadoEsperado){
		assertEquals(resultadoEsperado, resultadoObtido());
	}
}
