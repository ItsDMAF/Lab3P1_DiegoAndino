
package lab3p1_diegoandino;

import java.util.Scanner;

public class Lab3P1_DiegoAndino {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int opcion;
        do{
            System.out.println("1 <- Diptongo");
            System.out.println("2 <- Sumatoria PI");
            System.out.println("3 <- Time Clock");
            System.out.println("4 <- Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    String palabra;
                    int contador = 0;
                    char caracter1, caracter2;

                    System.out.print("Ingrese una palabra: ");
                    palabra = leer.next();
                    
                    for (int i = 0; i < palabra.length(); i++) {
                        caracter1 = palabra.charAt(i);
                        switch(caracter1){
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                if ((i + 1) != palabra.length()){
                                    caracter2 = palabra.charAt(i+1);
                                }
                                else{
                                    caracter2 = 'x';
                                }
                                switch(caracter2){
                                    case 'a':
                                    case 'e':
                                    case 'i':
                                    case 'o':
                                    case 'u':
                                        contador++;
                                }
                        }
                    
                    }
                    if (contador <= 0)
                        System.out.println(palabra + " no es un diptongo");
                    else
                        System.out.println(palabra + "es un diptongo");
                    
                    break;
//------------------------------------------------------------------------------
                case 2:
                    double n, limite, numerador, denominador, sumatoria = 0, union, total;
                    System.out.print("Ingrese el limite: ");
                    limite = leer.nextDouble();
                    
                    if (limite >= 0){
                        System.out.println("Ingrese un limite valido, tiene que ser mayor que 0.");
                        
                        for(n = 0; n < limite; n++){
                            
                            numerador = Math.pow(-1, n);
                            denominador = 2 * n + 1;
                            union = numerador / denominador;
                            sumatoria = sumatoria + union;            
                        }
                        total = 4 * sumatoria;
                        System.out.println("La aproximacion de PI es: " + total);
                    }
                        
                    break;
//------------------------------------------------------------------------------
                case 3:
                    int tamaño, residuo ;
                    System.out.print("Ingrese el tamaño: ");
                    tamaño = leer.nextInt();
                    
                    residuo = tamaño % 2;
                    if (residuo == 0){
                        System.out.println("El numero no puede ser par, ingrese un numero impar");
                    }
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                   
                           if(i == j || i + j == (tamaño-1) || (j > i && j+i < tamaño - 1) || (j < i && j+i > tamaño - 1)){
                               System.out.print("*");
                           }
                           else{
                               System.out.print(" ");
                           }
                        }
                        System.out.println("");
                    }
                    
                    break;
//------------------------------------------------------------------------------
                
            }//Fin switch

        }while(opcion != 4);
        System.out.println("Fin del programa.");

    }//Fin Main
    
}//Fin Class
