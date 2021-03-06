package com.catolicasc.org.br;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSearchSpeed {
	
	private String texto = "Esse � um texto generico que logo sera trocado por um gerador de texto";
	private String busca = "texto";
	
	NaiveA n = new NaiveA(busca,texto);
	KmpA k = new KmpA(busca,texto);
    
	@Test
	public void TestNaiveBusca() {
		n.buscar();
 		assertTrue(n.getResposta() != null);
	}
	
	@Test
	public void TestKmpBusca() {
		k.buscar();
 		assertTrue(k.getResposta() != null);
	}

}
