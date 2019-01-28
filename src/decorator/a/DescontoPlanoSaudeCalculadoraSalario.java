package decorator.a;

public class DescontoPlanoSaudeCalculadoraSalario extends DecoratorCalculadoraSalario {
	
	public DescontoPlanoSaudeCalculadoraSalario(ICalculadoraSalario calculadoraBase) {
		super(calculadoraBase);
	}

	@Override
	protected Double aplicarTransformacao(Double salarioBase) {
		return salarioBase - 600;
	}

}
