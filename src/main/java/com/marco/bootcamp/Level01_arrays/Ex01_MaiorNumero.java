
package com.marco.bootcamp.Level01_arrays;

/**
 *
 * @author marco
 */
public class Ex01_MaiorNumero {

    public static void main(String[] args) {
         int[] numeros = {4, 9, 2, 15, 7, 9};

        int maiorNumero = maiorNumero(numeros);
        System.out.println("O maior número é:" + maiorNumero);
    }
    
    public static int maiorNumero(int[] numeros) {
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (maior < numeros[i]) {
                maior = numeros[i];
            }

        }
        return maior;
    }
}
