package facade;

public class CalculosSalario {

	public Double calcularSalarioMensal(Double valorPorHora) {
		return valorPorHora * 40 * 5;
	}
	
	public Double calcularImpostos(Double salario) {
		if(salario <= 1903.98) {
			return 0.0;
		}
		else if(salario <= 2826.65) {
			return salario * 0.075;
		}
		else if(salario <= 3751.05) {
			return salario * 0.15;
		}
		else if(salario <= 4664.68) {
			return salario * 0.225;
		}
		else {
			return salario * 0.275;
		}		
	}
	
	public Double calcularPrevidencia(Double salario) {
		if(salario <= 1751.81) {
			return salario * 0.08;
		}
		else if(salario <= 2919.72) {
			return salario * 0.09;
		}
		else if(salario <= 5839.45) {
			return salario * 0.11;
		}
		else {
			return 642.34;
		}
	}
	
	public Double calcularPlanoSaude(Double salario) {
		Double tarifa = salario * 0.2;
		return tarifa > 450 ? 450 : tarifa;
	}
	
	public Double calcularTransporte(Double salario) {
		return salario * 0.06;
	}
}