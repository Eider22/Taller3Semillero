
package taller3.reproductor;

public  abstract class Reproductor {
	private int duracionSegundos;
	private int tamano;
	
	public Reproductor(int duracionSegundos, int tamano) {
		super();
		this.duracionSegundos = duracionSegundos;
		this.tamano = tamano;
	}

	public int getDuracion() {
		return duracionSegundos;
	}

	public void setDuracion(int duracion) {
		this.duracionSegundos = duracion;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}	
	
	public abstract void reproducir();
}
