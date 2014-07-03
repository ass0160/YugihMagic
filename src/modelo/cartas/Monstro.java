package modelo.cartas;

import modelo.Tipo;

public class Monstro extends Carta {

	public Monstro(String nome, String descricao, String caracteristica,
			String poder) {
		this.nome = nome;
		this.descricao = descricao;
		this.caracteristicaEspecial = caracteristica;
		this.poder = poder;
		tipoDeCarta = Tipo.MONSTRO;
	}

}
