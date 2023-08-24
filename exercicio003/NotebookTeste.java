package exercicio003;

public class NotebookTeste {

	public static void main(String[] args) {
		Notebook notebook1 = new Notebook();
		Notebook notebook2 = new Notebook();
		Notebook notebook3 = new Notebook();
		
		notebook1.marca = "Dell";
		notebook1.modelo = "Inspiron";
		notebook1.polegadas = 12.7;
		notebook1.processador = "Intel core i7";
		notebook1.memoriaRAM = 8.0;
		notebook1.armazenamento = 528;
		
		notebook2.marca = "Samsung";
		notebook2.modelo = "Galaxy book 3";
		notebook2.polegadas = 14.6;
		notebook2.processador = "Intel core i7";
		notebook2.memoriaRAM = 8.0;
		notebook2.armazenamento = 528;
		
		notebook3.marca = "Apple";
		notebook3.modelo = "MacBook pro 13";
		notebook3.polegadas = 18.2;
		notebook3.processador = "Intel core i9";
		notebook3.memoriaRAM = 16.0;
		notebook3.armazenamento = 528;
		
		System.out.println("========== Notebook1 ==========");
		System.out.println(notebook1.marca);
		System.out.println(notebook1.modelo);
		System.out.println(notebook1.polegadas);
		System.out.println(notebook1.processador);
		System.out.println(notebook1.memoriaRAM);
		System.out.println(notebook1.armazenamento);
		
		System.out.println("========== Notebook2 ==========");
		System.out.println(notebook2.marca);
		System.out.println(notebook2.modelo);
		System.out.println(notebook2.polegadas);
		System.out.println(notebook2.processador);
		System.out.println(notebook2.memoriaRAM);
		System.out.println(notebook2.armazenamento);
		
		System.out.println("========== Notebook3 ==========");
		System.out.println(notebook3.marca);
		System.out.println(notebook3.modelo);
		System.out.println(notebook3.polegadas);
		System.out.println(notebook3.processador);
		System.out.println(notebook3.memoriaRAM);
		System.out.println(notebook3.armazenamento);
	}
}
