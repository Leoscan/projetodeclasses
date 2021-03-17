package projetoClasses;

public class Produto {
	private int codProd;
	private String nome;
	private categoria categoria;
	private float preco;
	
		
	public Produto(int codProd, String nome, categoria categoria, float preco) {
		setCodProd(codProd);
		setNome(nome);
		setCategoria(categoria);		
		setPreco(preco);		
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
	public categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\n Nome:");
		builder.append(nome);
		builder.append(",\n Categoria:");
		builder.append(categoria);
		builder.append(",\n Preço:");
		builder.append(preco);
		return builder.toString();
	}
	
	
}
