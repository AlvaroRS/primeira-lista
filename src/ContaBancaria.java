/**
 * 
 * @author Alvaro
 *Abstra��o de uma conta banc�ria, cujos atributos s�o: Nome do cliente, numero da conta
 *e saldo.
 */
public class ContaBancaria {
	String Nome;
	int NumeroConta;
	float Saldo;
	
	/**
	 * metodo para testar a classe conta banc�ria.
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContaBancaria MinhaConta = new ContaBancaria();
		MinhaConta.Nome = "�lvaro";
		MinhaConta.NumeroConta = 1234567;
		MinhaConta.Saldo = (float) 548122.00;
		
				
		System.out.println( MinhaConta.Nome + "\n " + MinhaConta.NumeroConta +"\n  " + MinhaConta.Saldo);
	}

}
