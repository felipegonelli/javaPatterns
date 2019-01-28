package decorator.a;

public class DescontoImpostoCalculadoraSalario extends DecoratorCalculadoraSalario {
	
	public DescontoImpostoCalculadoraSalario(ICalculadoraSalario calculadoraBase) {
		super(calculadoraBase);
	}

	@Override
	protected Double aplicarTransformacao(Double salarioBase) {
		return salarioBase - (salarioBase * 0.15);
	}

}
