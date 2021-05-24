/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author manu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        operaciones.rango(6, 9);
        operaciones.rango(9, 6);
        operaciones.sumRango(6, 9);
        operaciones.sumRango(9, 6);
        operaciones.isPar(-4);
        operaciones.extraerPositivos(null);
    }

}
