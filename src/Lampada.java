/**
 * Abstração de uma lampada, cujos comandos são: ligar e desligar
 * @author Alvaro
 *
 */
public class Lampada {
	
	/** metodo para testar a classe lampada
	 * 
	 * @param args
	 */
	public static void main(String[]args){
	
		Lampada  luz=new Lampada();
		luz.ligar();
		luz.desligar();
		
	}
	/** 
	 * metodo para ligar a lampada
	 */
	public void ligar(){
		System.out.println("Lanpada ligada");
	}
	/**
	 * Metodo para desligar a lampada
	 */
	
	public void desligar(){
		System.out.println("Lanpada desligada");
	}
	
	
	
}
