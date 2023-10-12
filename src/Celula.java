//import robo.Aluno;
//import robo.Bug;
//import robo.Robo;

public class Celula {
	public int posicaoX;
	public int posicaoY;
	public int id;
	public String imagem;
	public Planetas planeta;	
	public Desenvolvedor desenvolvedor;
	public Bug bug;
	
	public Celula(int id, int y , int x) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		desenvolvedor = null;
		imagem = "-";
		bug = null;
	}
}
