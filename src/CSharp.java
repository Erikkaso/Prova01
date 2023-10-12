import java.util.ArrayList;

public class CSharp extends Planetas {
	ArrayList<Orbita> posicoesOrbita;

	public CSharp(Plano plano) {
		super(5, "C#", 8, 3, plano, "#",1);

		posicoesOrbita = new ArrayList<>();
		
		super.mapear(posicoesOrbita, 3, 3, 11);
		super.resumo = "C# (C Sharp) é uma linguagem de programação desenvolvida pela Microsoft.\nÉ comumente usada para desenvolvimento de software Windows, jogos com Unity e aplicativos corporativos.";
	}

	@Override
	public void avancar(int avanco) {
		super.rotacao += 4*avanco;
		super.contarGiro(posicoesOrbita, avanco, super.velocidade, 40, "#", 5);
	}

}
