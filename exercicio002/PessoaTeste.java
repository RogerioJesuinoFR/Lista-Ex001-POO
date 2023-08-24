package exercicio002;

public class PessoaTeste {
	
	public static void main (String [] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.nome = "Joao";
		pessoa1.sexo = "Masculino";
		pessoa1.cpf = "12365478964";
		pessoa1.idade = 27;
		pessoa1.altura = 1.70;
		pessoa1.peso = 77.5;
		
		pessoa2.nome = "Maria";
		pessoa2.sexo = "Feminino";
		pessoa2.cpf = "78945612331";
		pessoa2.idade = 45;
		pessoa2.altura = 1.58;
		pessoa2.peso = 56.8;
		
		pessoa3.nome = "Carlos";
		pessoa3.sexo = "Masculino";
		pessoa3.cpf = "45698712379";
		pessoa3.idade = 15;
		pessoa3.altura = 1.78;
		pessoa3.peso = 87.3;
		
		System.out.println("=========== Pessoa 1 ===========");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.sexo);
		System.out.println(pessoa1.cpf);
		System.out.println(pessoa1.idade);
		System.out.println(pessoa1.altura);
		System.out.println(pessoa1.peso);
		
		System.out.println("=========== Pessoa 2 ===========");
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.sexo);
		System.out.println(pessoa2.cpf);
		System.out.println(pessoa2.idade);
		System.out.println(pessoa2.altura);
		System.out.println(pessoa2.peso);
		
		System.out.println("=========== Pessoa 3 ===========");
		System.out.println(pessoa3.nome);
		System.out.println(pessoa3.sexo);
		System.out.println(pessoa3.cpf);
		System.out.println(pessoa3.idade);
		System.out.println(pessoa3.altura);
		System.out.println(pessoa3.peso);
	}
}
