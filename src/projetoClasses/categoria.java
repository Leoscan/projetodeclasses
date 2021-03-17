package projetoClasses;

public enum categoria {
		
		VIDEOGAME("Video Game"),
		ELETRODOMESTICO("Eletrodomestico"),
		CELULARES("Celulares");
		
		private String descricao;
		
		categoria(String descricao) {
			this.descricao = descricao;
		}
		public String getDescricao() { return descricao; }

	}
