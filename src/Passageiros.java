/**
 * Abstra��o de Passageiros, cujos atributos s�o: c�digo, nome, RG, CPF, telefone, data de nascimento,
 *  pa�s origem, estado origem, cidade origem, pa�s destino, estado destino, cidade destino, 
 *  n�mero do v�o, acento, necessidades especiais.
 * @author Alvaro
 *
 */
public class Passageiros {
	int c�digo = 12;
	String nome = " Nelson";
	String RG = "48.202.578-3";
	String CPF = "407.978.253-09";
	String telefone = "21 98112-4469";
	String datanascimento = "09/03/1987";
	String passorigem = "Brasil";
	String estadoorigem = "S�o Paulo";
	String cidadeorigem = "Jardin�polis";
	String paisdestino = "Brasil";
	String estadodestinocidade = "Santa Catarina";
	String cidadedestino = "Foz do Igua�u";
	int n�merov�o = 801;
	int acento = 42;
	String necessidadesespeciais = "sim";
	
	/** metodo para testar a Classe Passageiros
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
       Passageiros tam = new Passageiros();
       System.out.println( tam.nome + "\n" + tam.RG);
	}

}
