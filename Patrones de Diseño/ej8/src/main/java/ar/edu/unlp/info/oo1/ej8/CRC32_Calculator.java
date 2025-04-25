package ar.edu.unlp.info.oo1.ej8;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRCStrategy{
	public long crcFor(String datos) {
		CRC32 crc = new CRC32();
		crc.update(datos.getBytes());
		return crc.getValue();
	}
	
}
