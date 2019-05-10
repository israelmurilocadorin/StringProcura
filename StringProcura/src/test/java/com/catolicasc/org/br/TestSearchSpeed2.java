package com.catolicasc.org.br;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSearchSpeed2 {
	
	private String texto = "Knust]\n" + 
			"Por que você foi assim?\n" + 
			"Sem pensar no que existiu\n" + 
			"Nenhuma despedida ou uma contrapartida\n" + 
			"Ou uma esperança de um dia voltar\n" + 
			"E mesmo que queira muito, é no way\n" + 
			"Não venha falar das coisas que eu não fiz\n" + 
			"Se quiser pegar meu celular, ok\n" + 
			"Buscando razões pra ficar infeliz\n" + 
			"Nem devia atender o celular\n" + 
			"Quantas garrafas até decidir me ligar?\n" + 
			"Por que decidiu ligar?\n" + 
			"Isso não vai nos levar a lugar nenhum, não\n" + 
			"Você não ama ninguém\n" + 
			"Só não sabe lidar com a solidão\n" + 
			"Então arruma reféns\n" + 
			"Só não consegue manter em suas mãos\n" + 
			"Quem não tinha olhos pra mais ninguém\n" + 
			"Não quero mais que me fale\n" + 
			"Foda-se quantas vezes eu já falhei\n" + 
			"Quando meus olhos se perdem no nada\n" + 
			"Pode saber que você tá na mente\n" + 
			"No canto da boca, uma meia risada\n" + 
			"Ah, quando eu penso na gente\n" + 
			"Eu não sei, pô\n" + 
			"Parece que tudo muda de lugar\n" + 
			"E de repente você tá tão perto\n" + 
			"Aquela vontade de te abraçar\n" + 
			"Só que cai a ficha que cê não tá perto\n" + 
			"Eu pensei, sei lá\n" + 
			"A gente podia se ver, se pá\n" + 
			"Não sei bem, só ali conversar\n" + 
			"Se rolar, a gente pula pra parte de se casar\n" + 
			"Eu ouvi amém, e eu achava que eu era de gelo\n" + 
			"E que o meu coração era pedra\n" + 
			"Sua fragilidade tem força\n" + 
			"Pois de alguma forma me quebra\n" + 
			"Ela tem o jeito que me faz pensar que\n" + 
			"O mundo ainda tem valor e que o amor faz sentido\n" + 
			"Tu deixou bem mais que um bilhete\n" + 
			"Seu sorriso é um tiro, então mire\n" + 
			"Eu achava que eu tinha um colete\n" + 
			"Mas tu sempre é um mero calibre\n" + 
			"Eu vou dar um Nike pra Cinderela\n" + 
			"De cristal com o nome dela\n" + 
			"Pois só ela me deu a mão\n" + 
			"Caminhando num chão de terra, yeah\n" + 
			"Até tentei me declarar\n" + 
			"Mas todos meus planos falharam\n" + 
			"De tentar definir com palavras\n" + 
			"O que os meus olhos sempre te falaram\n" + 
			"Será que cê vai me olhar com os olhos da primeira vez que te vi\n" + 
			"E vai me encarar olhando meus lábios, sabendo que eu nem quero ir?\n" + 
			"Tava eu e a Clara naquela praça, fazendo fumaça\n" + 
			"E cê veio, dando luz pro meu mundo tão feio\n" + 
			"Sentido pra minha vida sem freio e sem farol, nem pra onde mirar\n" + 
			"Envolto em caracóis, só de lembrar perco o ar\n" + 
			"Por que você foi assim?\n" + 
			"Nem sequer pensou em ter dó de mim, paciência\n" + 
			"Só agiu pela carência e nem ligou se ia me machucar\n" + 
			"E eu esperando cê se arrepender e voltar atrás\n" + 
			"Juro que cê não vai querer sair do meu lado\n" + 
			"Depois que entender que lugar do passado é passado\n" + 
			"E que cicatrizes fazem parte\n" + 
			"E que elas aumentam toda vez que cê parte\n" + 
			"Isso não vai te levar a lugar nenhum, não\n" + 
			"Você não ama ninguém\n" + 
			"Xinga e me diz que eu sou mó vacilão\n" + 
			"Mas tu vacila também\n" + 
			"Vou pro meu baile\n" + 
			"Te marolar no meu novo freestyle\n" + 
			"Diz pra geral que nós fomos um mero detalhe\n" + 
			"Solidão, não sei mais se é melhor, melhor\n" + 
			"Me dá a mão, não sei mais ser só\n" + 
			"Meu bem, meu mal, meu mel, meu Sol\n" + 
			"Manhã sem sal, sem você\n" + 
			"Não sei se cê saca que eu tenho o queijo e a faca\n" + 
			"Que eu sou um herói pirata com o pôr-do-Sol nas mãos\n" + 
			"Um Deus primata, que não quer ouro nem prata\n" + 
			"Sou um homem de lata que quis ter um coração\n" + 
			"Isso não vai te levar a lugar nenhum, não\n" + 
			"Você não ama ninguém\n" + 
			"Você não ama ninguém\n" + 
			"Isso não vai te levar a lugar nenhum, não";
	private String busca = "a";
	
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
