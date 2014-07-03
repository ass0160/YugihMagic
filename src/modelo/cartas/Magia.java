package modelo.cartas;

import modelo.Tipo;

public class Magia extends Carta {

	public Magia(String nome, String descricao, String caracteristica,
			String poder) {
		this.nome = nome;
		this.descricao = descricao;
		this.caracteristicaEspecial = caracteristica;
		this.poder = poder;
		tipoDeCarta = Tipo.MAGIA;
	}
}
