/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatro.control;

/**
 *
 * @author Acer
 */
public class Silla {
  //VIP
    public static final int V1=1;
   public static final int V2=2;
   public static final int V3=3;
   public static final int V4=4;
   public static final int V5=5;
   public static final int V6=6;
   public static final int V7=7;
   public static final int V8=8;
   //General

    public static final int G9=9;
   public static final int G10=10;
 public static final int G11=11;
   public static final int G12=12;
   public static final int G13=13;
   public static final int G14=14;
   public static final int G15=15;
   public static final int G16=16;
   public static final int G17=17;
   public static final int G18=18;
    public static final int G19=19;
       public static final int G20=20;
 public static final int G21=21;
   public static final int G22=22;
   public static final int G23=23;
   public static final int G24=24;
   public static final int G25=25;
   public static final int G26=26;
   public static final int G27=27;
   public static final int G28=28;
    public static final int G29=29;
       public static final int G30=30;
 public static final int G31=31;
   public static final int G32=32;
   public static final int G33=33;
   public static final int G34=34;
   public static final int G35=35;
   public static final int G36=36;
   public static final int G37=37;
   public static final int G38=38;
    public static final int G39=39;
       public static final int G40=40;
 public static final int G41=41;
   public static final int G42=42;
   public static final int G43=43;
   public static final int G44=44;
   public static final int G45=45;
   public static final int G46=46;
   public static final int G47=47;
   public static final int G48=48;
    public static final int G49=49;
   public static final int G50=50;

   //Atributos
   
   private int silla;
   private String marca;
   
   //constructos

    public Silla() {
          this.silla = 0;
        this.marca= "Disponible ";
    }
    
    public Silla(int silla, String marca) {
        this.silla = silla;
        this.marca = marca;
    }
     public Silla(int silla) {
        this.silla = silla;
        this.marca = "Disponible";
    }
    
    
   //get y set

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

