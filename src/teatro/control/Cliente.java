/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatro.control;

/**
 *
 * @author Acer
 */


   

public class Cliente {
    
    //constante
        public final static int general=2;
      public final static int VIP=1;
//atributo
    private String nombre;
     private String apellido;
     private int ID;
     private int Boleto;
     private String entrada;
     private int silla;
  
//constructo

    public Cliente() {
        this.nombre=" ";
        this.apellido=" ";
    }

    public Cliente(String nombre, String apellido, int ID, int Boleto, String entrada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.Boleto = Boleto;
        this.entrada = entrada;
        this.silla=1;
    }

    
   
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBoleto() {
        return Boleto;
    }

    public void setBoleto(int Boleto) {
        this.Boleto = Boleto;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String marca) {
        this.entrada = marca;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

  
    
    
    //to string
    @Override   
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", Boleto (VIP=1 General=2) = " + Boleto + ", Entrada=" + entrada + ", silla=" + silla + '}';
    }

    
     









}
