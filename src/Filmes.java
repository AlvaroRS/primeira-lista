/**
 * Abstra��o de filmes, cujos atributos s�o: c�digo, nome, sinopse, atores, tempo de dura��o,
 * distribuidora, c�digo de barras, classifica��o, g�nero, ano de lan�amento e quantidade.
 * @author Alvaro
 *
 */
public class Filmes {
	int codigo = 1; 
	String nome = "Piratas do Caribe";
	String snopse = "� Um filme que fala sobre piratas" ; 
	String atores = "Johnny Depp, Geoffrey Rush, Orlando Bloom, Keira Knightley";
	float tempoDura�ao = (float) 1.53;
	String distribuidora = "Disney";
	int codBarras = 123456789;
	String classificacao = "Liberado para todas as idades";
	String genero = "Aventura";
	int anoLan�amento = 2006;
	int quantidade = 3;

	/** metodo para testar a classe Filmes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Filmes filme=new Filmes();
		System.out.println(filme.codigo + "\n" + filme.nome + "\n" + filme.snopse + "\n" +
		filme.atores + "\n" + filme.tempoDura�ao + "\n" + filme.distribuidora + "\n" +
		filme.codBarras + "\n" + filme.classificacao + "\n" + filme. genero + "\n" + 
		filme.anoLan�amento + "\n" + filme.quantidade);
		

	}

}
