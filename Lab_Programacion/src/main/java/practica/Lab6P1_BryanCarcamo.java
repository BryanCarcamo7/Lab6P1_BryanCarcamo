/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;


import java.util.Scanner;

/**
 *
 * @author Bryan Carcamo
 */
public class Lab6P1_BryanCarcamo {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
   
        
         int opcion=0;
        while(opcion!=4){
        System.out.println("---------MENU--------");
        System.out.println("1.Lista del super ");
        System.out.println("2.Vocales y Consonantes ");
        System.out.println("3.Floor and Ceiling ");
        System.out.println("4.Salir ");
        System.out.println("Opcion: ");
       opcion=lea.nextInt();
       
       switch(opcion){
           case 1:
               System.out.println("Ingrese numero de productos: ");
               int productos=lea.nextInt();
             
               String superMercado []=new String[productos];
        
               for(int i=0;i<productos;i++){
             System.out.println("Ingrese productos: ");
               superMercado[i]=lea.next();
               }
               
               System.out.print("Arreglo resultante:  ");
          for(int i=0;i<productos;i++){
         
              System.out.print(" ["+superMercado[i]+"]");
              
          }      
           
               System.out.println("");
              break;
            case 2:
                System.out.println("Ingrese una cadena: "); 
                String cadena=lea.next();
                int s=cadena.length();
                String cadenaSoloVocales="";
                String cadenaSoloConsonantes="";
                
                char k=' ';
                
                for(int i=0;i<s;i++){
                    k=cadena.charAt(i);
                    
                if((k==97) ||k==111 ||k==101 ||k==105 ||k==117){
                 
                    cadenaSoloVocales+=k;
                }else{
                    cadenaSoloConsonantes+=k;
               
                }
                
                }
                
                System.out.println("Resultado: "+cadenaSoloVocales+""+cadenaSoloConsonantes);
                
                break;
            case 3:
                System.out.println("Ingrese tamaño del arreglo:");
                int tamaño=lea.nextInt();
               
               int []altura=new int[tamaño];
            
               int mayor=0;
               int menor=0;
               
            for(int i=0;i<altura.length;i++){
                
                 altura[i]=(int)(Math.random()*(2570-1000)+1000);
            }
            for(int i=0;i<altura.length;i++){
                 if( altura[i]>mayor){
                 mayor=altura[i];
                 }
                 
                 if(altura[i]<altura[i]){
                 menor=altura[i];
                 }
            
            }
                System.out.print("Arreglo generado: ");
          for(int i=0;i<altura.length;i++){
                  System.out.print("["+altura[i]+"]");
              }
                System.out.println("");
                System.out.println("Arreglo final: ["+mayor+"] ["+menor+"]");
             
                break;
                
           case 4:System.out.println("Feliz dia");
       break;
       
       }
        }
        
       
        
    }
    public static int[] Random(int tamaño){
      int arreglo[]=new int[tamaño];
      for(int i=0;i<arreglo.length;i++){
      arreglo[i]=(int)Math.random();
      while(arreglo[i]>=1000 && arreglo[i]<=2570){
          System.out.print("arreglo generado: ["+arreglo[i]+"]");
      }
      }
     
      return arreglo;
       }
    
    public static int Mayor(int tamaño, int mayor){
    int arreglo[]=new int[tamaño];
    
    for(int i=0;i<arreglo.length;i++){
    if(arreglo[i]>mayor){
    mayor=arreglo[i];
    }
    }
      return mayor;
     
    }
    
    public static int Menor(int tamaño, int menor){
    int arreglo[]=new int[tamaño];
    
    for(int i=0;i<arreglo.length;i++){
    if(arreglo[i]<menor){
    menor=arreglo[i];
    }
    }
      return menor;
      
      
     
    }
    
         
         
         
   } 
  
     

