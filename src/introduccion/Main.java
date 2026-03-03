package introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	// Valores globales
    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in); //agregado como estatico
    public static void main(String[] args) {

        
        int opcion;
         
        System.out.println("Bienvenido al sistema de gestión de estudiantes.");
        
        // cambiamos el main usando un do-while, para simplificar la opcion de salida del programa 
        do {
        	mostrarMenú(); // metodo que contiene el menu
        	
            opcion = leerEntero(scanner,""); // se creo un metodo para que la entra
            
            // Utilizamos un switch ya que es mas ordenado y fácil de entender 
            switch (opcion) {

            case 1: 
            	agregarEstudiante();
                break;
                
            case 2:
            	mostrarLista();
            	break;
            	
            case 3:
            	calcularPromedioEstudiante();
                break;

            case 4:
               mostrarCalificacionAlta();
                break;

            case 5:
                System.out.println("Saliendo del sistema...");
                break;

            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
            }
        }while (opcion != 5);

        scanner.close();
    }
    
    //metodo que valida datos tipo double
    public static double leerNumero(Scanner scanner, String mensaje) {
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();
            try {
                numero = Double.parseDouble(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Ingresa un numero.");
            }
        }
        return numero;
    }
    
    // Metodo que muestra el menú
    public static void mostrarMenú() {
        System.out.println("\n1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio de calificaciones");
        System.out.println("4. Mostrar estudiante con la calificación más alta");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    //Metodo de la primera opcion del menu, permite ingresar estudiantes y notas
    public static void agregarEstudiante() {
    	System.out.print("Ingrese el nombre del estudiante: ");
    	String nombre = scanner.nextLine();

    	double calificacion = rangoCalificaciones(scanner, "Ingrese la calificación del estudiante: ");

    	estudiantes.add(nombre);
    	calificaciones.add(calificacion);

    	System.out.println("Estudiante agregado correctamente.");
    }
    
    // Metodo de la segunda opcion del menu, muestra la lista de estudiantes
    public static void mostrarLista() {
    	 if (estudiantes.isEmpty()) {
             System.out.println("No hay estudiantes registrados.");
         } else {
             System.out.println("\nLista de estudiantes:");
             for (int i = 0; i < estudiantes.size(); i++) {
                 System.out.println(estudiantes.get(i) +
                         " - Calificación: " + calificaciones.get(i));
             }
         }
    }
    
    // Metodo de la tercera opcion del menu, muestra los promedios de los estudiantes
    public static void calcularPromedioEstudiante() {
    	if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
        } else {
            double suma = 0;
            
            for (double cal : calificaciones) { //cambio la variable por que al agregar el switch cambia el alcance
                suma += cal;
            }
            
            double promedio = suma / calificaciones.size();
            System.out.println("El promedio de calificaciones es: " + promedio);
        }
    }
    
    //Metodo de la cuarta opcion del menu, muestra  la calificacion más alta y el estudiante
    public static void mostrarCalificacionAlta() {
    	 if (calificaciones.isEmpty()) {
             System.out.println("No hay calificaciones registradas.");
         } else {

             double maxCalificacion = calificaciones.get(0);
             String estudianteMax = estudiantes.get(0);

             for (int i = 1; i < calificaciones.size(); i++) {
                 if (calificaciones.get(i) > maxCalificacion) {
                     maxCalificacion = calificaciones.get(i);
                     estudianteMax = estudiantes.get(i);
                 }
             }

             System.out.println("El estudiante con la calificación más alta es: "
                     + estudianteMax + " con " + maxCalificacion);
         }
    	 
    }
    
    // Metodo que valida que los numeros sean enteros, se usa para validar las entradas en el menu 
    public static int leerEntero(Scanner scanner, String mensaje) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                valido = true; 
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Ingresa un número.");
            }
        }
        return numero;
    }
    
    // Metodo que valida que la calificacion sea de 0 a 100, y se utiliza cuando se van a agregar calificaciones
    public static double rangoCalificaciones(Scanner scanner, String mensaje) {
        double numero; 

        do {
            numero = leerNumero(scanner, mensaje);
            if (numero < 0 || numero > 100) {
                System.out.println("La nota debe ser de 0.00 a 100.00 ");
            }
        } while (numero < 0 || numero > 100);

        return numero;
    }
    
}