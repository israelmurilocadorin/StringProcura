package com.catolicasc.org.br;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestSearchSpeed {
	private String texto = "Esse é um texto generico que logo sera trocado por um gerador de texto";
	private String busca = "texto";
	
	NaiveA n = new NaiveA(busca,texto);
	KmpA k = new KmpA(busca,texto);
    
	@Test
	void TestNaiveBusca() {
		n.buscar();
 		assertTrue(n.getResposta() != null);
	}
	
	@Test
	void TestKmpBusca() {
		k.buscar();
 		assertTrue(k.getResposta() != null);
	}

}
