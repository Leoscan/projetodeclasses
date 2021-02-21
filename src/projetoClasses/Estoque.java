package projetoClasses;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private List<Produto> lprod = new ArrayList<Produto>();
	private List<Integer> quant = new ArrayList<Integer>();
	
	public boolean criaProduto(int codProd, String nome, String categoria, int quantidade) {
		Produto p = new Produto(codProd, nome, categoria);
		quant.add(quantidade);
		return lprod.add(p);		
	}
	
	public Produto destroiProduto(int codProd) {		
		quant.remove(codProd);
		return lprod.remove(codProd);		
	
	}
	public Integer RemoveEstoque(int quantidade, int indexProd) { 
		int aux = quant.get(indexProd) - quantidade;
		return quant.set(indexProd, aux);
	
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Estoque:");
		for (Produto produto : lprod) {			
			builder.append(produto.toString());
		}
		int x = 1; 
		for (Integer integer : quant) {
			
			builder.append("\n Quantidade em estoque do produto "+x+": ");
			builder.append(integer);
			x++;
		
	}
		return builder.toString();
	}
	
	
}
