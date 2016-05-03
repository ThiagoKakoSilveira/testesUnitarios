package codigoPuro;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MovimentoFinanceiroTest {
	public static MovimentoFinanceiro mf = new MovimentoFinanceiro();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void geraVencimentoTest() {
		LocalDate dataAgora = LocalDate.now();
		mf.geraVencimento(dataAgora);
		LocalDate esperada = LocalDate.now().plusDays(30);
		LocalDate inesperada = LocalDate.now();

		assertEquals(esperada, mf.getDataVencimento());
		assertNotEquals(inesperada, mf.getDataVencimento());
	}

	@Test
	public void calculaJuros() {
		
		mf.calculaJuros(100);
//		assertEquals(expected, actual);
		assertEquals(Double.valueOf(mf.getValorOriginal()), Double.valueOf(100));
		assertEquals(Double.valueOf(mf.getValorJuros()), Double.valueOf(10));
		assertEquals(Double.valueOf(mf.getValorPagamento()), Double.valueOf(110));
		assertNotEquals(Double.valueOf(90), Double.valueOf(mf.getValorOriginal()));
		assertNotEquals(Double.valueOf(90), Double.valueOf(mf.getValorJuros()));
		assertNotEquals(Double.valueOf(90), Double.valueOf(mf.getValorPagamento()));
	}
	
	@Test(expected=NullPointerException.class)
	public void geraVencimentoTestException(){
		mf.geraVencimento(null);
		LocalDate esperada = LocalDate.now().plusDays(30);
		assertEquals(esperada, mf.getDataVencimento());
	}

	@Test(expected=IllegalArgumentException.class)
	public void calculaJurosExceptionTest() {
		mf.calculaJuros(0);
	}	
}
