//https://github.com/Assuk81/menuSubmenu.git
//Juan Carlos Corredor Sánchez

package claseDia15;

import java.util.Scanner;


public class menu {
	static boolean continuar = true;
	static int opcion2;
	
	public static void mostrarSubmenu() {
		switch (opcion2) {
		case 1:
			System.out.println("Abrir otro programa");
			break;
		case 2:
			System.out.println("Cerrar todo");
			break;
		case 3:
			System.out.println("Guardar tu progreso");
			break;
		case 4:
			System.out.println("Submenú");
			mostrarSubmenu();
			break;
		case 5:
			System.out.println("Salir");
			//break;
			continuar=false;//saca del bucle poniendo falso
			
		default://default quiere decir SI NO
			System.out.println("Error, introduce una opción del 1 al 5");
		}
		
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		int opcion;
		int opcion2;
		do {
			
			System.out.println("Elige una opción: ");
			System.out.println("1. Abrir programa");
			System.out.println("2. Cerrar programa");
			System.out.println("3. Guardar");
			System.out.println("4. SubMenú");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			
//			if(opcion==1){
//				System.out.println("Abrir");
//			}
//			else if(opcion==2){
//				System.out.println("Cerrar");
//			}
//			else if(opcion==3){
//				System.out.println("Guardar");
//			}
//			else if(opcion==4){
//				System.out.println("Salir");
//				continuar = false;
//			}
			switch (opcion) {
			case 1:
				System.out.println("Abrir");
				break;
			case 2:
				System.out.println("Cerrar");
				break;
			case 3:
				System.out.println("Guardar");
				break;
			case 4:
				System.out.println("Submenú");
				mostrarSubmenu();
				break;
			case 5:
				System.out.println("Salir");
				//break;
				continuar=false;//saca del bucle poniendo falso
				
			default:
				System.out.println("Error, introduce una opción del 1 al 5");
			}
		}while (continuar==true);
		
		
		
	}

}
