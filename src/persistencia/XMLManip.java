package persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

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
	
	public static List<Gerente> LerXMLGerente() {
		List<Gerente> listaGer = new ArrayList<Gerente>();
        Document doc = null;
        SAXBuilder builder = new SAXBuilder();
        try { 
            doc = builder.build("src/arquivosPersistencia/gerentes.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Element config = doc.getRootElement();
        List lista = config.getChildren("projetoClasses.Gerente");

        for (Iterator iter = lista.iterator(); iter.hasNext();) {
            Element element = (Element) iter.next();
            Gerente ger = new Gerente();
            ger.setNome(element.getChildText("nome"));
            ger.setCpf(Integer.parseInt(element.getChildText("cpf")));
            ger.setTelefone(Integer.parseInt(element.getChildText("telefone")));
            ger.setNCadastroG(Integer.parseInt(element.getChildText("NCadastroG")));
            ger.setDataAdmissao(element.getChildText("DataAdmissao"));
            listaGer.add(ger);
        }
        return listaGer;
	}
	
}
