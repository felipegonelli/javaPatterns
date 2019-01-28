package builder.b;

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
	
	private Produto() {	}
	
	public static class Builder {
		
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
		
		public Builder(Integer id) {
			this.id = id;
		}
		
		public Builder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}
		public Builder imposto(BigDecimal imposto) {
			this.imposto = imposto;
			return this;
		}
		public Builder margemLucro(BigDecimal margemLucro) {
			this.margemLucro = margemLucro;
			return this;
		}
		public Builder valor(BigDecimal valor) {
			this.valor = valor;
			return this;
		}
		public Builder valorVenda(BigDecimal valorVenda) {
			this.valorVenda = valorVenda;
			return this;
		}
		public Builder marca(String marca) {
			this.marca = marca;
			return this;
		}
		public Builder setor(String setor) {
			this.setor = setor;
			return this;
		}
		public Builder rastreamento(String rastreamento) {
			this.rastreamento = rastreamento;
			return this;
		}
		public Builder dataFabricacao(LocalDate dataFabricacao) {
			this.dataFabricacao = dataFabricacao;
			return this;
		}
		public Builder dataValidade(LocalDate dataValidade) {
			this.dataValidade = dataValidade;
			return this;
		}
		
		public Produto build() {
			Produto p = new Produto();
			p.id = this.id;
			p.descricao = this.descricao;
			p.imposto = this.imposto;
			p.margemLucro = this.margemLucro;
			p.valor = this.valor;
			p.valorVenda = this.valorVenda;
			p.marca = this.marca;
			p.setor = this.setor;
			p.rastreamento = this.rastreamento;
			p.dataFabricacao = this.dataFabricacao;
			p.dataValidade = this.dataValidade;
			return p;
		}
		
	}
	
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
