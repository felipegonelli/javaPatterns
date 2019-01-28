package decorator.b;

import java.util.function.Function;

public class CalculadoraSalarioFP {

	private Double valor;
	
	public CalculadoraSalarioFP(Double valorPorHora) {
		valor = valorPorHora;
	}
	
	public CalculadoraSalarioFP calcular(Function<Double, Double> calculo) {
		valor = calculo.apply(valor);
		return this;
	}
	
	public Double getValor() { return valor; }
	public void setValor(Double valor) { this.valor = valor; }
}
