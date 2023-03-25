package taller3.reproductor;

public class Wav extends Reproductor {
	private String artista;
	private String genero;

	public Wav(int duracionSegundos, int tamano, String artista, String genero) {
		super(duracionSegundos, tamano);
		this.artista = artista;
		this.genero = genero;
	}

	@Override
	public void reproducir() {
		System.out.println("Se esta reproduciendo el formato Wav");
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
