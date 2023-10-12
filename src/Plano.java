import java.util.ArrayList;

public class Plano {
	public ArrayList<Celula> listaCelulas;
	ArrayList<Bug> listaBug = new ArrayList<>();
	int quantidadeBugs;
	ArrayList<Desenvolvedor> listaDesenvolvedor = new ArrayList<>();
	int quantidadeDesenvolvedores;
	
	public Plano() {
		listaCelulas = new ArrayList<Celula>();

		int contador = 1;
		for (int i = 1; i <= 15; i++) {
			for (int j = 1; j <= 15; j++) {
				Celula celula = new Celula(contador, i, j);// id;x;y
				listaCelulas.add(celula);
				contador++;
			}
		}
	}
	
	public void criarGrade() {
		int tamanho = listaCelulas.size()-1;
		int xMax = listaCelulas.get(tamanho).posicaoX;
		
		for (Celula celula : listaCelulas) {
			System.out.print(" "+celula.imagem + " ");
			if(celula.posicaoX == xMax)
				System.out.println();
		}
	}
}
