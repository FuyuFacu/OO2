package ar.info.juego.Encriptador;

public class CifradorRC4 implements Cifrador{
    private RC4 rc4;
    private String clave;
	
	
	public CifradorRC4(String clave) {
		this.rc4 = new RC4(); 
		this.clave = clave;
		
	}

	public String cifrar(String mensaje) {
		return rc4.encriptar(mensaje, clave);
		
	}
	
	public String descifrar(String mensaje) {
		return rc4.desencriptar(mensaje, clave);
	}
	
}
