/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teatro.control;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
 
public class TeatroControl {
private static void limpiar_consola() {
        System.out.println("\033[H\033[2J");
        System.out.println("\f");
        System.out.flush();
    }
  public static void mostrar_menu() {
        limpiar_consola();
        System.out.println("1-crear teatro");
        System.out.println("2-dates de la tienda");
        System.out.println("3-Reservar Boleto");
        System.out.println("4-EliminarReserva");
        System.out.println("5-mostrar teatro");
        System.out.println("6-Cambiar silla");
        System.out.println("7-Ocupacion Teatro");
        
        
    }
  //iniciar un teatro
     public static void leerDatosTeatro(Teatro teatro) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba el nombre del Teatro");
        String nombre = sc.next();

        teatro.setNombreT(nombre);
           int cantidad = 50;
        System.out.print(" cantidad de clientes a registrar" + cantidad);
     
        teatro.setTamano(cantidad);
       teatro.inicializarcliente(cantidad);

    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        Teatro Teatro= new Teatro();
       
        System.out.println("Viencenido ");
        int opcion=0;
       
      do{
 
          mostrar_menu();
          limpiar_consola();
          opcion= sc.nextInt();
          switch (opcion){
           
                    case 1:
                  System.out.println("Crear teatro");
                  leerDatosTeatro(Teatro);
                                 System.out.println(Teatro.toString());
                                 break;
                     case 2:
                         System.out.println(Teatro.toString());
                         break;
                 //
                     case 3: 
   
                            
                            Teatro.mostarteatro();
                            Registrar(Teatro);
                            break;
                        case 4:        
                                Teatro.toString();
                                 eliminarCiente(Teatro);
                     break;
                          ////// 
                        case 5:
                           Teatro.mostarteatro();
                           break;
//////////
                        case 6:
                            cambiarSilla(Teatro);
                            break;
                 ////
                        case 7:
                            Teatro.llenuraTeatro();
                            break;
          }
                  
      
      
      
      
      }while (opcion !=0);
      //fin del do 
      
      
      
      
      
    }
   
      //eliminar cliente
      private static void eliminarCiente(Teatro Teatro){
               Scanner sc=  new Scanner(System.in);
          System.out.println("Escriba el Id del usuario a eliminar");
          int IDeliminar=sc.nextInt();
          Cliente cliente=Teatro.eliminarCliente(IDeliminar);
          if(cliente!=null){
              
              System.out.println(Teatro.toString());
          }
          else {System.out.println("Cliente eliminado");
            System.out.println(Teatro.toString());
          }          
      }
        //registrar cliene
      private static void Registrar(Teatro Teatro){
    Scanner sc=  new Scanner(System.in);
          System.out.println("Bien venido, escoja una silla");
          int silla=sc.nextInt();
          Cliente cliente=Teatro.registro(silla);
        
          
      }
        
              private static void cambiarSilla(Teatro Teatro){
               Scanner sc=  new Scanner(System.in);
          System.out.println("Escriba el Id del usuario");
          int IDeliminar=sc.nextInt();
          Cliente cliente=Teatro.eliminarCliente(IDeliminar);
           System.out.println(Teatro.toString());
              System.out.println(" Escoja una silla");
          int silla=sc.nextInt();
          Cliente cambio=Teatro.registro(silla);
          //
            
      }
        
        
        
    }
    

