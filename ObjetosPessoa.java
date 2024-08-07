package Aula_07_08;

public class ObjetosPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa ();
		Pessoa pessoa2 = new Pessoa ();
		
		pessoa1.setNome(" Tom Cruise");
		pessoa1.setEndereco(" California,EUA");
		pessoa1.setProfissao("Ator");
		pessoa1.setIdade(60);
		pessoa1.setCpf("233.544.125-43");
		pessoa1.setRg("213456890987");
		
		
		pessoa2.setNome(" Messi");
		pessoa2.setEndereco(" Miami,EUA");
		pessoa2.setProfissao("Jogador de Futebol");
		pessoa2.setIdade(35);
		pessoa1.setCpf("435.214.453-32");
		pessoa1.setRg("0987654456789");
		
		
		System.out.println("---------OBJETO 1---------");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());


		
		
		System.out.println("---------OBJETO 2---------");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());
	
		
		

	}

}
