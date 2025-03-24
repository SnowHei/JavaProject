package empresa;

public class Cofre {
// classe cofrinho
	Dolar dolar = new Dolar(); 
	Euro euro = new Euro();
	Real real = new Real(); 
	
	// lista com dolares, euros e reais 
	// adicionar moedas
	public void adicionarMoedas(int tipoDeMoeda, double moeda) {
		if(tipoDeMoeda == 1) { 
			
			dolar.adicionarDolar(moeda);
		} else if (tipoDeMoeda == 2) { 
			
			euro.adicionarEuro(moeda);
		} else if (tipoDeMoeda == 3) {
		
			real.adicionarReal(moeda);
		} else {
			System.out.println("Valor inválido. Tente novamente");
		}
	}
	// remoção das moedas
	public void removerMoedas(int tipoDeMoeda, double moeda) {
		if(tipoDeMoeda == 1) { 
			
			dolar.removerDolar(moeda);
		} else if(tipoDeMoeda == 2) { 
			
			euro.removerEuro(moeda);
		} else if(tipoDeMoeda ==3) {
			
			real.removerReal(moeda);
		} else { 
			System.out.println("Valor inválido. Tente novamente");
		}
	}
	// listagem das moedas
	public void listaMoedas() {
		dolar.info();
		euro.info();
		real.info();
	}
	// conversao das moedas
	public void totalConversao() {
		double totalConversao = dolar.converter() + euro.converter() + real.converter();
		
		System.out.printf("Convertido em reais: " + "R$%.2f%n", totalConversao);
	}

}