package src;

import java.util.Random;

public class Ej5 {

    public static void main(String[] args) {
        Ej5 Iniciar = new Ej5();
    }

    Random r = new Random();
    int[] Numeros = new int[100];
    int SolucionA[] = { 5, 7, 2, 3, 9, 5, 6, 8, -50 };
    int SolucionB[] = { 6, -50 };
    int SolucionC[] = { 1, 5, 4, 7, 6, 2, 7, 8, 3, 2, 9, 4, 5, 3, 6, 6, 8, 8, -50 };
    int Bandera = r.nextInt(99);

    public Ej5() {
        int[] Arreglo2 = IniciarArreglo(Numeros);
        CalcularValorMedio(Arreglo2, Bandera);
        System.out.println("Solucion tres conjuntos de notas sugeridas: ");
        System.out.print("Conjunto A ");
        CalcularValorMedio(SolucionA, 8);
        System.out.print("Conjunto B");
        CalcularValorMedio(SolucionB, 1);
        System.out.print("Conjunto C");
        CalcularValorMedio(SolucionC, 18);

    }

    public int[] IniciarArreglo(int[] Arr) {
        System.out.println("Notas: ");
        Arr[Bandera] = -50;
        for (int i = Bandera + 1; i <= 99; i++) {
            Arr[i] = 0;
        }
        for (int i = 0; i < Bandera; i++) {
            int Num = r.nextInt(10);
            Arr[i] = Num;
        }
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(" " + Arr[i]);
        }
        return Arr;
    }

    public void CalcularValorMedio(int[] Arr, int Bandera) {
        float Valor;
        int Suma = 0;
        for (int i = 0; i < Bandera; i++) {
            Suma += Arr[i];
        }
        Valor = (float) Suma / (float) (Bandera);
        System.out.println("\n La nota media es de " + Valor);

    }

}