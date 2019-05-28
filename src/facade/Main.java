package facade;

public class Main {

	public static void main(String[] args) {
		
		Double valorHora = 16.5;
		CalculadoraSalarioFacade calculadora = new CalculadoraSalarioFacade(valorHora);
		
		System.out.println("Sal�rio Bruto: $" + calculadora.calcularSalarioBruto());
		System.out.println("Descontos: $" + calculadora.calcularDescontosSalario());
		System.out.println("Sal�rio L�quido: $" + calculadora.calcularSalarioLiquido());

	}

}
