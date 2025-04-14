package ar.edu.unlp.info.oo1.ejercicio1;

public class Twitt {
	private String texto;
	private Twitt tweet_origen;
	
	// constructor tweet original
	public Twitt(String texto) {
		if (texto.length() >= 1 && texto.length() < 280) {
			this.texto = texto;
			this.tweet_origen = null;
		}
	}
	
	// Convertir un tweet en un retweet
	public void hacerRetweet(Twitt tweetOrigen) {
		if (tweetNoVacio(tweetOrigen)) {
			this.setTweet_origen(tweetOrigen);
			this.setTexto("");
		}
	}
	
	
	// Se obtiene el texto del tweet (vacio si es un retweet)
	public String getTexto() {
		return this.texto;
	}
	
	// Obtener el tweet original (si es un retweet)
	public Twitt getTweetOrigen() {
		return this.tweet_origen;
	}
	// Verifica si el tweet no es null
	private boolean tweetNoVacio(Twitt t) {
		return t != null;
	}

	
	// Metodos privados que son utilizados para modificar el texto y el tweet origen
	
	private void setTexto(String texto) {
		this.texto = texto;
	}

	private void setTweet_origen(Twitt tweet_origen) {
		this.tweet_origen = tweet_origen;
	}
	

	
	
	
	
	
}
