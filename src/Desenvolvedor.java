
import java.util.Random;

public class Desenvolvedor {

	public int id;
	public int posicaox;
	public int posicaoy;
	public Plano plano;
	public String imagem;

	Random gerador = new Random();

	public Desenvolvedor(int id, Plano plano) {
		this.id = id;
		this.posicaox = gerador.nextInt(15) + 1;

		this.posicaoy = gerador.nextInt(15) + 1;

		this.plano = plano;
		this.imagem = "\u001B[32mD\u001B[0m";

		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.posicaoX == this.posicaox && aux.posicaoY == this.posicaoy) {
				while (aux.bug != null && aux.desenvolvedor != null && aux.planeta != null) {
					this.posicaox = gerador.nextInt(15) + 1;
					this.posicaoy = gerador.nextInt(15) + 1;
				}
				plano.listaCelulas.get(i).desenvolvedor = this;
				plano.listaCelulas.get(i).imagem = this.imagem;
			}
		}
	}
}
