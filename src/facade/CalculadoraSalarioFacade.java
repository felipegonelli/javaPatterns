package facade;

import java.util.concurrent.atomic.DoubleAdder;

public class CalculadoraSalarioFacade {

	private CalculosSalario calculoSalario;
	private Double valorHora;
	
	public CalculadoraSalarioFacade(Double valorHora) {
		this.calculoSalario = new CalculosSalario();
		this.valorHora = valorHora;
	}
	
	public Double calcularSalarioBruto() {
		return calculoSalario.calcularSalarioMensal(valorHora);
	}

	public Double calcularSalarioLiquido() {
		return calcularSalarioBruto() - calcularDescontosSalario();
	}
	
	public Double calcularDescontosSalario() {
		Double salario = calcularSalarioBruto();
		DoubleAdder desconto = new DoubleAdder();
		desconto.add(calculoSalario.calcularImpostos(salario));
		desconto.add(calculoSalario.calcularPrevidencia(salario));
		desconto.add(calculoSalario.calcularPlanoSaude(salario));
		desconto.add(calculoSalario.calcularTransporte(salario));
		return desconto.sum();
	}
}
