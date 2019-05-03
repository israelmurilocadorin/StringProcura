package com.catolicasc.org.br;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeituraDeLinhas {
	
	public String way;
	public String text = "Ainda não foi lido";
	
	public LeituraDeLinhas(String way){
		this.way = way;
	}
	
	public void createFile(String content){
		try {
			File file = new File(this.way);
			if (!file.exists()) {			
				file.createNewFile();

				//Prepara para escrever no arquivo
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				// Escreve e fecha arquivo
	            bw.write(content);
	            bw.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readerFile(){
		text = "";
		try{
			 FileReader ler = new FileReader(this.way);
			 BufferedReader reader = new BufferedReader(ler);  
			 String linha;
			
			 while( (linha = reader.readLine()) != null ){
	              text = text + linha +" ";
			 }	
			 reader.close();
			 
		}catch(IOException e){
			e.printStackTrace();
		}
	     
	}
	
	public String getText() {
		return text;
	}
}
