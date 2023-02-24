package Acampamento;

public class ExemploAcampamento {
	String nome;
	String equipe;
	int idade;
	
	public void imprimir() {
		System.out.println("Nome " +this.nome);
		System.out.println("Equipe " +this.equipe);
		System.out.println("Idade " +this.idade);
	}
	
	public void separarGrupo() {
		if ((this.idade >= 6) && (this.idade <= 10)) {
			this.equipe = "A"; }
		if ((this.idade >= 11) && (this.idade <= 20)) {
			this.equipe = "B"; }
		if (this.idade >= 21) {
			this.equipe = "C"; }
		
	}

}
