package com.sandrini.nasa;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;

public class OnlineTest {

	private static final String URI = "http://localhost:8080/rest/mars";

	@Test
	public void movimentoComRotacaoParaDireita() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("MMRMMRMM");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("(2,0,S)", response.readEntity(String.class));
	}

	@Test
	public void movimentoParaEsquerda() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("MML");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("(0,2,W)", response.readEntity(String.class));
	}

	@Test
	public void repeticaoDaRequisicaoComMovimentoParaEsquerda() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("MML");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("(0,2,W)", response.readEntity(String.class));
	}

	@Test
	public void comandoInvalido() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("AAA");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("400 Bad Request", response.readEntity(String.class));
	}

	@Test
	public void posicaoInvalidaParaONorte() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("MMMMMMMMMMMMMMMMMMMMMMMM");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("400 Bad Request", response.readEntity(String.class));
	}

	@Test
	public void posicaoInvalidaParaOSul() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("RRM");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("400 Bad Request", response.readEntity(String.class));
	}
	
	@Test
	public void posicaoExtremaAoNorte() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("MMMM");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("(0,4,N)", response.readEntity(String.class));
	}
	
	@Test
	public void posicaoExtremaALeste() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("RMMMM");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("(4,0,E)", response.readEntity(String.class));
	}
	
	@Test
	public void posicaoExtremaAOeste() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("RMMLMLMM");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("(0,1,W)", response.readEntity(String.class));
	}
	
	@Test
	public void posicaoExtremaAoSul() {
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target(URI).path("MMRMRMM");
	    
	    Response response = target.request().post(null);

	    Assert.assertEquals("(1,0,S)", response.readEntity(String.class));
	}
}
