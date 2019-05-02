package com.catolicasc.org.br;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	String way = "C:\\Users\\israel.cadorin\\Desktop\\pedro.txt";

    	//LeituraDeLinhas arquivo = new LeituraDeLinhas(way);
    	//arquivo.readerFile();
    	//System.out.println(arquivo.getText());
    	//Kmp busca = new Kmp("assim",arquivo.getText());
    	//busca.retornar();

    	
    	String way = "C:\\Users\\israel.cadorin\\Desktop\\pedro1.txt";
    	LeituraDeLinhas arquivo = new LeituraDeLinhas(way);
    	arquivo.createFile("Israel é viadão, e gosta de mamar");
    	arquivo.readerFile();
    	Kmp busca = new Kmp("assim",arquivo.getText());
    	busca.retornar();
    }
}
