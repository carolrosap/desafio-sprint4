import java.io.IOException;
import java.util.Scanner;

public class Menu {
	private static Scanner sc = new Scanner(System.in);
	private static Controller controller = new Controller();
	
	public static void main(String[] args) throws IOException {
		int opcao;
		controller.leitura();
		do {
			System.out.println("## Escolha uma das op��es abaixo ##");
			System.out.println("Op��o 1 - Cadastra pessoas");
			System.out.println("Op��o 2 - Imprime pessoas cadastradas");
			System.out.println("Op��o 0 - Sair do programa");
			System.out.println("_______________________");
			System.out.print("Digite aqui sua op��o: ");
			opcao = sc.nextInt();
			if(opcao == 1) 
				cadastra();
			else if(opcao == 2)
				controller.listar();
			else if(opcao!=0)
				System.out.println("Op��o inv�lida, tente novamente");
			else
				controller.grava();
			
		}while(opcao!=0);
		
		sc.close();
	}
	
	private static void cadastra() throws IOException{
		Pessoa pessoa = new Pessoa();
		System.out.print("Digite o c�digo: ");
		pessoa.setCodigo(sc.nextInt());
		System.out.print("Digite o nome: ");
		pessoa.setNome(sc.next());
		System.out.print("Digite o endere�o: ");
		pessoa.setEndereco(sc.next());
		System.out.print("Digite a idade: ");
		pessoa.setIdade(sc.nextInt());
		controller.adicionaPessoa(pessoa);
	}

}
