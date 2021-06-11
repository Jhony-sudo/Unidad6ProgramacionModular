package src;

public class Ej6 {

    public static void main(String[] args) {
        Ej6 Iniciar = new Ej6();
    }

    int Matriz[][] = { { 5, 6, 3 }, { 14, 2, 4 }, { 27, 7, 6 } };

    public Ej6() {
        MultiplicarArreglo(Matriz);
    }

    public void MultiplicarArreglo(int[][] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            for (int a = 0; a < Arr.length; a++) {
                int Num = Arr[i][a] * 2;
                System.out.println(Num);
            }
        }
    }

}