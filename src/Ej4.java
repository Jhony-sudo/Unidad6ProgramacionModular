package src;

import java.util.Random;

public class Ej4 {

    public static void main(String[] args) {
        Ej4 Iniciar = new Ej4();
    }

    Random r = new Random();
    int[] Numeros = new int[10];

    public Ej4() {
        int[] Arreglo2 = LlenaryMostrarArreglo(Numeros);
        int Mayor = DeterminarMayor(Arreglo2);
        DeterminarDistancia(Mayor, Arreglo2);

    }

    public int[] LlenaryMostrarArreglo(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            int Num;
            Num = r.nextInt(20);
            Arr[i] = Num;
            System.out.println("Indice " + i + " valor: " + Arr[i]);
        }
        return Arr;
    }

    public void DeterminarDistancia(int Mayor, int[] Arr) {
        int distancia;
        for (int i = 0; i < Arr.length; i++) {
            distancia = Mayor - Arr[i];
            System.out.println("La distancia del numero mayor a el valor del indice " + i + " es de " + distancia);
        }
    }

    public int DeterminarMayor(int[] Arr) {
        int Mayor = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > Mayor) {
                Mayor = Arr[i];
            }
        }

        return Mayor;

    }

}