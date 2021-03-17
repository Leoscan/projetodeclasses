package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import projetoClasses.Funcionario;

public class CSVManip {

	final static String path = "src/arquivosPersistencia/funcionarios.csv";
	final static List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    
	public static boolean lerCSV() {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	
	        String line = br.readLine();
	        line = br.readLine();
	        while (line != null) {
	            String[] vect = line.split(";");
	            String nome = vect[0];
	            int cpf = Integer.parseInt(vect[1]);
	            int telefone = Integer.parseInt(vect[2]);
	            int NCadastroF = Integer.parseInt(vect[2]);
	            String DataAdmissao = vect[0];
	            
	            Funcionario F = new Funcionario(nome, cpf, telefone, NCadastroF, DataAdmissao);
	            listaFuncionario.add(F);
	
	            line = br.readLine();
	        }
	        System.out.println("-----------------------------------------");
	        System.out.println("Lista de Funcionarios do arquivo CSV:");
	        
	        for (Funcionario p : listaFuncionario) {
	            System.out.println(p);
	        }
	        System.out.println("-----------------------------------------");
	        return true;
	    }
	    catch (IOException e) {
	        System.out.println("Error: " + e.getMessage());
	        return false;
	    }
	}
	
}
