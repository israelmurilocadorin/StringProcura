package com.catolicasc.org.br;

public class KmpA extends BuscaAbastrata {

	public KmpA(String busca, String texto) {
		super(busca, texto);

	}

	@Override
	public void buscar() {
		int m = this.getBusca().length(); 
		int n = this.getTexto().length();
		int lps[] = new int[m];
		int j = 0;
		int i = 0;

		while (i < n) {
			if (this.getBusca().charAt(j) == this.getTexto().charAt(i)) {
				j++;
				i++;
			}
			if (j == m) {
				System.out.println("Padrão encontrado no índice " + (i - j));
				this.setResposta("Padrão foi encontrado!");
				j = lps[j - 1];
			} else if (i < n && this.getBusca().charAt(j) != this.getTexto().charAt(i)) {
				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
			}
		}
	}

}
