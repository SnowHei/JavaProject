package empresa;

public class Euro extends Moeda {
// classe Euro
	private double valor = 0;
	
	double valor() {
		return valor;
	}
	
	void adicionarEuro(double moeda) {
		valor = valor() + moeda;
	}

	void removerEuro(double moeda) {
		valor = valor() - moeda;	
	}
	
	void info() {
		System.out.printf("Euros = €%.2f%n", valor);
	}

	
	double converter() {
		
		double converterEuroParaReal = valor() * 6.2; //euro atualmente
		
		return converterEuroParaReal;
		
	}

}