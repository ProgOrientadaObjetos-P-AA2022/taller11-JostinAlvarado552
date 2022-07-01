/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu> listamenus = new ArrayList<>();

        MenuNiños mn = new MenuNiños("Niños 01", 2);
        mn.establecerValorPorcionHelada(1.50);
        mn.establecerValorPorcionPastel(1);
        mn.calcularvalorcancelartotal();

        MenuNiños mn2 = new MenuNiños("Niños 02", 3);
          mn2.establecerValorPorcionHelada(1.50);
        mn2.establecerValorPorcionPastel(1);
        mn2.calcularvalorcancelartotal();
        listamenus.add(mn);
        listamenus.add(mn2);

        MenuEconomico mE1 = new MenuEconomico("Econo 001", 4);
        mE1.establecerPorcentajeDescuento(5);
        mE1.calcularvalorcancelartotal();
        listamenus.add(mE1);

        MenudelDia md = new MenudelDia("Dia 001", 3);
        md.establecerValorBebida(0.75);
        md.establecerValorPostre(2.50);
        md.calcularvalorcancelartotal();
        listamenus.add(md);

        MenuCarta mC1 = new MenuCarta("Carta001", 2);
        mC1.establecerValorporciondeGuarnicion(0.50);
        mC1.establecerValorBebida(1);
        mC1.establecerPorcentajeAdicional(10);
        mC1.calcularvalorcancelartotal();
        listamenus.add(mC1);

        Cuenta c = new Cuenta();
        c.establecerNombre("Gonzalo Plata");
        c.establecerListadodeCartas(listamenus);
        c.calcularvalorcancelartotal();

        System.out.println(c);

    }

}
