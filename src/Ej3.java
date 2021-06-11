package src;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Ej3 Iniciar = new Ej3();
    }

    Scanner n = new Scanner(System.in);
    int[] Numeros = new int[8];

    public Ej3() {
        int[] Arreglo2 = LlenarArreglo(Numeros);
        MostrarArreglo(Arreglo2);
        Buscar(Arreglo2);

    }

    public int[] LlenarArreglo(int[] Arr) {
        System.out.println("Ingrese 8 numeros para llenar el arreglo");
        for (int i = 0; i < Arr.length; i++) {
            int Num;
            Num = n.nextInt();
            Arr[i] = Num;
        }
        return Arr;
    }

    public void MostrarArreglo(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Posicion " + i + " valor :" + Arr[i]);
        }
    }

    public boolean Buscar(int[] Arr) {
        int Num;
        boolean Resultado = false;
        System.out.println("Ingrese un numero a buscar ");
        Num = n.nextInt();
        for (int i = 0; i < Arr.length; i++) {
            if (Num == Arr[i]) {
                Resultado = true;

            } else {
                Resultado = false;
            }
        }
        if (Resultado == true) {
            System.out.println("Lo encontre");

        } else {
            System.out.println("No lo encontre perrito");
        }
        return Resultado;
    }

}