//Programa que lê 20 números inteiros aleatórios (entre 0 e 100) e armazena-os em um vetor.
//Ao final, mostra os números e seus sucessores.

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numeroAleatorios = new int[20];

        for (int i= 0; i < numeroAleatorios.length; i++){
            int numero = random.nextInt(100);
            numeroAleatorios[i] = numero;
        }

        System.out.println("Números A   leatórios: ");
        for (int numero : numeroAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Números Aleatórios: ");
        for (int numero : numeroAleatorios) {
            System.out.print(numero+1 + " ");
        }

        System.out.println("\nAntecessor dos Números Aleatórios: ");
        for (int numero : numeroAleatorios) {
            System.out.print(numero-1 + " ");
        }
    }
}
