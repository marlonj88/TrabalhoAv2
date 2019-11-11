import java.util.ArrayList;

public class ListaFilmes {
	ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
	Filme f;
	CopiaFilme cop;

	public void addFilme() {
		create();
		create2();
	}
	
	public void create() {
		String[] atores = new String[5];
		atores[0] = "Robert Downey Jr.";
		atores[1] = "Chris Evans";
		atores[2] = "Mark Ruffalo";
		atores[3] = "Chris Hemsworth";
		atores[4] = "Scarlett Johansson";
		
		int[] copias = new int[4];
		int i = 1;
		for(int a : copias) {
			a = i++;
		}
		f = new Filme("vingadores:ultimato", "3h 2m", "25 de abril de 2019", "WMV", atores, copias);
		listaDeFilmes.add(f);
	}
	
	public void create2() {
		String[] atores = new String[5];
		atores[0] = "Joaquin Phoenix";
		atores[1] = "Robert De Niro";
		atores[2] = "Zazie Beetz";
		atores[3] = "Frances Conroy";
		atores[4] = "Brett Cullen";
		
		int[] copias = new int[4];
		int i = 1;
		for(int a : copias) {
			a = i++;
		}
		f = new Filme("coringa", "2h 2m", "3 de outubro de 2019", "WMV", atores, copias);
		listaDeFilmes.add(f);
	}

	public ArrayList<Filme> getFilmeList() {
		return listaDeFilmes;
	}
	
	public void printFilmeInfo(String filme) {
		for (Filme a : listaDeFilmes) {
			if(filme.equals(a.getTitulo())) {
				a.filmeInfo();
			} 
		}
	}
	
	public void printFilmeList() {
		System.out.println("\n");
		for (Filme a : listaDeFilmes) {
			System.out.println(a.getTitulo());
		}
	}
}
