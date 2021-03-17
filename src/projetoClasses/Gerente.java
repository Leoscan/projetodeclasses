package projetoClasses;

public class Gerente extends Pessoa implements IAutenticavel{
	private int NCadastroG;
	private String DataAdmissao;
	final int senha = 123;
	
	public Gerente(String nome, int cpf, int telefone, int nCadastroG, String dataAdmissao) {
		super(nome, cpf, telefone);
		setNCadastroG(nCadastroG);
		setDataAdmissao(dataAdmissao);
	}
	public Gerente() {
		
	}
	
	public int getNCadastroG() {
		return NCadastroG;
	}
	public void setNCadastroG(int nCadastroG) {
		NCadastroG = nCadastroG;
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
		builder.append("Gerente=");
		builder.append(NCadastroG);
		builder.append(",\n DataAdmissao=");
		builder.append(DataAdmissao);
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	

}
