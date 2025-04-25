package ar.edu.unlp.info.oo1.ej8;

public class WifiConn implements Connection{
	private String pict;
	
	public WifiConn(String pict) {
		this.pict = pict;
	}
	
	public String sendData(String data, long crc) {
		return "Enviando por Wifi: " + data + ", CRC: " + crc;
	}
	
	public String pict() {
		return pict;
	}
}
