import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("hola mundo" );
        System.out.println("Este es mi primer proyecto en el nuevo computador");

        System.out.println("Selecciona una operacion");
    
        System.out.println("\tSelecciona una operacion");
        System.out.print("Escoga una opcion para la operacion: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n\nDigite la seleccion:  ");
        int opc = lectura.nextInt();

        switch (opc) {
            case 1:
                System.out.println("\tSuma");
                System.out.println("El resultado es: "+suma());
                break;
            case 2:
                System.out.println("\tResta");
                System.out.println("El resultado es: "+resta());
                break;
            case 3:
                System.out.println("\tMultiplicacion");
                System.out.println("El resultado es: "+multiplicacion());
                break;

            case 4:
                System.out.println("\tDivision");
                System.out.println("El resultado es:" + division());
            default:
                System.out.println("opcion incorrecta");
                break;
        }

        System.out.println("Fin del programa");


    }

    public static int suma(){
        int num1 = numero1();
        int num2 = numero2();
        return(num1+num2);
    }

    public static int resta(){
        int num1 = numero1();
        int num2 = numero2();
        return (num1-num2);
    }

    public static int multiplicacion(){
        int num1 = numero1();
        int num2 = numero2();
        return (num1*num2);
    }

    public static double division(){
        int num1 = numero1();
        int num2 = numero2();
        return (num1/num2);
    }

    public static int numero1(){
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        int num1 = lectura.nextInt();

        return num1;
    }

    public static int numero2(){
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese el segundo numero: ");
        int num2 = lectura.nextInt();
        return num2;
    }



    
}