/**
 * Abstra��o de um Empregado, cujos atributos s�o: n�mero de matricula, 
 * nome, fun��o, sal�rio e data de admiss�o.
 * @author Alvaro
 *
 */
public class Empregado {
 int Matricula = 140005;
 String Nome = "Z� Pereira";
 String Funcao = "Motorista";
 float salario = (float)1242.35;
 String dataadimicao = "22\05\2008";
 
 /** metodo para testar a classe Empregado
	 * 
	 * @param args
	 */
	
 public static void main(String[] args) {
		
	 Empregado funcionario = new Empregado();
	 System.out.println(funcionario.Matricula + "\n" + funcionario.Nome + "\n" + funcionario.Funcao +
			 "\n" + funcionario.salario + "\n" + funcionario.dataadimicao);

	}

}
