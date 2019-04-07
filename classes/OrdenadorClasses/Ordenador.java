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

	public double getMenorValor() {
		return menorValor;
	}

	public double getValorMedio() {
		return valorMedio;
	}

	public double getValorMediana() {
		return valorMediana;
	}

	public void setValorMediana(double valorMediana) {
		this.valorMediana = valorMediana;
	}
	
	void inserirColecao(Collection<String> pColecao) {
		
		String maiorValor = "0";
		String menorValor = "999999";
		double soma = 0;
		double tamanho = 0;
		
		for(String valor : pColecao) {
			if(Double.parseDouble(valor) > Double.parseDouble(maiorValor)) {
				maiorValor = valor;
				this.maiorValor = Double.parseDouble(maiorValor);
			}
			if(Double.parseDouble(valor) > Double.parseDouble(menorValor)) {
				menorValor = valor;
				this.menorValor = Double.parseDouble(menorValor);
			}
			if(valor == "") {
				soma = soma + Double.parseDouble(valor);
			}
		}
		tamanho = pColecao.size();
		this.valorMedio = soma / tamanho;
			
	}
	
	void informarValor(String pValor) {
		if(Double.parseDouble(pValor) > this.maiorValor) {
			this.maiorValor = Double.parseDouble(pValor);
		}
		if(pValor == "") {
			throw new NumberFormatException("digite algum valor");
		}
	}
	
}
