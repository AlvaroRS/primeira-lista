package Faculdade;

public class ProfessorHorista extends Professor{
	float salarioHora;
	
	public float Calculasalario(){
		return salarioHora * CargaHoraria;
	
	}

}
