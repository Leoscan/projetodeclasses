package projetoClasses;

public class Compra {

	private String dataDaCompra;
	private float valor;
	private Funcionario Funcionario;
	private Comprador Comprador;
	//private Estoque Estoque
	
	
	
	
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
