package projetoClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import persistencia.CSVManip;
import persistencia.JSONManip;
import persistencia.XMLManip;



public class Main {
	public static void main(String[] args) {
	
	//PARTE XML -- CRIA UM ARQUIVO XML BASEADO NA LISTA DE GERENTES
	List<Gerente> gerentes = new ArrayList<Gerente>();
	Gerente G1 = new Gerente("Otavio", 213144, 9199191, 1, "30-1-2005");
	if(G1.login(123)) {
		System.out.println("Gerente logado");
		gerentes.add(G1);
	} else System.out.println("senha errada");
	
	Gerente G2 = new Gerente("Lígia", 39289832, 83172, 2, "07-5-20012");
	if(G2.login(123)) {
		System.out.println("Gerente logado");
		gerentes.add(G2);
	} else System.out.println("senha errada");
	
	if (XMLManip.gravarXMLGerente(gerentes)) {
		System.out.println("XML criado com sucesso");
	}
	
	
	List<Gerente> listGer = XMLManip.LerXMLGerente();
	System.out.println("-----------------------------------------");
	
	for (Iterator iterator = listGer.iterator(); iterator.hasNext();) {
		Gerente gerente = (Gerente) iterator.next();
		System.out.println(gerente.toString());
	}
	System.out.println("-----------------------------------------");
	
	
	//Parte CSV --- Listar os funcionarios da empresa
	CSVManip.lerCSV();
	
	//funcionarios logados
	List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	Funcionario F1 = new Funcionario("Alfonso", 123321, 52525252, 1, "22-2-2010");
	if(F1.login(321)) {
		System.out.println("Funcionario Logado");
		listaFuncionario.add(F1);
	} else System.out.println("senha errada");
	Funcionario F2 = new Funcionario("Robson", 3131313, 41322131, 2, "30-7-2015");
	if(F1.login(321)) {
		System.out.println("Funcionario Logado");
		listaFuncionario.add(F2);
	} else System.out.println("senha errada");

	
	// Parte JSON
	List<Comprador> lista = new ArrayList<Comprador>();
	Comprador C1 = new Comprador("Leonardo", 123123, 707070, 78, true);
	lista.add(C1);
	Comprador C2 = new Comprador("Rodrigo", 777777, 9876512, 93, false);
	lista.add(C2);

	//criar json da list 
	if(JSONManip.gravarJsonCompradores(lista)) {
		System.out.println("Arquivo JSON Criado Com Sucesso");
	} else System.out.println("Erro ao criar o JSON");
	
	//Monta Json com base no arquivo listTodosCompradores 
	List<Comprador> listClienteJson = JSONManip.lerJSON();
	System.out.println("-----------------------------------------");
	for (Iterator<Comprador> iterator = listClienteJson.iterator(); iterator.hasNext();) {
		Comprador comprador = (Comprador) iterator.next();
		System.out.println(comprador.toString());
	}
	System.out.println("-----------------------------------------");
	
	
	//estoque
	Estoque es = new Estoque();
	es.criaProduto(1, "Playstation 2", categoria.VIDEOGAME, 7, 789.35f);
	es.criaProduto(2, "Fogão", categoria.ELETRODOMESTICO, 2, 999.99f);
	es.criaProduto(3, "Samsung Galaxy", categoria.CELULARES, 9, 2500);
	
	
	//primeira compra 
	Compra compra1 = new Compra();
	if (compra1.RealizarVenda(C1, F1, es, 0, 3)) {
		System.out.println("\n Venda Realizada com Sucesso!");
	} else System.out.println("\n Não possuimos produtos suficientes no estoque!");
	
	//segunda compra	
	if (compra1.RealizarVenda(C2, F1, es, 1, 2)) {
		System.out.println("\n Venda Realizada com Sucesso!");
	} else System.out.println("\n Não possuimos produtos suficientes no estoque!");
	
	
	System.out.println(es);	

	
	}
}
