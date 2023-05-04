package Lista6;

import java.util.HashMap;
import java.util.HashSet;

public class Exemplo {
	public static void main(String[]args) {
		
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		
		mapa.put("Pedro", 17);
		mapa.put("Negrão", 19);
		mapa.put("KauKau", 18);
		
		// para recuperar todas as chaves
		for (String valor: mapa.keySet())
			System.out.println(valor + " - " + mapa.get(valor));
		
		//mapa.get("Pedro");
		
		
		
	}

}
