/**
 * Abstra��o de um Livro, cujos atributos s�o: c�digo, nome, autores, editora, 
 * ano da publica��o, c�digo de barras, se��o, prateleira e quantidade.
 * @author Alvaro
 *
 */
public class Livros {
	int codigo = 1; 
	String nome = "Jogos Vorazes";
	String autores = "Suzane Collins";
	String editora = "Rocco";
	int codBarras = 123456789;
	String secao = "Literatura estrangeira";
	String prateleira = "Aventura";
	int anopublicacao = 2008;
	int quantidade = 3;
	
	/** metodo para testar a classe Livros
	 * 
	 * @param args
	 */ 
	
	public static void main(String[] args) {
		Livros livro=new Livros();
		System.out.println(livro.codigo + "\n" + livro.nome + "\n" +livro.autores + "\n" +
		livro.editora + "\n" +livro.codBarras + "\n" + livro.secao + "\n" + livro. prateleira +
		"\n" + livro.anopublicacao + "\n" + livro.quantidade);

	}

}
