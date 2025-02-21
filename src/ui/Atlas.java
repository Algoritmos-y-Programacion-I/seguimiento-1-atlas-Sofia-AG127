/*
* Analisis
* Descripcion del programa:
* Entradas: Nombre, edad, numero de documento, ciudad de la que viaja, noches que se queda, medio de transporte, 
* Salidas: Total del plan (Precio del trayecto y precio de la estadía)
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
            //final double COSTO_TRAYECTO_BUS = 80000;
    final double COSTO_NOCHE = 150000;
    final double ATLAS_SERVICIO = 0.1;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre, ciudadOrigen;
        int edad, documento, noches, transporte;
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();
        System.out.println("Bienvenido " + nombre + "!");

        System.out.println("Cual es su edad?");
        edad = escaner.nextInt();

        if(edad >= 18){
            System.out.println("Por favor escriba su número de cedula:");
        }
        else{
            System.out.println("Por favor escriba su número de tarjeta de identidad:");
        }
        documento = escaner.nextInt();

        System.out.println("Desde que ciudad se comunica?");
        ciudadOrigen = escaner.nextLine();

        System.out.println("Muchas gracias por escoger EVENTOS ATLAS. Cuantas noches se hospedará?");
        noches = escaner.nextInt();

        System.out.println("Selecciona un medio de transporte. Elige 1 para Avion y 2 para Bus");
        transporte = escaner.nextInt();


        double totalTransporte, totalEstadía;
        totalTransporte = calcularTotalTransporte();
        totalEstadía = calcularTotalEstadía();
       
         // aqui podrian faltar parametros
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return 0; // Completar operacion
    }

    public double calcularTotalEstadía(){


    }




	

	
}