package Ex1_Calculadora;

public class ClassCalculadora implements Calculadora{
	
	@Override
	/*teste*/
	public int somar(String n1, String n2) {
		int numero1 = Integer.parseInt(n1);
		int numero2 = Integer.parseInt(n2);
		if(n1 == "" || n2 == "") {
			throw new RuntimeException("digite os dois valores");
		}
		int resultado = numero1 + numero2;
		return resultado;
	}
	
	@Override
	public double dividir(String n1, String n2) {
		double numero1 = Double.parseDouble(n1);
		double numero2 = Double.parseDouble(n2);
		double resultado = numero1 / numero2;
		if(n1 == "" || n2 == "") {
			throw new RuntimeException("digite os dois valores");
		}
		return resultado;
	}
	
	@Override
	public double raizQuadrada(String n1) {
		double numero = Double.parseDouble(n1);
		double resultado = Math.pow(numero, 0.5);
		if(n1 == "") {
			throw new RuntimeException("digite um numero");
		}
		return resultado;
	}
}
