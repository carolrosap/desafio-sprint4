
public class Pessoa {
	private int codigo;
	private String nome;
	private String endereco;
	private int idade;
	
	public String salvar() {
		return  codigo + ";" + nome + ";" + endereco + ";" + idade;
	}
	public String imprimir() {
		return codigo + "\t" + nome + "\t" + idade + "\t" + endereco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
