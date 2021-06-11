package src;

import java.util.Scanner;
import java.util.Random;

public class Ej2 {

    public static void main(String[] args) {
        Ej2 Iniciar = new Ej2();
    }

    Scanner n = new Scanner(System.in);
    Random r = new Random();
    int[] Numeros = new int[10];

    public Ej2() {
        int[] Arreglo2 = LlenarArreglo(Numeros);
        MostrarArreglo(Arreglo2);
        MostrarDatos(Arreglo2);

    }

    public int[] LlenarArreglo(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            int Num = r.nextInt(99);
            Arr[i] = Num;
        }
        return Arr;
    }

    public void MostrarArreglo(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Posicion " + i + " valor :" + Arr[i]);
        }
    }

    public void MostrarDatos(int[] Arr) {
        int NumMayor = 0;
        int Repeticion = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > NumMayor) {
                NumMayor = Arr[i];
            }
        }

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == NumMayor) {
                Repeticion++;
            }
        }
        System.out.println("El numero mayor es " + NumMayor);
        System.out.println("Se repite " + Repeticion + " veces");

    }

}