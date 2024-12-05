package diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class diccionario {

	public static void main(String[] args) {
		/*
		 * Instrucciones:

Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utiliza un objeto HashMap para almacenar los pares de palabras.
Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
Si la palabra escrita no se encuentra en el diccionario debe imprimir un mensaje por consola, diciendo que: “La palabra no se encuentra en el diccionario.”.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
gato
cat
Entradas: 
Salida:
Siempre y cuando la palabra se encuentre en el diccionario
Pruébalo con diferentes palabras.
Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub y adjunta el link.
Sugerencias:

Puedes escribir tu código directamente en tu clase Main.
Para ayudarte puedes desarrollar un algoritmo y el pseudocódigo.
		 * */
	    HashMap<String, String> transl = new HashMap<String, String>(); 

	    transl.put("hola", "hello"); 
	    transl.put("mamá", "mom");
	    transl.put("papá", "dad"); 
	    transl.put("tío", "auncle");
	    transl.put("tía", "aunt");
	    transl.put("hijo", "son");
	    transl.put("hija", "daughter");
	    transl.put("mi", "my");
	    transl.put("es", "is");
	    transl.put("sol", "son");
	    transl.put("luna", "moon");
	    transl.put("adiós", "goodbye");
	    transl.put("taza", "cup");
	    transl.put("carro", "car");
	    transl.put("casa", "house");
	    transl.put("hermano", "brother");
	    transl.put("hermana", "sister");
	    transl.put("escuela", "school");
	    transl.put("clase", "class");
	    transl.put("zapato", "shoe");
	    transl.put("manzana", "apple");
	    transl.put("árbol", "tree");
	   
		Scanner s = new Scanner(System.in); 
		
	    String spanish = ""; 
	    do {
	      System.out.print("Escribe una palabra en español y te la traduciré al inglés: "); //out
	      spanish = s.nextLine(); 
	 
	    
	      if (!spanish.equals("salir")) { 
	        if (transl.containsKey(spanish)) { 
	          System.out.println("La traducción de " + spanish);
	          System.out.print(" es " + transl.get(spanish)); 
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿Cuál es la traducción de " + spanish + "?: ");
	          String english = s.nextLine();
	          transl.put(spanish, english); 
	          System.out.println("Gracias por enseñarme nuevas palabras en inglés");
	        }
	      }
	    } while (!spanish.equals("salir")); 
	     s.close();
				
	}
}
