/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author DET PC
 */
public class Principal02 {

    public static void main(String[] args) {
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        for (int i = 0; i < 1; i++) {

            MenuNiños mn = new MenuNiños(datos001[i][0], Double.parseDouble(datos001[i][1]));
            mn.establecerValorPorcionHelada(Double.parseDouble(datos001[i][2]));
            mn.establecerValorPorcionPastel(Double.parseDouble(datos001[i][3]));
            mn.calcularvalorcancelartotal();
            lista.add(mn);

        }
        for (int i = 1; i < 2; i++) {
            MenuNiños mn2 = new MenuNiños(datos001[i][0], Double.parseDouble(datos001[i][1]));
            mn2.establecerValorPorcionHelada(Double.parseDouble(datos001[i][2]));
            mn2.establecerValorPorcionPastel(Double.parseDouble(datos001[i][3]));
            mn2.calcularvalorcancelartotal();
            lista.add(mn2);
        }
        for (int i = 2; i < 3; i++) {
            MenuNiños mn3 = new MenuNiños(datos001[i][0], Double.parseDouble(datos002[i][1]));
            mn3.establecerValorPorcionHelada(Double.parseDouble(datos001[i][2]));
            mn3.establecerValorPorcionPastel(Double.parseDouble(datos001[i][3]));
            mn3.calcularvalorcancelartotal();
            lista.add(mn3);
        }

        for (int i = 0; i < 1; i++) {
            MenuEconomico mE1 = new MenuEconomico((datos002[i][0]), Double.parseDouble(datos002[i][1]));
            mE1.establecerPorcentajeDescuento(Double.parseDouble(datos003[i][2]));
            mE1.calcularvalorcancelartotal();
            lista.add(mE1);
        }

        for (int i = 1; i < 2; i++) {
            MenuEconomico mE2 = new MenuEconomico((datos002[i][0]), Double.parseDouble(datos002[i][1]));
            mE2.establecerPorcentajeDescuento(Double.parseDouble(datos002[i][2]));
            mE2.calcularvalorcancelartotal();
            lista.add(mE2);
        }

        for (int i = 2; i < 3; i++) {
            MenuEconomico mE3 = new MenuEconomico((datos002[i][0]), Double.parseDouble(datos002[i][1]));
            mE3.establecerPorcentajeDescuento(Double.parseDouble(datos002[i][2]));
            mE3.calcularvalorcancelartotal();
            lista.add(mE3);
        }
        for (int i = 0; i < 1; i++) {
            MenudelDia md = new MenudelDia((datos003[i][0]), Double.parseDouble(datos003[i][1]));
            md.establecerValorBebida(Double.parseDouble(datos003[i][2]));
            md.establecerValorPostre(Double.parseDouble(datos003[i][3]));
            md.calcularvalorcancelartotal();
            lista.add(md);
        }
        for (int i = 1; i < 2; i++) {
            MenudelDia md2 = new MenudelDia((datos003[i][0]), Double.parseDouble(datos003[i][1]));
            md2.establecerValorBebida(Double.parseDouble(datos003[i][2]));
            md2.establecerValorPostre(Double.parseDouble(datos003[i][3]));
            md2.calcularvalorcancelartotal();
            lista.add(md2);
        }
        for (int i = 2; i < 3; i++) {
            MenudelDia md3 = new MenudelDia((datos003[i][0]), Double.parseDouble(datos003[i][1]));
            md3.establecerValorBebida(Double.parseDouble(datos003[i][2]));
            md3.establecerValorPostre(Double.parseDouble(datos003[i][3]));
            md3.calcularvalorcancelartotal();
            lista.add(md3);
        }

        for (int i = 0; i < 1; i++) {
            MenuCarta mC1 = new MenuCarta((datos004[i][0]), Double.parseDouble(datos004[i][1]));
            mC1.establecerValorporciondeGuarnicion(Double.parseDouble(datos004[i][2]));
            mC1.establecerValorBebida(Double.parseDouble(datos004[i][2]));
            mC1.establecerPorcentajeAdicional(Double.parseDouble(datos004[i][2]));
            mC1.calcularvalorcancelartotal();
            lista.add(mC1);
        }
        for (int i = 1; i < 2; i++) {
            MenuCarta mC2 = new MenuCarta((datos004[i][0]), Double.parseDouble(datos004[i][1]));
            mC2.establecerValorporciondeGuarnicion(Double.parseDouble(datos004[i][2]));
            mC2.establecerValorBebida(Double.parseDouble(datos004[i][2]));
            mC2.establecerPorcentajeAdicional(Double.parseDouble(datos004[i][2]));
            mC2.calcularvalorcancelartotal();
            lista.add(mC2);
        }

        for (int i = 2; i < 3; i++) {
            MenuCarta mC3 = new MenuCarta((datos004[i][0]), Double.parseDouble(datos004[i][1]));
            mC3.establecerValorporciondeGuarnicion(Double.parseDouble(datos004[i][2]));
            mC3.establecerValorBebida(Double.parseDouble(datos004[i][2]));
            mC3.establecerPorcentajeAdicional(Double.parseDouble(datos004[i][2]));
            mC3.calcularvalorcancelartotal();
            lista.add(mC3);
        }

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularvalorcancelartotal();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal(10);
        miCuenta.calcularvalorcancelartotal();
        System.out.printf("%s\n", miCuenta);

    }
}
