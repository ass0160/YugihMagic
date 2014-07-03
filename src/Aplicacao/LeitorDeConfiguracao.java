package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import modelo.CardsFactory;
import modelo.Tipo;
import modelo.cartas.Carta;

public class LeitorDeConfiguracao {

	private BufferedReader reader;
	private List<Carta> testeCartas;
	private CardsFactory fac = new CardsFactory();

	public LeitorDeConfiguracao() {
		this.reader = null;
		testeCartas = new LinkedList<Carta>();
	}

	public void readFile(String caminho) {
		try {
			String linhaAtual, nome = null, descricao = null, tipo = null, poder = null, caracteristica = null;
			int line = 0;
			reader = new BufferedReader(new FileReader(caminho));
			while ((linhaAtual = reader.readLine()) != null) {
				if (linhaAtual.contains("#") == false) {
					switch (line) {
					case 0:
						nome = linhaAtual;
						line++;
						break;
					case 1:
						descricao = linhaAtual;
						line++;
						break;
					case 2:
						tipo = linhaAtual;
						line++;
						break;
					case 3:
						poder = linhaAtual;
						line++;
						break;
					case 4:
						caracteristica = linhaAtual;
						Carta a = fac.gerarCarta(nome, descricao,
								selectTipo(tipo), poder, caracteristica);
						testeCartas.add(a);
						line = 0;
						break;
					}
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Tipo selectTipo(String tipo) {
		if (tipo.equalsIgnoreCase(Tipo.MONSTRO.toString()))
			return Tipo.MONSTRO;
		else if (tipo.equalsIgnoreCase(Tipo.ATRIBUTO.toString()))
			return Tipo.ATRIBUTO;
		else if (tipo.equalsIgnoreCase(Tipo.MAGIA.toString()))
			return Tipo.MAGIA;
		else
			return Tipo.ENCANTAMENTO;
	}

	public void testeTodasCartas() {
		for (int i = 0; i < testeCartas.size(); i++) {
			Carta a = testeCartas.get(i);
			System.out.println(a.toString());
		}
	}
}
