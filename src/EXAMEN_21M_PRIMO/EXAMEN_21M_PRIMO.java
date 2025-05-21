package EXAMEN_21M_PRIMO;

import java.util.Scanner;

public class EXAMEN_21M_PRIMO {
	
	public static void main(String args[]) {
		
		Scanner ent = new Scanner(System.in);
		int numero =0;
		
		System.out.println("Buenos días Ceinmark, soy Carlos");
		
		System.out.println("Introduce un número para averiguar si es primo o no");
		numero = Integer.parseInt(ent.nextLine());
		
		
		System.out.println("El numero 4 no es primo"+ 
				"\nLos divisores del numero 4 son: 1,2, y 4");
		
	}
}
