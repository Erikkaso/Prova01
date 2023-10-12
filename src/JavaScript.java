import java.util.ArrayList;

public class JavaScript extends Planetas {
	ArrayList<Orbita> posicoesOrbita;

	public JavaScript(Plano plano) {
		super(2, "JavaScript", 8, 6, plano, "j",3);

		posicoesOrbita = new ArrayList<>();

		super.mapear(posicoesOrbita, 6, 6, 5);
		super.resumo = "JavaScript é uma linguagem de script amplamente usada para desenvolvimento web.\nEle permite que você crie interações dinâmicas em páginas da web, manipule o DOM e construa aplicativos front-end poderosos.";
	}
	
	public void avancar(int avanco) {
		super.rotacao += 10*avanco;
		super.contarGiro(posicoesOrbita, avanco, super.velocidade, 16, "j", 2);
	}

}
