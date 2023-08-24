package exercicio004;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.numeroRA = "a2566214";
		aluno1.nome = "Rogerio Jesuino";
		aluno1.curso = "Analise e Desenvolvimento de Sistemas";
		aluno1.turno = "Noite";
		aluno1.periodo = 2;
		aluno1.coeficiente = 0.868;
		aluno1.situacao = "regular";
		
		aluno2.numeroRA = "a2789345";
		aluno2.nome = "Pedro Silva";
		aluno2.curso = "Analise e Desenvolvimento de Sistemas";
		aluno2.turno = "Noite";
		aluno2.periodo = 2;
		aluno2.coeficiente = 0.675;
		aluno2.situacao = "regular";
		
		aluno3.numeroRA = "a5488976";
		aluno3.nome = "Maria Aparecida";
		aluno3.curso = "Engenharia Quimica";
		aluno3.turno = "Integral";
		aluno3.periodo = 5;
		aluno3.coeficiente = 0.798;
		aluno3.situacao = "regular";
		
		System.out.println("========= Aluno 1 ========");
		System.out.println(aluno1.numeroRA);
		System.out.println(aluno1.nome);
		System.out.println(aluno1.curso);
		System.out.println(aluno1.turno);
		System.out.println(aluno1.periodo);
		System.out.println(aluno1.coeficiente);
		System.out.println(aluno1.situacao);
		System.out.println("========= Aluno 2 ========");
		System.out.println(aluno2.numeroRA);
		System.out.println(aluno2.nome);
		System.out.println(aluno2.curso);
		System.out.println(aluno2.turno);
		System.out.println(aluno2.periodo);
		System.out.println(aluno2.coeficiente);
		System.out.println(aluno2.situacao);
		System.out.println("========= Aluno 3 ========");
		System.out.println(aluno3.numeroRA);
		System.out.println(aluno3.nome);
		System.out.println(aluno3.curso);
		System.out.println(aluno3.turno);
		System.out.println(aluno3.periodo);
		System.out.println(aluno3.coeficiente);
		System.out.println(aluno3.situacao);
	}
}
