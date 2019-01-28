package decorator;

import java.util.function.Function;

import decorator.b.CalculadoraSalarioFP;

public class Main {

	public static void main(String[] args) {
		
		Double a_salarioFinal = 
				new decorator.a.DescontoPlanoSaudeCalculadoraSalario(
					new decorator.a.DescontoImpostoCalculadoraSalario(
						new decorator.a.CalculadoraSalario()
				)).calcularSalario(36.5);
		
		System.out.println("Salário com impostos e plano de saúde: " + a_salarioFinal);

		Double b_salarioFinal = 
				new CalculadoraSalarioFP(36.5)
				.calcular(new Function<Double, Double>() {
					@Override
					public Double apply(Double t) {
						return decorator.b.CalculosSalario.calcularSalarioMensal(t);
					}
				})
				.calcular(new Function<Double, Double>() {
					@Override
					public Double apply(Double t) {
						return decorator.b.CalculosSalario.descontarImpostos(t);
					}
				})
				.calcular(new Function<Double, Double>() {
					@Override
					public Double apply(Double t) {
						return decorator.b.CalculosSalario.descontarPlanoSaude(t);
					}
				})
				.getValor();
		
		System.out.println("Salário com impostos e plano de saúde: " + b_salarioFinal);
		
	}

}
