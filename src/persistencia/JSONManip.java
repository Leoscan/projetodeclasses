package persistencia;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import projetoClasses.Comprador;

public class JSONManip {

	
	public static boolean gravarJsonCompradores(List<Comprador> lista) {
		Gson gson = new Gson();
		String json = gson.toJson(lista);
		FileWriter writer;
		try {
			writer = new FileWriter("src/arquivosPersistencia/compradores.json");		
			writer.write(json);
			writer.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public static List<Comprador> lerJSON() {
		List<Comprador >lista = new ArrayList<Comprador>();
		try(Reader reader = new FileReader("src/arquivosPersistencia/listTodosCompradores.json")) {		
			Type listType = new TypeToken<ArrayList<Comprador>>(){}.getType();
			lista = new Gson().fromJson(reader, listType);
		} catch (IOException i) {
			i.printStackTrace();
		}
		return lista;
	}
	
	
}
