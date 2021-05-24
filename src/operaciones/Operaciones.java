/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 * Esta clase contiene todas los metodos para nuestras operaciones.
 *
 * @author manu
 */
class Operaciones {

    /**
     * Metodo que devuelve los numeros entre dos valores, estos incluidos.
     *
     * @param a El valor del primer numero del rango
     * @param b El valor del otro numero del rango
     * @return Devuelve la lista de los numeros entre a y b
     */
    public int[] rango(int a, int b) {
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }
        int[] nums = new int[(b - a) + 1];
        int j = 0;
        for (int i = a; i <= b; i++) {
            nums[j] = i;
            j++;
        }
        return nums;
    }

    /**
     * Metodo que devulve el valor de la suma de todos los numeros del rango
     * creado entre dos valores, estos incluidos.
     *
     * @param a El valor del primer numero del rango
     * @param b El valor del otro numero del rango
     * @return Devuelve la suma de los numeros dentro del rango
     */
    public int sumRango(int a, int b) {
        int sum = 0;
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Metodo que indica si un numero positivo es par o no.
     *
     * @param a El valor del numero a examinar
     * @return Devuelve true si es par, false si no lo es
     */
    public boolean isPar(int a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Parámetro negativo");
        }
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Metodo que, tras recibir una lista de numeros, solo devuelve los
     * positivos.
     *
     * @param nums Lista de numeros
     * @return Devuelve la misma lista, pero solo con los valores positivos
     */
    public int[] extraerPositivos(int[] nums) {

        int n = 0;
        if (nums == null) {
            throw new IllegalArgumentException("El array recibido es nulo.");
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                n++;
            }
        }

        int[] positivos = new int[n];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positivos[j] = nums[i];
                j++;
            }
        }
        return positivos;
    }
}
