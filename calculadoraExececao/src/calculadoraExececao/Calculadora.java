package calculadoraExececao;

public class Calculadora {
	private double num1;
	private double num2;
	
	public void adicao(double num1, double num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
		double adicao = num1 + num2;
		System.out.println(" O resultado é: " + adicao);
		
	}
	
	public void subtracao(double num1, double num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
		double subtracao = num1 - num2;
		System.out.println(" O resultado é: " + subtracao); 	 
		
	}
	
	public void mutiplicacao(double num1, double num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
		double mutiplicacao = num1 * num2;
		System.out.println(" O resultado é: " + mutiplicacao);
		
	}
	public void divisao(double num1, double num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
		double divisao = num1 / num2;
		System.out.println(" O resultado é: " + divisao);
		
	}

}
