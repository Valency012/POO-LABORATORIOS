import java.util.Scanner;

public class Laboratorio_01{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        boolean salir = false; 
        int a, b, resultado; 
        int opcion;
        do{
        System.out.println("Seleccine una opcion: "); 
        System.out.println("1. Sumar "); 
        System.out.println("2. Restar"); 
        System.out.println("3. Multiplicar"); 
        System.out.println("4. Dividir"); 
        System.out.println("5. Salir"); 
        System.out.println(">"); 
        opcion = sc.nextInt();
        

        switch(opcion){

            case 1: 
            System.out.println("Ingrese el primer numero: "); 
            a = sc.nextInt(); 
            System.out.println("Ingrese el segundo numero: "); 
            b = sc.nextInt(); 
            
            System.out.println("El resultado de la suma es: " + sumar(a , b)); 
            break; 

            case 2: 
            System.out.println("Ingrese el primer numero: "); 
            a = sc.nextInt(); 
            System.out.println("Ingrese el segundo numero: "); 
            b = sc.nextInt(); 
           
            System.out.println("El resultado de la resta es: " + restar(a , b));
            break; 

            case 3: 
            System.out.println("Ingrese el primer numero: "); 
            a = sc.nextInt(); 
            System.out.println("Ingrese el segundo numero: "); 
            b = sc.nextInt(); 
            
            System.out.println("El resultado de la multiplicacion es: " + multiplicar(a , b));
            break; 

            case 4: 
            System.out.println("Ingrese el primer numero: "); 
            a = sc.nextInt(); 
            System.out.println("Ingrese el segundo numero: "); 
            b = sc.nextInt(); 
            System.out.println("El resultado de la divison es: "+ dividir(a , b));
            break; 

            case 5:
                System.out.println("Saliendo del programa"); 
            break; 
        }
    }while(opcion != 5); 
    
}
public static int sumar(int a, int b){
        return  a + b; 
    }
    public static int restar(int a, int b){
        return  a - b; 
    }
    public static int multiplicar(int a, int b){
        return  a * b; 
    }
    public static int dividir(int a, int b){
        if(b != 0){
            int division = a / b; 
            System.out.println("El resultado de la division es: " + division);
        }else{
            System.out.println("No se puede realizar la division entre 0");
        }
        return division; 
    }

}