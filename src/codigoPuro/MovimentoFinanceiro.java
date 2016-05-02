package codigoPuro;

import java.util.Date;

public class MovimentoFinanceiro extends junit.framework.TestCase{
	private int ID;
	private char tipoES;
	private int cliente;
	private Date dataVencimento;
	private Date dataPagamento;
	private float valorOriginal;
	private float valorJuros;
	private float valorPagamento;
	
	
	public int geraID(int valorIncremento){
		return 1;
	}
	public Date geraVencimento( Date dtEmissao){
		Date vencimento = new Date();
		return vencimento;
	}
	public float calculaJuros(float valorOriginal){
		float qualquer = 1;
		return qualquer;
	}
	public float calculaValorPagamento(float valorOriginal, float valorJuros){
		return 1;
	}
	
}
