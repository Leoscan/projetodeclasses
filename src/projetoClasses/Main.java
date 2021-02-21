package projetoClasses;


public class Main {

	public static void main(String[] args) {

	Funcionario F1 = new Funcionario("Alfonso", 123321, 52525252, 1, "22-2-2010");
	Comprador C1 = new Comprador("Leonardo", 123123, 707070, 78, true);
	Comprador C2 = new Comprador("Rodrigo", 777777, 9876512, 93, false);
	
	//estoque
	Estoque es = new Estoque();
	es.criaProduto(1, "Playstation 2", "Video Games", 7);
	es.criaProduto(2, "Fogão", "Eletrodomestico", 2);
	es.criaProduto(3, "Samsung Galaxy", "Celulares", 9);
	System.out.println(es);
	
	//só consegui fazer remover por index do array
	es.destroiProduto(0); 
	System.out.println(es);
	
	
	//primeira compra
	Compra com1 = new Compra();
	com1.setDataDaCompra("10-02-2021");
	com1.setValor(5000);
	com1.setComprador(C1);
	com1.setFuncionario(F1);

	NotaFiscal nf1 = new NotaFiscal();
	nf1.setIdentificador(1);
	nf1.GerarNota(com1);
	
	//segunda compra	
	Compra com2 = new Compra();
	com2.setDataDaCompra("19-08-2020");
	com2.setValor(7800.38f);
	com2.setComprador(C2);
	com2.setFuncionario(F1);
	
	NotaFiscal nf2 = new NotaFiscal();
	nf2.setIdentificador(2);
	nf2.GerarNota(com2);

	
	//remove algum produto do estoque (quantidade, index produto)
	es.RemoveEstoque(2, 0);
	System.out.println(es);
	
	
	}
}
