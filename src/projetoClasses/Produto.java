package projetoClasses;

public class Produto {
	private int codProd;
	private String nome;
	private String categoria;
	
		
	public Produto(int codProd, String nome, String categoria) {
		setCodProd(codProd);
		setNome(nome);
		setCategoria(categoria);		
	}
	
	public int getCodProd() {
		return codProd;
	}
	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n codProd=");
		builder.append(codProd);
		builder.append(",\n Nome=");
		builder.append(nome);
		builder.append(",\n Categoria=");
		builder.append(categoria);
		return builder.toString();
	}
	
	
}
