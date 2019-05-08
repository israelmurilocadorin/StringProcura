package com.catolicasc.org.br;

public class Naive {
	private String busca;
	private String texto;
	
	public Naive(String busca,String texto) {
		this.busca = busca;
		this.texto = texto;
	}
	
	public void procurar() { 
        int M = busca.length(); 
        int N = texto.length(); 
  
        for (int i = 0; i <= N - M; i++) { 
            int j; 
            for (j = 0; j < M; j++) 
                if (texto.charAt(i + j) != busca.charAt(j)) 
                    break; 
            if (j == M)
                System.out.println("Pattern found at index " + i); 
        } 
    }
	
}
