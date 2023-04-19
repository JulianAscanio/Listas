/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Principal {

    public static void main(String[] args) {
        Lista list = new Lista();
        /*list.addInicio("Mache");
        list.addInicio("Julian");
        list.addInicio("Juan");
        list.addInicio("Yul");*/

        list.addFinal("Juan");
        list.addFinal("Miguel");
        list.addInicio("Mache");
        list.addInicio("Julian");
        list.addFinal("Cesar");

        list.mostrarLista();

        Scanner x = new Scanner(System.in);
        System.out.println("\nBuscar elemento: ");
        String buscar = x.next();
        if (list.buscarDato(buscar)) {
            System.out.println("Se encontró el dato.");
        } else {
            System.out.println("No se encuontró el dato.");
        }

    }
}
