package codigoPuro;

import java.time.LocalDate;
import java.util.Date;

@SuppressWarnings("serial")
public class MovimentoFinanceiro implements java.io.Serializable{
	
	private int cliente;
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;
	private double valorOriginal;
	private double valorJuros;
	private double valorPagamento;
	
	public MovimentoFinanceiro() {
		
	}
	
	public MovimentoFinanceiro(int cliente, LocalDate dataVencimento, LocalDate dataPagamento, float valorOriginal,
			float valorJuros, float valorPagamento) {
		super();
		this.cliente = cliente;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.valorOriginal = valorOriginal;
		this.valorJuros = valorJuros;
		this.valorPagamento = valorPagamento;
	}
	
	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getValorOriginal() {
		return valorOriginal;
	}

	public void setValorOriginal(double valorOriginal) {
		this.valorOriginal = valorOriginal;
	}

	public double getValorJuros() {
		return valorJuros;
	}

	public void setValorJuros(double valorJuros) {
		this.valorJuros = valorJuros;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public void geraVencimento( LocalDate dtEmissao){
		this.dataVencimento = dtEmissao.plusDays(30);		
	}
	
	public void calculaJuros(double valorOriginal){
		if(valorOriginal == 0){
			throw new IllegalArgumentException();			
		}
		this.valorOriginal = valorOriginal;
		this.valorJuros = valorOriginal * (0.1);
		this.valorPagamento = getValorOriginal() + getValorJuros();
	}	
	
}
