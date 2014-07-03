package modelo.cartas;

import modelo.Tipo;

public abstract class Carta {
		/*!! Tem que verificar se PODER vai ser string, como vai ser feito para atribuir as caracteristicas das cartas.*/
		protected String nome,descricao,caracteristicaEspecial,poder; 
		protected Tipo tipoDeCarta;
		
		String retornarNome(){
			return nome;
		}
		String retornarDescricao(){
			return descricao;
		}
		String retornarPoder(){
			return poder;
		}
		Tipo retornarTipo(){
			return tipoDeCarta;
		}
		
		public String toString(){
			String dados = new String();
			dados+=("##Card Info:##\n");
			dados+=("Nome: "+nome+"\n");
			dados+=("Tipo: "+tipoDeCarta.toString()+"\n");
			dados+=("Descricao: "+descricao+"\n");
			dados+=("Caracteristica: "+caracteristicaEspecial+"\n");
			dados+=("Poder: "+poder+"\n");
			return dados;
		}
}
