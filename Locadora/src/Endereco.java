
public class Endereco {
	private String rua;
	private int numero;
	private int cep;
	private String complemento;
	private String cidade;
	private String bairro;
	
	public Endereco(String rua, int numero, int cep, String cidade, String bairro) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
	}
	
	public Endereco(String rua, int numero, int cep, String complemento, String cidade, String bairro) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
	}
	public void enderecoInfo() {
		System.out.println("Rua: " + rua);
		System.out.println("Numero: " + numero);
		System.out.println("CEP: " + cep);
		System.out.println("Cidade: " + cidade);
		System.out.println("Bairro " + bairro);
		
	}
}
