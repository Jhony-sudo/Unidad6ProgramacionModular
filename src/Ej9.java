package src;
import java.util.Scanner;
public class Ej9 {

    public static void main(String[] args) {
        Ej9 Iniciar = new Ej9();
    } 
    
    Scanner n = new Scanner(System.in);
    
    public Ej9(){
        System.out.println("Sumar Matrices");
        System.out.println("\nIngese los valores de la primera matriz");
        int[][] Matriz1 = IniciarMatriz();
        System.out.println("Ingrese los valores de la segunda matriz");
        int[][] Matriz2 = IniciarMatriz();
        boolean Verificar = VerificarSuma(Matriz1,Matriz2);
        if(Verificar == true){
            Matriz1 = Llenar(Matriz1);
            Matriz2 = Llenar(Matriz2);
            Sumar(Matriz1,Matriz2);
            
        }
    } 
    
        public int[][] IniciarMatriz(){
            System.out.println("No. de filas");
          int Filas = n.nextInt();
            System.out.println("No. de Columnas");
          int Columnas = n.nextInt();
          int[][] Matriz1 = new int [Filas][Columnas];
            System.out.println("La matriz es de " + Filas + " X " +  Columnas);
          return Matriz1;
          
        }
        public boolean VerificarSuma(int[][] Arr1,int[][] Arr2){
            boolean SePuede;
            int Fila1 = Arr1.length;
            int Columna1 = Arr1[0].length;
            int Fila2 = Arr2.length;
            int Columna2 = Arr2[0].length;
            if(Fila1 == Fila2 && Columna1 == Columna2){
                System.out.println("Sumar");
                SePuede = true;
            }
            else {
                System.out.println("No se puede sumar por que no son del mismo tama;o");
                SePuede = false;
            }
            return SePuede;
            
        }
        public int[][] Llenar(int[][] Arr){
            int Num;
            System.out.println("Ingrese numeros para llenar la matriz");
            for(int i = 0; i <Arr.length; i++){
                for(int a = 0; a < Arr[0].length; a++){
                    Num = n.nextInt();
                    Arr[i][a] = Num;
                }
            }
            return Arr;
        }
        public void Sumar(int[][] Arr,int[][] Arr2){
            int Suma;
            int Num1;
            int Num2;
            for(int i = 0;i<Arr.length;i++){
                for(int a = 0;a<Arr[0].length;a++){
                    Num1 = Arr[i][a];
                    Num2 = Arr2[i][a];
                    Suma = Num1 + Num2;
                    System.out.println("Suma del elemento " + i + a + " del arreglo 1" + " Con el elemento " + i + a+" del arreglo 2 = " + Suma);
                }
            }
        }
        
    }