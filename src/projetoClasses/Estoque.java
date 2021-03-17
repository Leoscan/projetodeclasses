package projetoClasses;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;



public final class Estoque {
	
	private List<Produto> lprod = new ArrayList<Produto>();
	
	private List<Integer> quant = new ArrayList<Integer>();
	
	public boolean criaProduto(int codProd, String nome, categoria categoria, int quantidade, float preco) {
		Produto p = new Produto(codProd, nome, categoria,preco);
		quant.add(quantidade);
		return lprod.add(p);		
	}
	
	public Produto destroiProduto(int codProd) {		
		quant.remove(codProd);
		return lprod.remove(codProd);
		}
        
	public boolean RemoveEstoque(int quantidade, int indexProd) { 
		int aux = quant.get(indexProd) - quantidade;
		if(aux >= 0) {
			quant.set(indexProd, aux);
			return true;
		} else {
			return false;
		}
			
		
	}
	
	public Produto getProduto(int codProd){
		return lprod.get(codProd);
	}
	
	public String TransformJson() {
		Gson gson = new Gson();
		String Jsonn = gson.toJson(lprod);
		return Jsonn;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		int x = 1;
		builder.append("\n Estoque:");
		for (Produto produto : lprod) {			
			builder.append(produto.toString());
		}		
		for (Integer integer : quant) {
			builder.append("\n Quantidade em estoque do produto "+x+": ");
			builder.append(integer);
			x++;
		}
		return builder.toString();
	}

}
