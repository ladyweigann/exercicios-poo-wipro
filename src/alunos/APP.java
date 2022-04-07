package alunos;

public class APP {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(2792, "Larissa", 7.5, 8.2, 10);
		Aluno aluno2 = new Aluno(2345, "Pedro", 5.2, 3.7, 7);
		
		
		System.out.println(aluno.media());
		System.out.println(aluno.recuperacao());
		
		System.out.println(aluno2.media());
		System.out.println(aluno2.recuperacao());
		
	}
}
