import java.util.Scanner;

public class CadastroSocio {
	private Endereco e;
	private Socio s;
	MyDate myDate = new MyDate();
	public Socio CadatroSocio() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String socioNome = input.next();
		System.out.println("Telefone: ");
		int socioTelefone = input.nextInt();
		System.out.println("Rg: ");
		int socioRg = input.nextInt();
		System.out.println("CPF: ");
		int socioCpf = input.nextInt();
		
		System.out.println("Agora digite seu endereço");
		System.out.println("Rua: ");
		String socioRua = input.next();
		System.out.println("numero: ");
		int socioNumero = input.nextInt();
		System.out.println("CEP: ");
		int socioCep = input.nextInt();
		System.out.println("Cidade: ");
		String socioCidade = input.next();
		System.out.println("Bairro: ");
		String socioBairro = input.next();
		
		Endereco endereco = new Endereco(socioRua, socioNumero, socioCep, socioCidade, socioBairro);
		Socio socio = new Socio(socioNome, socioTelefone, socioRg, socioCpf, myDate.formataData(), endereco);
		
		e = endereco;
		s = socio;
		return socio;
	}
	
	public Endereco getE() {
		return e;
	}
	public Socio getS() {
		return s;
	}
	
}
