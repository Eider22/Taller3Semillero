package taller3.reproductor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Reproductor mp3 = new Mp3(195, 150, "Juan Agudelo", "Pop");
		Reproductor wav = new Wav(180, 175, "Robert Iglesias", "Rock");
		Reproductor mp4 = new Mp4(205, 190, "Alfredo Castro", "Drama");

		List<Reproductor> reproductores = new ArrayList<Reproductor>();
		reproductores.add(mp3);
		reproductores.add(wav);
		reproductores.add(mp4);

		for (Reproductor reproductor : reproductores) {
			reproductor.reproducir();
		}
	}

}
