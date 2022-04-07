package funcionarios;

public class APP {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Larissa", "000.000.123-32", 5000);
		Funcionario f2 = new Funcionario("Diego", "111.232.123-32", 9000);
		
		System.out.println(f1.bonus());
		System.out.println(f2.bonus());
		
	}
}
