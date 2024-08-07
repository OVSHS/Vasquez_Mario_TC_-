/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vasquez_mario_tc_;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Vasquez_Mario_TC_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        while (true){
         System.out.println("\nMenu principal ");
            System.out.println("1 Leer base y altura de Traingulos");
            System.out.println("2 Hallar el Minimo Comun Multiplo y Maximo Comun Divisor de dos numeros enteros.");
            System.out.println("3 Determinar si el numero ingresado es un numero perfecto.");
             System.out.println("Elija una de las siguientes opciones: ");
            
             int opcion = lea.nextInt();
         if(opcion==1){
             
            int contador=1;
            int limite=8;
            int areamayor=0;
            while(contador<=limite){
            System.out.println("Ingrese la base"+ "#"+contador);
             int base=lea.nextInt();
                System.out.println("Ingrese la Altura: "+"#"+ contador);
             int altura=lea.nextInt();
             int area=(base*altura)/2;
                System.out.println("El area del triangulo:"+"#"+contador+"="+area);
                
             if(area>areamayor){
                areamayor = area;
                 }
            contador++;
        }
             System.out.println("El area es:"+ areamayor);
            
                     
          }
    
      }
        
    }
   }

