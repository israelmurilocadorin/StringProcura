package com.catolicasc.org.br;

public class NaiveA extends BuscaAbastrata {

	public NaiveA(String busca, String texto) {
		super(busca, texto);
	}

	@Override
	public void buscar() {
		int M = this.getBusca().length();
		int N = this.getTexto().length();

		for (int i = 0; i <= N - M; i++) {
			int j;
			for (j = 0; j < M; j++)
				if (this.getTexto().charAt(i + j) != this.getBusca().charAt(j))
					break;
			if (j == M) {
				System.out.println("Padrão encontrado no índice " + i);
				this.setResposta("Padrão foi encontrado!");
			}
		}
	}

}
