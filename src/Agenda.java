/**
 * 
 * @author Alvaro
 *Abstra��o de uma agenda, cujos dados a serem registrados s�o: Nome, telefone, endere�o e e-mail.
 */
public class Agenda {
	String Nome;
	String Endere�o;
	String Telefone; 
	String Email;
	
	/**
	 * Metodo para testar a agenda.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Agenda contato1 = new Agenda();
		contato1.Nome = "Alvaro Silva";
		contato1.Endere�o = "Rua Amador Bueno 25";
		contato1.Telefone = "(16) 99248-8984";
		contato1.Email = "Alvinho20gmail.com";
		
				System.out.println(contato1.Nome + "\n " + contato1.Endere�o + "\n  " + 
				contato1.Telefone + "\n   " + contato1.Email);
	}

}
