/**
 * Abstração de Passageiros, cujos atributos são: código, nome, RG, CPF, telefone, data de nascimento,
 *  país origem, estado origem, cidade origem, país destino, estado destino, cidade destino, 
 *  número do vôo, acento, necessidades especiais.
 * @author Alvaro
 *
 */
public class Passageiros {
	int código = 12;
	String nome = " Nelson";
	String RG = "48.202.578-3";
	String CPF = "407.978.253-09";
	String telefone = "21 98112-4469";
	String datanascimento = "09/03/1987";
	String passorigem = "Brasil";
	String estadoorigem = "São Paulo";
	String cidadeorigem = "Jardinópolis";
	String paisdestino = "Brasil";
	String estadodestinocidade = "Santa Catarina";
	String cidadedestino = "Foz do Iguaçu";
	int númerovôo = 801;
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
