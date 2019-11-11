import java.util.Scanner;

public class Locacao {
//	private int idLocacao;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("*****Locadora sóboista*****");
		ListaFilmes listaFilmes = new ListaFilmes();
		listaFilmes.addFilme();
		
		System.out.println("Deseja alugar um filme?");
		String resp = input.next();
		
		if(resp.equals("sim")){
			CadastroSocio cadastro = new CadastroSocio();
			System.out.println(cadastro.CadatroSocio());
			cadastro.getS().socioInfo();
			cadastro.getE().enderecoInfo();
			
			for(int i = 0; i == 0;) {
				System.out.println("\nO que você deseja?");
				System.out.println("1- Lista de filmes \n2- Alugar filme \n3- infomações de um filme \n4- Sair");
				int tes = input.nextInt();
				
				switch(tes) {
				case 1:
					System.out.println("1");
					listaFilmes.printFilmeList();
					System.out.println("0- sair");
					int sair = input.nextInt();
					break;
				case 2:
					System.out.println("qual filme você quer alugar?");
					String alugar = input.next();
					listaFilmes.printFilmeInfo(alugar);
					//listaFilmes;
					System.out.println("sucesso!");
					i++;
					break;
				case 3:
					String verFilme;
					int c = 0;
					do {
						System.out.println("Qual filme você deseja olhar?");
						listaFilmes.printFilmeInfo(input.next());
						
						System.out.println("Deseja ver outro filme?");
						if(!input.next().equals("sim")) {
							c++;
						}
					}while(c == 0);					
					break;
				case 4:
					System.out.println("4");
					i++;
					break;
				default:
					System.out.println("nonono");
				}
			}
		}	
	}
}
