import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("hola mundo" );
        System.out.println("Este es mi primer proyecto en el nuevo computador");

        int num1 = 0;
        int num2 = 0;

        System.out.println("Selecciona una operacion");
    
        System.out.println("\tSelecciona una operacion");
        System.out.print("Escoga una opcion para la operacion: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n\tDigite la seleccion:  ");
        int opc = lectura.nextInt();

        System.out.print("Ingrese primer numero: ");
        num1 = lectura.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = lectura.nextInt();

        switch (opc) {
            case 1:
                System.out.println(suma(num1, num2));
                break;
            case 2:
                System.out.println(resta(num1, num2));
                break;
            case 3:
                System.out.println(multiplicacion(num1, num2));
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }

        System.out.println("fin del programa \t FIn");


    }

    public static int suma(int num1, int num2){
        return(num1+num2);
    }

    public static int resta(int num1, int num2){
        return (num1-num2);
    }

    public static int multiplicacion(int num1, int num2){
        return (num1*num2);
    }


    
}