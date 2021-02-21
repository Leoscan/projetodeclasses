package projetoClasses;

public class NotaFiscal {
	private int identificador;

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		if (identificador > 0){	
			this.identificador = identificador;
		}
	}

	public void GerarNota(Compra compra) {
		System.out.println(toString());
		System.out.println(compra.toString());
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Nota Fiscal");
		builder.append("\n Identificador Número:");
		builder.append(identificador);
		return builder.toString();
	}
	
	

}
