package projetoClasses;

public class Comprador extends Pessoa {
	private int NCadastroC;
	private boolean Fidelidade;
	
	
	public Comprador(String nome, int cpf, int telefone, int NCadastroC, boolean Fidelidade) {
		super(nome, cpf, telefone);
		setNCadastroC(NCadastroC);
		setFidelidade(Fidelidade);
		
	}
	public Comprador() {
		
	}
	
	
	public int getNCadastroC() {
		return NCadastroC;
	}
	public void setNCadastroC(int nCadastroC) {
		NCadastroC = nCadastroC;
	}
	public boolean isFidelidade() {
		return Fidelidade;
	}
	public void setFidelidade(boolean fidelidade) {
		Fidelidade = fidelidade;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Cadastro do Comprador:");
		builder.append(NCadastroC);
		builder.append(",\n Fidelidade:");
		builder.append(Fidelidade);
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	
}
