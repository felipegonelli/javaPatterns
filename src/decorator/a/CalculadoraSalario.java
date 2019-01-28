package decorator.a;

public class CalculadoraSalario implements ICalculadoraSalario {

	@Override
	public Double calcularSalario(Double valorPorHora) {
		return valorPorHora * 40 * 5;
	}

}
