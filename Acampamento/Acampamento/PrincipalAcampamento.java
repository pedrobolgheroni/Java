package Acampamento;

public class PrincipalAcampamento {

	public static void main(String[] args) {
		
		ExemploAcampamento novoObj = new ExemploAcampamento();
		
		novoObj.idade = 22;
		novoObj.nome = "Rafael Santos";
		
		System.out.println("Imprimir dados inicialixados ");
		novoObj.imprimir();
		novoObj.separarGrupo();
		
		System.out.println();
		System.out.println("Imprimindo os dados ap�s a execu��o do m�todo separarGrupo ");
		novoObj.imprimir();
	}

}
