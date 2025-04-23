package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONExporter extends VoorheesExporter{
	
	@Override
	@SuppressWarnings("unchecked") // me molesta las warning que tira
	public String exportar(List<Socio> socios) {
		JSONArray array = new JSONArray();
		socios.forEach(x -> {
			JSONObject obj = new JSONObject();
			obj.put("nombre", x.getNombre());
			obj.put("email", x.getEmail());
			obj.put("legajo", x.getLegajo());
			array.add(obj);
		});
		
		return array.toJSONString();
	}

}
