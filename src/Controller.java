import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	private String filename = "pessoa.txt";
	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	private ArrayList<Pessoa> novos = new ArrayList<Pessoa>();

	public ArrayList<Pessoa> getLista() {
		return this.lista;
	}
	public void listar() {
		System.out.println("Código\tNome\tIdade\tEndereço");
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.imprimir());	
		}
	}
	public void adicionaPessoa(Pessoa pessoa) {
		this.lista.add(pessoa);
		this.novos.add(pessoa);
	}

	public void grava() throws IOException {
		String linha;
		FileWriter fw = new FileWriter(filename,true); 

		for (Pessoa pessoa : novos) {
			linha = pessoa.salvar();
			fw.write(linha);
			fw.write(System.lineSeparator()); 
		}
		fw.close();

	}
	
	public void leitura() throws IOException {
		if(new File(filename).exists()) {
			Scanner scanner = new Scanner(new File(filename));
			while (scanner.hasNextLine()) {
				Pessoa pessoa = new Pessoa();
				
				String linha = scanner.nextLine();
				Scanner ls = new Scanner(linha);
				ls.useDelimiter(";");
				
				pessoa.setCodigo(ls.nextInt());
				pessoa.setNome(ls.next());
				pessoa.setEndereco(ls.next());
				pessoa.setIdade(ls.nextInt());
				
				this.lista.add(pessoa);
				ls.close();
				
			}
			scanner.close();
		}

	}

}
