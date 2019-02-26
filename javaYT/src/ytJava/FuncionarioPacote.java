package ytJava;

public class FuncionarioPacote {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		String nome = f.getNome();
		f.setNome("Andrey");
		System.out.println(f.getNome());
		
		
		boolean ativo = f.isAtivo();
		f.isAtivo();
		System.out.println(f.isAtivo());
	}
	
	
}
