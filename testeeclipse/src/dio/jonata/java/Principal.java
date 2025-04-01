package dio.jonata.java;

public class Principal {
	public static void main(String[] args) {
		Aluno primeiroAluno = new Aluno();
		Aluno segundoAluno = new Aluno();

		segundoAluno.setNome("pedro");
		primeiroAluno.setNome("cassio");
		System.out.println(primeiroAluno.getNome());
	
	}
}
