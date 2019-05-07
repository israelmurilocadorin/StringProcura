package com.catolicasc.org.br;

public class NaiveA extends BuscaAbastrata {

	public NaiveA(String busca, String texto) {
		super(busca, texto);
	}

	@Override
	public void buscar() {
		
	 	int M = busca.length(); 
        int N = texto.length(); 
  
        for (int i = 0; i <= N - M; i++) { 
            int j; 
            for (j = 0; j < M; j++) 
                if (texto.charAt(i + j) != busca.charAt(j)) 
                    break; 
            if (j == M) {
            	this.setResposta("Padrão foi encontrado!");
                System.out.println("Padrão encontrado no índice " + i); 
            }
        } 
	}
	
	
}
