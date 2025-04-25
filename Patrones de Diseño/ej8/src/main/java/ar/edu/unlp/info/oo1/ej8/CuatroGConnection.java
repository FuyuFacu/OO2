package ar.edu.unlp.info.oo1.ej8;

public class CuatroGConnection implements Connection{
	private String symbol;
	
	public CuatroGConnection(String symbol) {
		this.symbol = symbol;
	}
	
	public String sendData(String data, long crc) {
		return "Enviando por 4G: " + data + ", CRC: " + crc;
	}
	
	public String pict() {
		return symbol;
	}
	
	public String symb() {
		return symbol;
	}


}
