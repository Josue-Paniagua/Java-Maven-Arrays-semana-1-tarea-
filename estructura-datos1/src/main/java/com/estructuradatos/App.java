package com.estructuradatos;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo desde java");

			int x = 5;
			int z = 4;
			int resultado = x*z;
			
			System.out.print("EL resultado de la multiplicacion es :" + resultado);
	
			
			//ENUNCIADO 4: INVESTIGACION arreglos en java 
				//Los arreglos en Java son un tipo de contenedor indexado y de tamaño fijo, donde se pueden almacenar múltiples elementos de forma secuencial, siempre que sean del mismo tipo.
			
			//4.1 ¿Cómo se declara un arreglo en Java?
			
				//Para declara un arreglo, se tiene que indicar el tipo de dato de los elementos que contendrá el arreglo, y el nombre del arreglo
			  
			char [] letras = {'a', 'b' ,'c'} ;
			int [] numeros = new int [7];
			
			
			//---------------------------------------
			
			//4.2 Métodos y utilidades principales para arreglos
			//_____
			
			//1. Array. tostring,  es una operación de programación que convierte un array (arreglo/lista de datos) en una única cadena de texto (string)
			//este método convierte el contenido en una cadena de texto legible.
			
			System.out.print("\n" + Arrays.toString(letras));
			
			//---------
			
			//2.Arrays.binarySearch:  busca eficientemente un valor en un array ordenado utilizando el algoritmo de búsqueda binaria, devolviendo el índice del elemento
			int posicion = Arrays.binarySearch(letras, 'b');
			System.out.print("\nLa letra b esta en el lugar :" + posicion); 
			
			//-------
			
			//3. Lenght: Esta  devuelve el número total de elementos (un entero) que el arreglo puede contener
			
			System.out.print("\n La cantidad de espacioes de este array es de: " + numeros.length);
			
			//-------
		
			//4. Array fil:  Asigna un valor específico a cada posición del arreglo.
			
			Arrays.fill(numeros, 23);
			System.out.println("\n"+Arrays.toString(numeros));
			
			
			//5. Array copy of: es un método de java.util.Arrays utilizado para crear una nueva matriz copiando elementos de una existente, útil para cambiar el tamaño o duplicar arrays. 
			char[] mas = Arrays.copyOf(letras, 8);
			System.out.println("\n" +Arrays.toString(mas));
			
			//------------------------------------
			
			
			
			//4.3 ¿Cómo se recorren los arreglos en Java?
				//1. For tradicional badado en indice: es una estructura de control de flujo utilizada para repetir un bloque de código un número específico de veces.
			char[] letras2 = {'z','a','j','t','ñ','q'};
			for (int i = 0 ; i < letras2.length; i++) {
				
				System.out.println("Posicio  " + i + ": " + letras2[i]);   
				
			}
			
			//2. --------------------
				//FOR-EACH:  es una estructura de control utilizada para recorrer secuencialmente elementos en arrays o colecciones dejando una lista mas ordenada en mi opinion.
			String[] marcas_carros = {"TOYOTA", "MAZDA","NISSAN","FORD"};
			System.out.print("Las marcas de carros mas usadas en Guatemala son: ");
			
			for(String marca : marcas_carros)
				System.out.print("\n---" + marca);
			
			//3. -------
				//STREAMS: es una forma funcional y concisa de iterar sobre un array, convirtiéndolo primero en un flujo de datos (Stream) para aplicar una acción a cada elemento.
			
			System.out.print("\n Marca con nombrs largos:");
			
	         Arrays.stream(marcas_carros)
	         .filter(m -> m.length() > 5 )
	         .map(String::toLowerCase)   //esto me sirve para poner tdas las palabras del array en minusculas    
	         .forEach(System.out::println);
	         
	         //-------------------------------
	         
	         //4.4 Diferencias entre arreglos y ArrayList en Java
	         //--La direfencia principal entre un Arreglos y Arraylist es que los arrays tienen un tamaño fijo en pocas palabras nosotrso sabesmos el tamaño de este
	         
	         //--mientas que el ArrayList estas ofrecen una mayor flexibilidad por asi decirlo permiten almacnera objetos y estas sirven mayormente cuando se necesita agregar o quitar datos.
	         
	         //--Otras diferencias es que los arrays peede almacenar tanto tipos primitivos (int, double, char) como objetos. Es muy directo y eficiente en memoria.
	         
			//--Arraylsit solo puede almacenar objetos. No se puede tener un ArrayList tipo int. Para solucionar esto, Java usa Autoboxing para convertir primitivos en sus clases envolventes (Integer, Double, etc.), lo que consume un poco más de memoria.
	         
	         
	         //--ejemplo ----
	         
	         //_------ Punto 1 Tamaño fijo vs tamaño dinámico
	         
	         int [] Arreglo = new int [5];
	         
	         //___-----------------------------
	         
	         
	        ArrayList<Integer> lista =new ArrayList<>();
	        lista.add(20);
	        lista.add(40);
	        
	        //punto 2-------Tipos primitivos vs clases envolventes

	        int [] nummbers = {1,2,3};
	       //-----
	        //Los arrayList no se puede usar primitivos 
	        
	        ArrayList<Integer> lista2 = new ArrayList<>();
	        
	        //PUNTO 3 ---Métodos disponibles (add, remove, size, etc.)
	        //Por lo que investigue los arrays tienen pcoos metodos propios esntre ellso estan unos que ya vimos antes 
	        		Arrays.sort(nummbers);
	        		System.out.print(nummbers.length);
	        //-----			
	        		
	        		ArrayList<String> nombre = new ArrayList<>();
	        		nombre.add("josue");//AGRGAR
	        		nombre.remove("josue");//BORRAR
	        		nombre.get(0);// para obetner algun elemneto de este 
	        		nombre.set(0, "David"); //para modificar

	        	//PUNTO 4--- RENDIMIENTO
	        	//Areglos: son rapidos, consumen memos memoria y no tiene sobrecarga de metodos o objetos.
	        	//ArrayList: son mas lentos, ocupan mas ato.memoria a aprte como tiene la desventaja por asi decirlo en rendimiento
	        		
	        	//PUNTO 5 ---- ¿Cuándo usar cada uno?
	        	//Arelgos: cuando se sabe cuantos elementos llevara este aarray, si tenemos memoria limitada igual es bueno tener previsto que vamos a ahcer con ella y con lo que contenga.
	        	//ArrayList: Cuando no se sabe cuantos objetos o datos vamos a añadir o recibir, cuando se necesita un mecanismo de crear,borrar o edita.
	        	// En resuemn los arreglos son mas simples y rapidos pero tiene tamaño fijo y el arraylist es mas felxible.
	        		
	        	// punto 1.2 OFUSCACION 	
	        		// La ofuscación en Java es una técnica de seguridad que transforma el código fuente o más comúnmente el bytecode Esto protege la propiedad intelectual, dificulta la ingeniería inversa y la manipulación del software
	        		//Es el proceso de transformar el código compilado para hacerlo difícil de leer o entender sin cambiar su funcionamiento Se utiliza para proteger la lógica del programa.
	        		
	        		//Ejemplo super basico seria:
	        		
	        		//LO NORMAL
	        		int t = 5;
	        		int y = 4;
	        		int resultadof = t * y;
	        		System.out.print("EL resultado de la multiplicacion es :" + resultadof);
	        		//con ofuscacion se ve algo como
	        		int a1 = 5;
	        		int b2 = 4;
	        		int c3 = a1 * b2;
	        		System.out.print("R:" + c3);
	        		
	        		// otro ejemplo seria System.out.print("R:"+((5*4))); aportado por fuentes mas expertas
 

	     
	}
	

}
