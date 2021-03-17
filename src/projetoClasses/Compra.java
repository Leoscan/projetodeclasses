package projetoClasses;

public class Compra {

	private String dataDaCompra;
	private float valor;
	private Funcionario Funcionario;
	private Comprador Comprador;
	
	
	public String getDataDaCompra() {
		return dataDaCompra;
	}
	public void setDataDaCompra(String dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Funcionario getFuncionario() {
		return Funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		Funcionario = funcionario;
	}
	public Comprador getComprador() {
		return Comprador;
	}
	public void setComprador(Comprador comprador) {
		Comprador = comprador;
	}
	
	
	
	public boolean RealizarVenda(Comprador com, Funcionario fn, Estoque es, int indexProd ,int quantidade ) {
		if(es.RemoveEstoque(quantidade, indexProd)) {
			Compra com1 = new Compra();
			com1.setDataDaCompra("10-02-2021");
			com1.setValor(StaCalculaValorProduto.calcValorProd(es.getProduto(indexProd), quantidade));
			com1.setComprador(com);
			com1.setFuncionario(fn);
		
			NotaFiscal nf1 = new NotaFiscal();
			nf1.setIdentificador(1);
			nf1.GerarNota(com1);
			return true;
		} else return false;
		
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Informações da Nota:");
		builder.append("\n \n Data Da Compra:");
		builder.append(dataDaCompra);
		builder.append(",\n Valor:");
		builder.append(valor);
		builder.append(",\n \n Funcionario=");
		builder.append(Funcionario);
		builder.append(",\n \n Comprador=");
		builder.append(Comprador);
		return builder.toString();
	}
	
	
	
}
