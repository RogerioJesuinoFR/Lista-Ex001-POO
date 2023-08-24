package exercicio005;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora();
		Calculadora calculadora2 = new Calculadora();
		Calculadora calculadora3 = new Calculadora();
		
		calculadora1.marca = "Cassio";
		calculadora1.modelo = "sx777";
		calculadora1.tipo = "Cientifica";
		calculadora1.memoria = 32.0;
		
		calculadora2.marca = "HP";
		calculadora2.modelo = "HC877";
		calculadora2.tipo = "Cientifica";
		calculadora2.memoria = 64.0;
		
		calculadora3.marca = "Cassio";
		calculadora3.modelo = "CC90";
		calculadora3.tipo = "Comum";
		calculadora3.memoria = 16.0;
		
		System.out.println("========= Calculadora 1 =========");
		System.out.println(calculadora1.marca);
		System.out.println(calculadora1.modelo);
		System.out.println(calculadora1.tipo);
		System.out.println(calculadora1.memoria);
		System.out.println("========= Calculadora 2 =========");
		System.out.println(calculadora2.marca);
		System.out.println(calculadora2.modelo);
		System.out.println(calculadora2.tipo);
		System.out.println(calculadora2.memoria);
		System.out.println("========= Calculadora 3 =========");
		System.out.println(calculadora3.marca);
		System.out.println(calculadora3.modelo);
		System.out.println(calculadora3.tipo);
		System.out.println(calculadora3.memoria);
	}
}
