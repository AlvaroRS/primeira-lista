package Faculdade;

public class Professor {

	int Matricula;
	String Nome;
	float CargaHoraria;
	float salario;

	public static void main(String[] args) {
		Professor LP = new Professor();
		LP.Matricula = 1234;
		LP.Nome = "Lucas";
		LP.CargaHoraria = (float) 40.00;
		LP.salario =  (float) 2500.00;

		System.out.println(LP.Matricula + "\n" + LP.Nome + "\n"
				+ LP.CargaHoraria + "\n" + LP.Calculasalario());

		ProfessorHorista substituto = new ProfessorHorista();
		substituto.Matricula = 1234;
		substituto.Nome = "sdfasdfasdLucas";
		substituto.CargaHoraria = (float) 10.00;
		substituto.salarioHora = 18;
		System.out.println("\n   " + substituto.Calculasalario());

	}

	float Calculasalario() {
		return salario;

	}
}
