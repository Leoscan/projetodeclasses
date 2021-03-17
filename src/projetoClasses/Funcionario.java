package projetoClasses;

public class Funcionario extends Pessoa implements IAutenticavel {
	private int NCadastroF;
	private String DataAdmissao;
	final int senha = 321;
	
	public Funcionario(String nome, int cpf, int telefone, int NCadastroF, String DataAdmissao) {
		super(nome, cpf, telefone);
		setNCadastroF(NCadastroF);
		setDataAdmissao(DataAdmissao);
	}
	public Funcionario() {
	}
	
	public int getNCadastroF() {
		return NCadastroF;
	}
	public void setNCadastroF(int nCadastroF) {
			NCadastroF = nCadastroF;
	}
	public String getDataAdmissao() {
		return DataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		DataAdmissao = dataAdmissao;
	}		
	
	public boolean login(int PSenha) {
		if(PSenha == senha) {
		return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Cadastro do Funcionário:");
		builder.append(NCadastroF);
		builder.append(",\n Data de Admissão:");
		builder.append(DataAdmissao);
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
