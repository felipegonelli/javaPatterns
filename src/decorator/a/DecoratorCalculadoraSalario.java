package decorator.a;

public abstract class DecoratorCalculadoraSalario implements ICalculadoraSalario {

	private final ICalculadoraSalario calculadoraBase;
	protected abstract Double aplicarTransformacao(Double salarioBase);
	
	public DecoratorCalculadoraSalario(ICalculadoraSalario calculadoraBase) {
		this.calculadoraBase = calculadoraBase;
	}
	
	@Override
	public Double calcularSalario(Double valorPorHora) {
		return aplicarTransformacao(calculadoraBase.calcularSalario(valorPorHora));
	}

}
