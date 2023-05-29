/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teatro.control;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Teatro {

    //atributos
    //vip
    private Silla V1;
    private Silla V2;
    private Silla V3;
    private Silla V4;
    private Silla V5;
    private Silla V6;
    private Silla V7;
    private Silla V8;
    //General

    private Silla G9;
    private Silla G10;
    private Silla G11;
    private Silla G12;
    private Silla G13;
    private Silla G14;
    private Silla G15;
    private Silla G16;
    private Silla G17;
    private Silla G18;
    private Silla G19;
    private Silla G20;
    private Silla G21;
    private Silla G22;
    private Silla G23;
    private Silla G24;
    private Silla G25;
    private Silla G26;
    private Silla G27;
    private Silla G28;
    private Silla G29;
    private Silla G30;
    private Silla G31;
    private Silla G32;
    private Silla G33;
    private Silla G34;
    private Silla G35;
    private Silla G36;
    private Silla G37;
    private Silla G38;
    private Silla G39;
    private Silla G40;
    private Silla G41;
    private Silla G42;
    private Silla G43;
    private Silla G44;
    private Silla G45;
    private Silla G46;
    private Silla G47;
    private Silla G48;
    private Silla G49;
    private Silla G50;
    private String marca;

    //demas atributos
    private String nombreT;
    private Cliente[] clientes;
    private int tamano;

//arreglo cliente y constructo
    public Teatro() {

//sillas
        //vip
        V1 = new Silla(Silla.V1);
        this.V2 = new Silla(Silla.V2);
        this.V3 = new Silla(Silla.V3);
        this.V4 = new Silla(Silla.V4);
        this.V5 = new Silla(Silla.V5);
        this.V6 = new Silla(Silla.V6);
        this.V7 = new Silla(Silla.V7);
        this.V8 = new Silla(Silla.V8);
        this.V1.setMarca("1");
        this.V2.setMarca("2");
        this.V3.setMarca("3");
        this.V4.setMarca("4");
        this.V5.setMarca("5");
        this.V6.setMarca("6");
        this.V7.setMarca("7");
        this.V8.setMarca("8");

        //general
        this.G9 = new Silla(Silla.G9);
        this.G10 = new Silla(Silla.G10);
        this.G11 = new Silla(Silla.G11);
        this.G12 = new Silla(Silla.G12);
        this.G13 = new Silla(Silla.G13);
        this.G14 = new Silla(Silla.G14);
        this.G15 = new Silla(Silla.G15);
        this.G16 = new Silla(Silla.G16);
        this.G17 = new Silla(Silla.G17);
        this.G18 = new Silla(Silla.G18);
        this.G19 = new Silla(Silla.G19);
        this.G20 = new Silla(Silla.G20);
        this.G21 = new Silla(Silla.G21);
        this.G22 = new Silla(Silla.G22);
        this.G23 = new Silla(Silla.G23);
        this.G24 = new Silla(Silla.G24);
        this.G25 = new Silla(Silla.G25);
        this.G26 = new Silla(Silla.G26);
        this.G27 = new Silla(Silla.G27);
        this.G28 = new Silla(Silla.G28);
        this.G29 = new Silla(Silla.G29);
        this.G30 = new Silla(Silla.G30);
        this.G31 = new Silla(Silla.G31);
        this.G32 = new Silla(Silla.G32);
        this.G33 = new Silla(Silla.G33);
        this.G34 = new Silla(Silla.G34);
        this.G35 = new Silla(Silla.G35);
        this.G36 = new Silla(Silla.G36);
        this.G37 = new Silla(Silla.G37);
        this.G38 = new Silla(Silla.G38);
        this.G39 = new Silla(Silla.G39);
        this.G40 = new Silla(Silla.G40);
        this.G41 = new Silla(Silla.G41);
        this.G42 = new Silla(Silla.G42);
        this.G43 = new Silla(Silla.G43);
        this.G44 = new Silla(Silla.G44);
        this.G45 = new Silla(Silla.G45);
        this.G46 = new Silla(Silla.G46);
        this.G47 = new Silla(Silla.G47);
        this.G48 = new Silla(Silla.G48);
        this.G49 = new Silla(Silla.G49);
        this.G50 = new Silla(Silla.G50);
        this.G9.setMarca("9");
        this.G10.setMarca("10");
        this.G11.setMarca("11");
        this.G12.setMarca("12");
        this.G13.setMarca("13");
        this.G14.setMarca("14");
        this.G15.setMarca("15");
        this.G16.setMarca("16");
        this.G17.setMarca("17");
        this.G18.setMarca("18");
        this.G19.setMarca("19");
        this.G20.setMarca("20");
        this.G21.setMarca("21");
        this.G22.setMarca("22");
        this.G23.setMarca("23");
        this.G24.setMarca("24");
        this.G25.setMarca("25");
        this.G26.setMarca("26");
        this.G27.setMarca("27");
        this.G28.setMarca("28");
        this.G29.setMarca("29");
        this.G30.setMarca("30");
        this.G31.setMarca("31");
        this.G32.setMarca("32");
        this.G33.setMarca("33");
        this.G34.setMarca("34");
        this.G35.setMarca("35");
        this.G36.setMarca("36");
        this.G37.setMarca("37");
        this.G38.setMarca("38");
        this.G39.setMarca("39");
        this.G40.setMarca("40");
        this.G41.setMarca("41");
        this.G42.setMarca("42");
        this.G43.setMarca("43");
        this.G44.setMarca("44");
        this.G45.setMarca("45");
        this.G46.setMarca("46");
        this.G47.setMarca("47");
        this.G48.setMarca("48");
        this.G49.setMarca("49");
        this.G50.setMarca("50");
        //
        this.marca = " ";
        //////////11
        //inicializar cliente        
        clientes = new Cliente[tamano];
        for (int i = 0; i < tamano; i++) {
            clientes[i] = new Cliente();
        }

    }

    //constucto
    public Teatro(Silla V1, Silla V2, Silla V3, Silla V4, Silla V5, Silla V6, Silla V7, Silla V8, Silla G9, Silla G10, Silla G11, Silla G12, Silla G13, Silla G14, Silla G15, Silla G16, Silla G17, Silla G18, Silla G19, Silla G20, Silla G21, Silla G22, Silla G23, Silla G24, Silla G25, Silla G26, Silla G27, Silla G28, Silla G29, Silla G30, Silla G31, Silla G32, Silla G33, Silla G34, Silla G35, Silla G36, Silla G37, Silla G38, Silla G39, Silla G40, Silla G41, Silla G42, Silla G43, Silla G44, Silla G45, Silla G46, Silla G47, Silla G48, Silla G49, Silla G50, String marca, String nombreT, Cliente[] clientes, int tamano) {
        this.V1 = V1;
        this.V2 = V2;
        this.V3 = V3;
        this.V4 = V4;
        this.V5 = V5;
        this.V6 = V6;
        this.V7 = V7;
        this.V8 = V8;
        this.G9 = G9;
        this.G10 = G10;
        this.G11 = G11;
        this.G12 = G12;
        this.G13 = G13;
        this.G14 = G14;
        this.G15 = G15;
        this.G16 = G16;
        this.G17 = G17;
        this.G18 = G18;
        this.G19 = G19;
        this.G20 = G20;
        this.G21 = G21;
        this.G22 = G22;
        this.G23 = G23;
        this.G24 = G24;
        this.G25 = G25;
        this.G26 = G26;
        this.G27 = G27;
        this.G28 = G28;
        this.G29 = G29;
        this.G30 = G30;
        this.G31 = G31;
        this.G32 = G32;
        this.G33 = G33;
        this.G34 = G34;
        this.G35 = G35;
        this.G36 = G36;
        this.G37 = G37;
        this.G38 = G38;
        this.G39 = G39;
        this.G40 = G40;
        this.G41 = G41;
        this.G42 = G42;
        this.G43 = G43;
        this.G44 = G44;
        this.G45 = G45;
        this.G46 = G46;
        this.G47 = G47;
        this.G48 = G48;
        this.G49 = G49;
        this.G50 = G50;
        this.marca = marca;
        this.nombreT = nombreT;
        this.clientes = clientes;
        this.tamano = tamano;
    }

    //get y set
    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
//sillas get y set 

    public Silla getV1() {
        return V1;
    }

    public void setV1(Silla V1) {
        this.V1 = V1;
    }

    public Silla getV2() {
        return V2;
    }

    public void setV2(Silla V2) {
        this.V2 = V2;
    }

    public Silla getV3() {
        return V3;
    }

    public void setV3(Silla V3) {
        this.V3 = V3;
    }

    public Silla getV4() {
        return V4;
    }

    public void setV4(Silla V4) {
        this.V4 = V4;
    }

    public Silla getV5() {
        return V5;
    }

    public void setV5(Silla V5) {
        this.V5 = V5;
    }

    public Silla getV6() {
        return V6;
    }

    public void setV6(Silla V6) {
        this.V6 = V6;
    }

    public Silla getV7() {
        return V7;
    }

    public void setV7(Silla V7) {
        this.V7 = V7;
    }

    public Silla getV8() {
        return V8;
    }

    public void setV8(Silla V8) {
        this.V8 = V8;
    }

    public Silla getG9() {
        return G9;
    }

    public void setG9(Silla G9) {
        this.G9 = G9;
    }

    public Silla getG10() {
        return G10;
    }

    public void setG10(Silla G10) {
        this.G10 = G10;
    }

    public Silla getG11() {
        return G11;
    }

    public void setG11(Silla G11) {
        this.G11 = G11;
    }

    public Silla getG12() {
        return G12;
    }

    public void setG12(Silla G12) {
        this.G12 = G12;
    }

    public Silla getG13() {
        return G13;
    }

    public void setG13(Silla G13) {
        this.G13 = G13;
    }

    public Silla getG14() {
        return G14;
    }

    public void setG14(Silla G14) {
        this.G14 = G14;
    }

    public Silla getG15() {
        return G15;
    }

    public void setG15(Silla G15) {
        this.G15 = G15;
    }

    public Silla getG16() {
        return G16;
    }

    public void setG16(Silla G16) {
        this.G16 = G16;
    }

    public Silla getG17() {
        return G17;
    }

    public void setG17(Silla G17) {
        this.G17 = G17;
    }

    public Silla getG18() {
        return G18;
    }

    public void setG18(Silla G18) {
        this.G18 = G18;
    }

    public Silla getG19() {
        return G19;
    }

    public void setG19(Silla G19) {
        this.G19 = G19;
    }

    public Silla getG20() {
        return G20;
    }

    public void setG20(Silla G20) {
        this.G20 = G20;
    }

    public Silla getG21() {
        return G21;
    }

    public void setG21(Silla G21) {
        this.G21 = G21;
    }

    public Silla getG22() {
        return G22;
    }

    public void setG22(Silla G22) {
        this.G22 = G22;
    }

    public Silla getG23() {
        return G23;
    }

    public void setG23(Silla G23) {
        this.G23 = G23;
    }

    public Silla getG24() {
        return G24;
    }

    public void setG24(Silla G24) {
        this.G24 = G24;
    }

    public Silla getG25() {
        return G25;
    }

    public void setG25(Silla G25) {
        this.G25 = G25;
    }

    public Silla getG26() {
        return G26;
    }

    public void setG26(Silla G26) {
        this.G26 = G26;
    }

    public Silla getG27() {
        return G27;
    }

    public void setG27(Silla G27) {
        this.G27 = G27;
    }

    public Silla getG28() {
        return G28;
    }

    public void setG28(Silla G28) {
        this.G28 = G28;
    }

    public Silla getG29() {
        return G29;
    }

    public void setG29(Silla G29) {
        this.G29 = G29;
    }

    public Silla getG30() {
        return G30;
    }

    public void setG30(Silla G30) {
        this.G30 = G30;
    }

    public Silla getG31() {
        return G31;
    }

    public void setG31(Silla G31) {
        this.G31 = G31;
    }

    public Silla getG32() {
        return G32;
    }

    public void setG32(Silla G32) {
        this.G32 = G32;
    }

    public Silla getG33() {
        return G33;
    }

    public void setG33(Silla G33) {
        this.G33 = G33;
    }

    public Silla getG34() {
        return G34;
    }

    public void setG34(Silla G34) {
        this.G34 = G34;
    }

    public Silla getG35() {
        return G35;
    }

    public void setG35(Silla G35) {
        this.G35 = G35;
    }

    public Silla getG36() {
        return G36;
    }

    public void setG36(Silla G36) {
        this.G36 = G36;
    }

    public Silla getG37() {
        return G37;
    }

    public void setG37(Silla G37) {
        this.G37 = G37;
    }

    public Silla getG38() {
        return G38;
    }

    public void setG38(Silla G38) {
        this.G38 = G38;
    }

    public Silla getG39() {
        return G39;
    }

    public void setG39(Silla G39) {
        this.G39 = G39;
    }

    public Silla getG40() {
        return G40;
    }

    public void setG40(Silla G40) {
        this.G40 = G40;
    }

    public Silla getG41() {
        return G41;
    }

    public void setG41(Silla G41) {
        this.G41 = G41;
    }

    public Silla getG42() {
        return G42;
    }

    public void setG42(Silla G42) {
        this.G42 = G42;
    }

    public Silla getG43() {
        return G43;
    }

    public void setG43(Silla G43) {
        this.G43 = G43;
    }

    public Silla getG44() {
        return G44;
    }

    public void setG44(Silla G44) {
        this.G44 = G44;
    }

    public Silla getG45() {
        return G45;
    }

    public void setG45(Silla G45) {
        this.G45 = G45;
    }

    public Silla getG46() {
        return G46;
    }

    public void setG46(Silla G46) {
        this.G46 = G46;
    }

    public Silla getG47() {
        return G47;
    }

    public void setG47(Silla G47) {
        this.G47 = G47;
    }

    public Silla getG48() {
        return G48;
    }

    public void setG48(Silla G48) {
        this.G48 = G48;
    }

    public Silla getG49() {
        return G49;
    }

    public void setG49(Silla G49) {
        this.G49 = G49;
    }

    public Silla getG50() {
        return G50;
    }

    public void setG50(Silla G50) {
        this.G50 = G50;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //string
    @Override
    public String toString() {
        String cadena = "Teatro{" + "nombreT=" + nombreT + '}';
        for (int i = 0; i < tamano; i++) {
            cadena = cadena + "\n Cliente" + clientes[i].toString();

        }
        return cadena;
    }

    //inicializar cliente
    public void inicializarcliente(int cantidad) {
        this.tamano = cantidad;
        //Instanciar el arreglo de productos
        clientes = new Cliente[tamano];

        //Inicializar cada producto del arreglo
        for (int i = 0; i < tamano; i++) {
            clientes[i] = new Cliente();
            clientes[i].setSilla(1 + i);
        }
    }

    public Cliente eliminarCliente(int ID) {

        //Recorrer arreglo de productos
        for (int i = 0; i < tamano; i++) {

            if (clientes[i].getID() == ID) {

                clientes[i].setNombre("");
                clientes[i].setApellido("");
                clientes[i].setApellido("");
                clientes[i].setBoleto(0);
                clientes[i].setEntrada("");
                clientes[i].setID(0);

            }

        }
        return null;
    }

    //registrar cliente
    public Cliente registro(int silla) {

        for (int i = 0; i < tamano; i++) {

            Scanner sc = new Scanner(System.in);
            if (silla == clientes[i].getSilla()) {
                System.out.println("Vienvenido,digite sus datos");
                System.out.println("Nombre: ");
                String nombre = sc.next();
                clientes[i].setNombre(nombre);
                System.out.println("Apellido");
                String apellido = sc.next();
                clientes[i].setApellido(apellido);
                System.out.println("ID");
                int ID = sc.nextInt();
                clientes[i].setID(ID);

                //tipo de voleto
                if (clientes[i].getSilla() < 9) {
                    clientes[i].setBoleto(1);
                } else {
                    if (clientes[i].getSilla() > 8) {
                        clientes[i].setBoleto(2);
                    }
                    //marca
                    switch (clientes[i].getBoleto()) {
                        case 1:
                            clientes[i].setEntrada("V");
                            break;
                        case 2:
                            clientes[i].setEntrada("G");
                            break;
                        default:
                            throw new AssertionError();
                    }

                }

            }
        }
        return null;

        //mostrar teatro
    }

    public void mostarteatro() {

        System.out.println("---------------------");
        System.out.println("|" + V1.getMarca() + "|" + "    " + "|" + V2.getMarca() + "|" + " " + "|" + V3.getMarca() + "|" + "    " + "|" + V4.getMarca() + "|");
        System.out.println("---------------------");
        System.out.println("|" + V5.getMarca() + "|" + "    " + "|" + V6.getMarca() + "|" + " " + "|" + V7.getMarca() + "|" + "    " + "|" + V8.getMarca() + "|");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("|" + G9.getMarca() + "|" + "|" + G10.getMarca() + "|" + "|" + G11.getMarca() + "|" + " " + "|" + G12.getMarca() + "|" + "|" + G13.getMarca() + "|" + "|" + G14.getMarca() + "|");
        System.out.println("|" + G15.getMarca() + "|" + "|" + G16.getMarca() + "|" + "|" + G17.getMarca() + "|" + " " + "|" + G18.getMarca() + "|" + "|" + G19.getMarca() + "|" + "|" + G20.getMarca() + "|");
        System.out.println("|" + G21.getMarca() + "|" + "|" + G22.getMarca() + "|" + "|" + G23.getMarca() + "|" + " " + "|" + G24.getMarca() + "|" + "|" + G25.getMarca() + "|" + "|" + G26.getMarca() + "|");
        System.out.println("|" + G27.getMarca() + "|" + "|" + G28.getMarca() + "|" + "|" + G29.getMarca() + "|" + " " + "|" + G30.getMarca() + "|" + "|" + G31.getMarca() + "|" + "|" + G32.getMarca() + "|");
        System.out.println("|" + G33.getMarca() + "|" + "|" + G34.getMarca() + "|" + "|" + G35.getMarca() + "|" + " " + "|" + G36.getMarca() + "|" + "|" + G37.getMarca() + "|" + "|" + G38.getMarca() + "|");
        System.out.println("|" + G39.getMarca() + "|" + "|" + G40.getMarca() + "|" + "|" + G41.getMarca() + "|" + " " + "|" + G42.getMarca() + "|" + "|" + G43.getMarca() + "|" + "|" + G44.getMarca() + "|");
        System.out.println("|" + G45.getMarca() + "|" + "|" + G46.getMarca() + "|" + "|" + G47.getMarca() + "|" + " " + "|" + G48.getMarca() + "|" + "|" + G49.getMarca() + "|" + "|" + G50.getMarca() + "|");

    }

    public void llenuraTeatro() {
        // inicializar un contador por cada tipo
        int VIP = 0;
        int General = 0;

        //Recorrer el arreglo de productos
        for (int i = 0; i < this.tamano; i++) {
            switch (clientes[i].getBoleto()) {
                case 1:
                    VIP++;
                    break;
                case 2:
                    General++;
                    break;

            }
        }
        System.out.println("En el Teatro hay " + VIP + " sillas VIP ocupadas lo cual es " + (VIP * 100 / 50) + "% del teatro");
        System.out.println("En el Teatro hay " + General + " sillas Generales ocupadas lo cual es " + (VIP * 100 / 50) + "% del teatro");
        System.out.println("El teatro esta " + ((VIP + General) * 100 / 50) + "% lleno");

    }

}
