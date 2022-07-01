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

        for (int i = 0; i < datos001.length; i++) {

            MenuNiños mn = new MenuNiños(datos001[i][0], Double.parseDouble(datos001[i][1]));
            mn.establecerValorPorcionHelada(Double.parseDouble(datos001[i][2]));
            mn.establecerValorPorcionPastel(Double.parseDouble(datos001[i][3]));
            mn.calcularvalorcancelartotal();
            lista.add(mn);

        }

        for (int i = 1; i < datos002.length; i++) {
            MenuNiños mn2 = new MenuNiños(datos002[i][0], Double.parseDouble(datos002[i][1]));
            mn2.establecerValorPorcionHelada(Double.parseDouble(datos002[i][2]));
            mn2.establecerValorPorcionPastel(Double.parseDouble(datos002[i][3]));
            mn2.calcularvalorcancelartotal();
            lista.add(mn2);

        }

        for (int i = 2; i < datos002.length; i++) {
            MenuNiños mn3 = new MenuNiños(datos002[i][0], Double.parseDouble(datos002[i][1]));
            mn3.establecerValorPorcionHelada(Double.parseDouble(datos002[i][2]));
            mn3.establecerValorPorcionPastel(Double.parseDouble(datos002[i][3]));
            mn3.calcularvalorcancelartotal();
            lista.add(mn3);

        }

        for (int i = 0; i < datos003.length; i++) {
            MenuEconomico mE1 = new MenuEconomico((datos003[i][0]), Double.parseDouble(datos003[i][1]));
            mE1.establecerPorcentajeDescuento(Double.parseDouble(datos003[i][2]));
            mE1.calcularvalorcancelartotal();
            lista.add(mE1);
        }

        for (int i = 1; i < datos003.length; i++) {
            MenuEconomico mE2 = new MenuEconomico((datos003[i][0]), Double.parseDouble(datos003[i][1]));
            mE2.establecerPorcentajeDescuento(Double.parseDouble(datos003[i][2]));
            mE2.calcularvalorcancelartotal();
            lista.add(mE2);
        }

        for (int i = 1; i < datos003.length; i++) {
            MenuEconomico mE3 = new MenuEconomico((datos003[i][0]), Double.parseDouble(datos003[i][1]));
            mE3.establecerPorcentajeDescuento(Double.parseDouble(datos003[i][2]));
            mE3.calcularvalorcancelartotal();
            lista.add(mE3);
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
