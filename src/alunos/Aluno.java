package alunos;

public class Aluno {

	int matricula;
	String nome;
	double notaProva1;
	double notaProva2;
	double notaTrabalho;
	
	public Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
	}

	public Aluno() {
		
	}
	public double media() {
		return ((notaProva1 * 1.5) + (notaProva2 * 1.5) + (notaTrabalho * 2)) / 5;
	}
	
	public int recuperacao() {
		if(this.media() > 7) {
			return 0;
		}else {
			return 1;
		}
		
	}
}
