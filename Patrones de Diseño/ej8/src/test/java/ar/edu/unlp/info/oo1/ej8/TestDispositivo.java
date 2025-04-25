package ar.edu.unlp.info.oo1.ej8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestDispositivo {

    @Test
    void testSend() {
        CRCStrategy crc16 = new CRC16_Calculator();
        Connection wifi = new WifiConn("WiFi Symbol");
        Ringer ringer = new Ringer();
        Display display = new Display();
        
        Dispositivo dispositivo = new Dispositivo(ringer, display);
        dispositivo.configurarCRC(crc16);
        dispositivo.conectar(wifi);
        
        String result = dispositivo.send("Hello, World!");
        
        assertEquals("Enviando por Wifi: Hello, World!, CRC: 26586", result); // El CRC puede variar
    }
    
    @Test
    void testConectar() {
        CRCStrategy crc16 = new CRC16_Calculator();
        Connection cuatroG = new CuatroGConnection("4G Symbol");
        Ringer ringer = new Ringer();
        Display display = new Display();
        
        Dispositivo dispositivo = new Dispositivo(ringer, display);
        dispositivo.configurarCRC(crc16);
        dispositivo.conectar(cuatroG);
        
        String result = dispositivo.conectar(cuatroG);
        
        assertEquals("Mostrando: 4G Symbol", result);
    }
    
    @Test
    void testConfigurarCRC() {
        CRCStrategy crc16 = new CRC16_Calculator();
        CRCStrategy crc32 = new CRC32_Calculator();
        
        Connection wifi = new WifiConn("WiFi Symbol");
        Ringer ringer = new Ringer();
        Display display = new Display();
        
        Dispositivo dispositivo = new Dispositivo(ringer, display);
        
        dispositivo.configurarCRC(crc16);
        dispositivo.conectar(wifi);
        String resultCRC16 = dispositivo.send("Test CRC16");
        
        dispositivo.configurarCRC(crc32);
        String resultCRC32 = dispositivo.send("Test CRC32");
        
        assertNotEquals(resultCRC16, resultCRC32);
    }



}
