package com.catolicasc.org.br;

public class TestAbstrata extends BuscaAbastrata {
	
	public TestAbstrata(String busca, String texto) {
		super(busca,texto);
	}
	
	@Override
	public void buscar() {
		System.out.println("Buscando texto");
		
	}
}
