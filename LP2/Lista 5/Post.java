package lista5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Post implements Comparable<Post>{
	private LocalDateTime dataHorario;
	private String textoPost;
	
	public Post() {
		this.dataHorario = LocalDateTime.now();
		this.textoPost = "";
	}
	
	public Post(Integer ano, Integer mes, Integer dia, Integer hora, Integer minuto, Integer segundo, String textoPost) {
		this.dataHorario = LocalDateTime.of(ano, mes , dia, hora, minuto, segundo);
		this.textoPost = textoPost;
	}

	public LocalDateTime getDataHorario() {
		return dataHorario;
	}

	public void setDataHorario(LocalDateTime dataHorario) {
		this.dataHorario = dataHorario;
	}

	public String getTextoPost() {
		return textoPost;
	}

	public void setTextoPost(String textoPost) {
		this.textoPost = textoPost;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHorario == null) ? 0 : dataHorario.hashCode());
		result = prime * result + ((textoPost == null) ? 0 : textoPost.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Post other = (Post) obj;
		if (dataHorario == null) {
			if (other.dataHorario != null) {
				return false;
			}
		} else if (!dataHorario.equals(other.dataHorario)) {
			return false;
		}
		if (textoPost == null) {
			if (other.textoPost != null) {
				return false;
			}
		} else if (!textoPost.equals(other.textoPost)) {
			return false;
		}
		return true;
	}

	public String toString() {
		return "Post [dataHorario=" + dataHorario + ", textoPost=" + textoPost + "]";
	}

	@Override
	public int compareTo(Post o) {
		return this.dataHorario.compareTo(o.getDataHorario());
	}
}
