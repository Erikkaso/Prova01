import java.util.ArrayList;

public class RubyOnRails extends Planetas {
	ArrayList<Orbita> posicoesOrbita;

	public RubyOnRails(Plano plano) {
		super(3, "Ruby on Rails", 8, 5, plano, "R", 2);

		posicoesOrbita = new ArrayList<>();

		super.mapear(posicoesOrbita, 5, 5, 7);
		super.resumo = "Ruby on Rails, muitas vezes chamado de Rails, é um framework de desenvolvimento web escrito em Ruby.\nEle enfatiza convenções sobre configuração e torna o desenvolvimento de aplicativos web eficiente e produtivo.";
	}

	@Override
	public void avancar(int avanco) {
		super.rotacao += 48 * avanco;
		super.contarGiro(posicoesOrbita, avanco, super.velocidade, 24, "R", 3);
	}

}
