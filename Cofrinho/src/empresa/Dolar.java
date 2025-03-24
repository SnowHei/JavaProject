package empresa;

public class Dolar extends Moeda {
// classe Dolar
	private double valor = 0;
	
	double valor() {
		return valor;
	}
	
	void adicionarDolar(double moeda) {
		valor = valor() + moeda;
	}

	void removerDolar(double moeda) {
		valor = valor() - moeda;	
	}
	
	void info() {
		System.out.printf("Dolares = $%.2f%n", valor);
	}

	
	double converter() {
		
		double converterDolaresParaReais = valor() * 5.7; //dolar no momento atual
		
		return converterDolaresParaReais;
		
	}
}