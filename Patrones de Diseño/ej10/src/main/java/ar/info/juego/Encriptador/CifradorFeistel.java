package ar.info.juego.Encriptador;

public class CifradorFeistel implements Cifrador{
	private FeistelCipher feistelCipher;
	
	
	
	public CifradorFeistel(String clave) {
		this.feistelCipher = new FeistelCipher(clave);

	}

	
	public String cifrar(String mensaje) {
		return feistelCipher.encode(mensaje);
	}
	
	public String descifrar(String mensaje) {
		return feistelCipher.encode(mensaje);
	}
	
}
