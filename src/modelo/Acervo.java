package modelo;

import java.util.List;

import modelo.cartas.Carta;

public class Acervo implements AcervoGenerico {

	private List<Carta> allCards;
	private AbstractFactory cardsFactory;
	private volatile static Acervo unicaInstancia;

	private Acervo() {

	}

	public static Acervo geraInstancia() {
		synchronized (Acervo.class) {
			if (unicaInstancia == null) {
				unicaInstancia = new Acervo();
			}
		}
		return unicaInstancia;
	}

	public void criarCarta(String nome, String poder, String caracteristica,
			int quantidade) {
		// TODO Auto-generated method stub

	}

	public Carta retornaCarta(String nome, Tipo tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Carta> mostrarTodasAsCartas() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarCarta(int posicao) {
		// TODO Auto-generated method stub

	}

}
