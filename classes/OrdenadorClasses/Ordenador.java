package OrdenadorClasses;

import java.util.Collection;

public class Ordenador {
	
	private double maiorValor;
	private double menorValor;
	private double valorMedio;
	private	double valorMediana;
	
	public double getMaiorValor() {
		return maiorValor;
	}

	public void setMaiorValor(double maiorValor) {
		this.maiorValor = maiorValor;
	}

	public double getMenorValor() {
		return menorValor;
	}

	public void setMenorValor(double menorValor) {
		this.menorValor = menorValor;
	}

	public double getValorMedio() {
		return valorMedio;
	}

	public void setValorMedio(double valorMedio) {
		this.valorMedio = valorMedio;
	}

	public double getValorMediana() {
		return valorMediana;
	}

	public void setValorMediana(double valorMediana) {
		this.valorMediana = valorMediana;
	}
	
	void inserirColecao(Collection<String> pColecao) {
		String maiorValor = "0";
		
		for(String valor : pColecao) {
			if(Double.parseDouble(valor) > Double.parseDouble(maiorValor)) {
				maiorValor = valor;
				this.maiorValor = Double.parseDouble(maiorValor);
			}
		}
	}
	
}
