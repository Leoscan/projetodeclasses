package persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import projetoClasses.Gerente;

public class XMLManip {

	public static boolean gravarXMLGerente(List<Gerente> gerentes) {
		XStream xstream = new XStream(new DomDriver());
		String xml = xstream.toXML(gerentes);
		FileWriter writerXML;
		try {
			writerXML = new FileWriter("src/arquivosPersistencia/gerentes.xml");		
			writerXML.write(xml);
			writerXML.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
