/**
 * Abstração de filmes, cujos atributos são: código, nome, sinopse, atores, tempo de duração,
 * distribuidora, código de barras, classificação, gênero, ano de lançamento e quantidade.
 * @author Alvaro
 *
 */
public class Filmes {
	int codigo = 1; 
	String nome = "Piratas do Caribe";
	String snopse = "É Um filme que fala sobre piratas" ; 
	String atores = "Johnny Depp, Geoffrey Rush, Orlando Bloom, Keira Knightley";
	float tempoDuraçao = (float) 1.53;
	String distribuidora = "Disney";
	int codBarras = 123456789;
	String classificacao = "Liberado para todas as idades";
	String genero = "Aventura";
	int anoLançamento = 2006;
	int quantidade = 3;

	/** metodo para testar a classe Filmes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Filmes filme=new Filmes();
		System.out.println(filme.codigo + "\n" + filme.nome + "\n" + filme.snopse + "\n" +
		filme.atores + "\n" + filme.tempoDuraçao + "\n" + filme.distribuidora + "\n" +
		filme.codBarras + "\n" + filme.classificacao + "\n" + filme. genero + "\n" + 
		filme.anoLançamento + "\n" + filme.quantidade);
		

	}

}
