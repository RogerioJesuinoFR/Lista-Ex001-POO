package exercicio001;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.modelo = "Fusca";
		carro1.marca = "Volkswagen";
		carro1.cor = "Preta";
		carro1.ano = 1960;
		carro1.renavam = 123654789;
		carro1.chassi = "9BM754666687J";
		carro1.placa = "BHD-0489";
		
		carro2.modelo = "Uno";
		carro2.marca = "Fiat";
		carro2.cor = "Prata";
		carro2.ano = 2010;
		carro2.renavam = 978456321;
		carro2.chassi = "25HT5487452P";
		carro2.placa = "ASD-1457";
		
		carro3.modelo = "Prisma";
		carro3.marca = "Chevrolet";
		carro3.cor = "Vermelho";
		carro3.ano = 2014;
		carro3.renavam = 456987123;
		carro3.chassi = "12GD3748526N";
		carro3.placa = "HIJ-0205";
		
		System.out.println("========== Carro 1 ==========");
		System.out.println(carro1.modelo);
		System.out.println(carro1.marca);
		System.out.println(carro1.cor);
		System.out.println(carro1.ano);
		System.out.println(carro1.renavam);
		System.out.println(carro1.chassi);
		System.out.println(carro1.placa);
		
		System.out.println("========== Carro 2 ==========");
		System.out.println(carro2.modelo);
		System.out.println(carro2.marca);
		System.out.println(carro2.cor);
		System.out.println(carro2.ano);
		System.out.println(carro2.renavam);
		System.out.println(carro2.chassi);
		System.out.println(carro2.placa);
		
		System.out.println("========== Carro 3 ==========");
		System.out.println(carro3.modelo);
		System.out.println(carro3.marca);
		System.out.println(carro3.cor);
		System.out.println(carro3.ano);
		System.out.println(carro3.renavam);
		System.out.println(carro3.chassi);
		System.out.println(carro3.placa);
	}
}
