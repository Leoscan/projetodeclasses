package projetoClasses;

public class StaCalculaValorProduto {

	public static float calcValorProd(Produto P, int quantidade) {
		return P.getPreco()*quantidade;
	}
	
}
