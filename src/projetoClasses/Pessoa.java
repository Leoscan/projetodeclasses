package projetoClasses;

public abstract class Pessoa {
	private String nome;
	private int cpf;
	private int telefone;
	
	
	public Pessoa(String nome, int cpf, int telefone) {
		super();
		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
	}
	public Pessoa() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		if(cpf > 0)
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		if(telefone > 0)
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Nome:");
		builder.append(nome);
		builder.append(",\n CPF:");
		builder.append(cpf);
		builder.append(",\n Telefone:");
		builder.append(telefone);
		return builder.toString();
	}
	
	
	
}
