/**
 * 
 * @author Alvaro
 *Abstração de uma conta bancária, cujos atributos são: Nome do cliente, numero da conta
 *e saldo.
 */
public class ContaBancaria {
	String Nome;
	int NumeroConta;
	float Saldo;
	
	/**
	 * metodo para testar a classe conta bancária.
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContaBancaria MinhaConta = new ContaBancaria();
		MinhaConta.Nome = "Àlvaro";
		MinhaConta.NumeroConta = 1234567;
		MinhaConta.Saldo = (float) 548122.00;
		
				
		System.out.println( MinhaConta.Nome + "\n " + MinhaConta.NumeroConta +"\n  " + MinhaConta.Saldo);
	}

}
