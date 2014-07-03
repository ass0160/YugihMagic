package modelo;

import Aplicacao.LeitorDeConfiguracao;
import modelo.cartas.Carta;

public class Teste extends Thread{

	public static void main(String[] args){
		System.out.println("###Teste de leitura do configurador e criação das cartas####\n");
		LeitorDeConfiguracao leitor = new LeitorDeConfiguracao();
		leitor.readFile("/Users/nathanGodinho/Documents/workspace/YugihMagic/src/cardsBase.cfg");
		leitor.testeTodasCartas();
	}

}
