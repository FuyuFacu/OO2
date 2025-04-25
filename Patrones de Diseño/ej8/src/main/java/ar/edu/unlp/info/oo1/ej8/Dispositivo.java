package ar.edu.unlp.info.oo1.ej8;

public class Dispositivo {
	private Ringer ringer;
	private Display display;
	private Connection connection;
	private CRCStrategy crcCalculator;
	
    public Dispositivo(Ringer ringer, Display display) {
        this.ringer = ringer;
        this.display = display;
    }
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public String conectar(Connection nuevaConexion) {
		this.connection = nuevaConexion;
		this.ringer.ring();
		return this.display.showBanner(nuevaConexion.pict());
	}
	
	public void configurarCRC(CRCStrategy nuevoCRC) {
		this.crcCalculator = nuevoCRC;
	}
	
	
	
	
	
}
