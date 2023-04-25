package lista5;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {

	public static void main(String[] args) {
		
//		Post p1 = new Post(2023, 04, 12, 14, 22, 30, "Olá, teste");
//		Post p2 = new Post(2022, 12, 25, 10, 06, 19, "Feliz Natal");
//		Post p3 = new Post(2024, 10, 20, 9, 55, 19, "Bom dia!");
//		
//		ArrayList<Post> lista = new ArrayList<Post>();
////		
////		lista.add(p1);
////		lista.add(p2);
////		
////		Collections.sort(lista);
//		
//		for (Post p: lista)
//			System.out.println(p.getTextoPost() + " - " + p.getDataHorario());
		
		Usuario u1 = new Usuario("Pedro");
		Usuario u2 = new Usuario("João");  
		Usuario u3 = new Usuario("Matheus");  
		
		ArrayList<Usuario> listaUsu = new ArrayList<Usuario>();
		
		listaUsu.add(u1);
		listaUsu.add(u2);
		listaUsu.add(u3);
		
//		u1.getLista().add(p1);
//		u1.getLista().add(p2);
//		u1.getLista().add(p3);
		
//		Collections.sort(u1.getLista(), Collections.reverseOrder());
//		
//		for (Post p: u1.getLista())
//			System.out.println(p);
//		
		Collections.sort(listaUsu, new ComparadorNome());
		
		for (Usuario u: listaUsu)
			System.out.println(u.getNome());

	}

}
