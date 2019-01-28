package builder.a;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Produto {

	Integer id;
	String descricao;
	BigDecimal imposto;
	BigDecimal margemLucro;
	BigDecimal valor;
	BigDecimal valorVenda;
	String marca;
	String setor;
	String rastreamento;
	LocalDate dataFabricacao;
	LocalDate dataValidade;
	
	@Override
	public String toString() {
		DecimalFormat dfM = new DecimalFormat("R$ #,###.00");
		DecimalFormat dfP = new DecimalFormat("#,00 %");
		StringBuilder s = new StringBuilder();
		s.append("Id: ").append(id).append("\n");
		s.append("Descrição: ").append(descricao).append("\n");
		s.append("Marca: ").append(marca).append("\n");
		s.append("Valor Produto: ").append(dfM.format(valor)).append("\n");
		s.append("Valor tributação: ").append(dfM.format(imposto)).append("\n");
		s.append("Margem Lucro: ").append(dfP.format(margemLucro)).append("\n");
		s.append("Valor de Venda:").append(dfM.format(valorVenda)).append("\n");
		s.append("Setor: ").append(setor).append("\n");
		s.append("Rastreamento: ").append(rastreamento).append("\n");
		s.append("Data de Fabricação: ").append(dataFabricacao).append("\n");
		s.append("Data de Validade: ").append(dataValidade).append("\n");
		return s.toString();
	}
}
