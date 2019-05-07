package com.catolicasc.org.br;

public abstract class BuscaAbastrata {
	public String busca;
	public String texto;
	public String resposta = null;
	
	public BuscaAbastrata(String busca, String texto) {
		this.busca = busca;
		this.texto = texto;
	}
	
	public abstract void buscar();
	
	public String getBusca() {
		return this.busca;
	}
	
	public String getTexto() {
		return this.texto;
	}

	public String getResposta() {
		return this.resposta;
	}
	
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
}
