package decorator.b;

public class CalculosSalario {

	public static Double calcularSalarioMensal(Double valorPorHora) {
		return valorPorHora * 40 * 5;
	}

	public static Double descontarImpostos(Double salario) {
		return salario - (salario * 0.15);
	}
	
	public static Double descontarPlanoSaude(Double salario) {
		return salario - 600;
	}
}
