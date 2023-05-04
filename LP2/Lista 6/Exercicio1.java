package Lista6;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String cidade = "";

		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		
		Scanner sc =  new Scanner (System.in);
		
		do
		{
			System.out.println("Digite o nome da cidade: ");
			cidade = sc.nextLine();
			if(!cidade.isBlank())
			mapa.put(cidade, cidade.length());
			
		}
		while (! cidade.isBlank());
		
		for (String valor: mapa.keySet())
			System.out.println(valor + " - " + mapa.get(valor));
		
		sc.close();
	}

}
