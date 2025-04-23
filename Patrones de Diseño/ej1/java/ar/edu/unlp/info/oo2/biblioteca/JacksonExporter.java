package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JacksonExporter extends VoorheesExporter {

    @Override
    public String exportar(List<Socio> socios) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(socios);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error al serializar con Jackson", e);
        }
    }
}
