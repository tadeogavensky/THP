package TP1;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	
    	int num1,num2,num3;
  
    	int opcion = 1;
    	
    	System.out.println("Ingrese el primer número: ");
    	num1 = scanner.nextInt();
    	System.out.println("Ingrese el segundo número: ");
    	num2 = scanner.nextInt();
    	System.out.println("Ingrese el tercer número: ");
    	num3 = scanner.nextInt();
    	
    	System.out.println("Elije una opcion");
    	opcion = scanner.nextInt();
    	switch (opcion) {
		case 1: 
			if (num1 > num3 && num1 > num2) {
				System.out.println("El número mayor es el num1: " + num1);
	    		
	    	}else if(num2>num3) {
	    		System.out.println("El número mayor es el num2: "+ num2);
	    	}else {
	    		System.out.println("El número mayor es el num3: "+ num3);
	    	}
		
		case 2:
			
			if (num1 > num3 && num1 > num2) {
				System.out.println("El número mayor es el num1: " + num1);
	    		
	    	}else if(num2>num3) {
	    		System.out.println("El número mayor es el num2: "+ num2);
	    	}else {
	    		System.out.println("El número mayor es el num3: "+ num3);
	    	}
	    	
		case 3:
			if(num1>num2 && num1>num3) {
	        	System.out.println("El número mayor es el num1: "+ num1);
	    		return;
	    	}
	    	if(num2>num1 && num2>num3) {
	        	System.out.println("El número mayor es el num2: "+ num2);
	    		return;
	    	}else if(num3>num1 && num3>num2){
	        	System.out.println("El número mayor es el num3: "+ num3);
	        	return;
	    	}else {
	        	System.out.println("Los números son iguales");
	            return;
	    	}
	    	
		case 4:
			int mayor = num1;
			
			if (num2 > mayor) {
				mayor = num2;
			} else if (num3 > mayor) {
				mayor = num3;
			}
			
			System.out.println("El número mayor es: " + mayor);
		default:
			if (num1 > num3 && num1 > num2) {
				System.out.println("El número mayor es el num1: " + num1);
	    		
	    	}else if(num2>num3) {
	    		System.out.println("El número mayor es el num2: "+ num2);
	    	}else {
	    		System.out.println("El número mayor es el num3: "+ num3);
	    	}
		}
    	
    
    	
    	
    	
	

    	
    	
    	
	}
	
}
