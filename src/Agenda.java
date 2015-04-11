/**
 * 
 * @author Alvaro
 *Abstração de uma agenda, cujos dados a serem registrados são: Nome, telefone, endereço e e-mail.
 */
public class Agenda {
	String Nome;
	String Endereço;
	String Telefone; 
	String Email;
	
	/**
	 * Metodo para testar a agenda.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Agenda contato1 = new Agenda();
		contato1.Nome = "Alvaro Silva";
		contato1.Endereço = "Rua Amador Bueno 25";
		contato1.Telefone = "(16) 99248-8984";
		contato1.Email = "Alvinho20gmail.com";
		
				System.out.println(contato1.Nome + "\n " + contato1.Endereço + "\n  " + 
				contato1.Telefone + "\n   " + contato1.Email);
	}

}
