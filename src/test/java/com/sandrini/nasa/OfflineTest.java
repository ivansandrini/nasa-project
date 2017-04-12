package com.sandrini.nasa;

import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;

public class OfflineTest {
	@Test
	public void movimentoComRotacaoParaDireita() {
		Mars mars = new Mars();
		Response response = mars.move("MMRMMRMM");

		Assert.assertEquals("(2,0,S)", response.getEntity());
	}

	@Test
	public void movimentoParaEsquerda() {
		Mars mars = new Mars();
		Response response = mars.move("MML");

		Assert.assertEquals("(0,2,W)", response.getEntity());
	}

	@Test
	public void repeticaoDaRequisicaoComMovimentoParaEsquerda() {
		Mars mars = new Mars();
		Response response = mars.move("MML");

		Assert.assertEquals("(0,2,W)", response.getEntity());
	}

	@Test
	public void comandoInvalido() {
		Mars mars = new Mars();
		Response response = mars.move("AAA");

		Assert.assertEquals("400 Bad Request", response.getEntity());
	}

	@Test
	public void posicaoInvalidaParaONorte() {
		Mars mars = new Mars();
		Response response = mars.move("MMMMMMMMMMMMMMMMMMMMMMMM");

		Assert.assertEquals("400 Bad Request", response.getEntity());
	}

	@Test
	public void posicaoInvalidaParaOSul() {
		Mars mars = new Mars();
		Response response = mars.move("RRM");

		Assert.assertEquals("400 Bad Request", response.getEntity());
	}
	
	@Test
	public void posicaoExtremaAoNorte() {
		Mars mars = new Mars();
		Response response = mars.move("MMMM");
		
		Assert.assertEquals("(0,4,N)", response.getEntity());
	}
	
	@Test
	public void posicaoExtremaALeste() {
		Mars mars = new Mars();
		Response response = mars.move("RMMMM");
		
		Assert.assertEquals("(4,0,E)", response.getEntity());
	}
	
	@Test
	public void posicaoExtremaAOeste() {
		Mars mars = new Mars();
		Response response = mars.move("RMMLMLMM");
		
		Assert.assertEquals("(0,1,W)", response.getEntity());
	}
	
	@Test
	public void posicaoExtremaAoSul() {
		Mars mars = new Mars();
		Response response = mars.move("MMRMRMM");
		
		Assert.assertEquals("(1,0,S)", response.getEntity());
	}
}
