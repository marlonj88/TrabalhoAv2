import java.util.Calendar;
import java.util.ArrayList;

public class Filme {
	private String titulo;
	private String duracao;
	private String lancamento;
	private String formato;
	private String[] atoresPrincipais;
	int[] copia;
	private CopiaFilme cop;
	
	public Filme(String titulo, String duracao, String lancamento, String formato, String[] atoresPrincipais, int[] cop) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.lancamento = lancamento;
		this.formato = formato;
		this.atoresPrincipais = atoresPrincipais;
		this.cop = new CopiaFilme(copia);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public CopiaFilme getCop() {
		return cop;
	}

	public String[] getAtoresPrincipais() {
		return atoresPrincipais;
	}
	public void filmeInfo() {
		System.out.println("\n\nTitulo: " + titulo);
		System.out.println("Duração: " + duracao);
		System.out.println("Lançamento: " + lancamento);
		System.out.println("Formato: " + formato);
		System.out.println("Atores principais: ");
		int i = 1;
		for (String a : atoresPrincipais) {
			 System.out.println(i + "- " + a);
			 i++;
		}
	}
	
	
	
	
}
