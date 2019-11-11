public class Socio {
	private String nome;
	private int telefone;
	private int rg;
	private int cpf;
	private String dataAdesao;
	private Endereco endereco;
	MyDate myDate = new MyDate();
	
	public Socio(String nome, int rg, int cpf, String dataAdesao) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dataAdesao = dataAdesao;	
	}

	public Socio(String nome, int telefone, int rg, int cpf, String dataAdesao, Endereco endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
		this.dataAdesao = dataAdesao;
		this.endereco = endereco;
	}

	public void socioInfo() {
		System.out.println("Nome: " + nome);
		if(telefone != 0) {
			System.out.println("Telefone: " + telefone);
		}
		System.out.println("Rg: " + rg);
		System.out.println("CPF: " + cpf);
		System.out.println("Data de adesão: " + dataAdesao);
	}
}
