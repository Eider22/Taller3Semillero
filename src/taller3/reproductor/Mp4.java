package taller3.reproductor;

public class Mp4 extends Reproductor {
	private String creador;
	private String tipoVideo;

	public Mp4(int duracionSegundos, int tamano, String creador, String tipoVideo) {
		super(duracionSegundos, tamano);
		this.creador = creador;
		this.tipoVideo = tipoVideo;
	}

	@Override
	public void reproducir() {
		System.out.println("Se esta reproduciendo el formato mp4");

	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getTipoVideo() {
		return tipoVideo;
	}

	public void setTipoVideo(String tipoVideo) {
		this.tipoVideo = tipoVideo;
	}

}
