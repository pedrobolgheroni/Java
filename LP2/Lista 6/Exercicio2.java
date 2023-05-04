package Lista6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercicio2 {
	public static void main(String[] args) {
	
		String frase;
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> palavras = new HashSet<String>();
					
		System.out.println("Digite uma frase: ");
		
		frase = sc.nextLine();
				
		StringTokenizer stk = new StringTokenizer(frase);
			
		while( stk.hasMoreElements() ) // pega os proximos elementos
			palavras.add( stk.nextToken() ); // pega o elemento que está apontando
		
		for( String p: palavras )		
			System.out.println( p );
		
		System.out.println("Número de palavras não repetidas: " + palavras.size() ); // size - tamanho do que sobrou no vetor	
	
		sc.close();
	}
}
