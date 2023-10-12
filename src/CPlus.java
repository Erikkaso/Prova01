import java.util.ArrayList;

public class CPlus extends Planetas{
	ArrayList<Orbita> posicoesOrbita;
	
	public CPlus(Plano plano) {
		super(6, "C++", 8, 2, plano, "+",2);
		
		posicoesOrbita = new ArrayList<>();
		
		super.mapear(posicoesOrbita, 2, 2, 13);
		super.resumo = "C++ é uma linguagem de programação de propósito geral que é uma extensão da linguagem C.\nÉ frequentemente usada para desenvolvimento de sistemas, jogos, aplicativos de alto desempenho e drivers.";
	}

	@Override
	public void avancar(int avanco) {
		super.rotacao += 0.5*avanco;
		super.contarGiro(posicoesOrbita, avanco, super.velocidade, 48, "+", 6);
	}

}
