package src;
import java.util.Scanner;
public class Ej10 {

    public static void main(String[] args) {
        Ej10 Iniciar = new Ej10();
    } 
    
    Scanner n = new Scanner(System.in);
    int [][] Matriz = new int[3][4];
    public Ej10(){
        int [][] Matriz1 =  Llenar(Matriz);
        int [][] Matriz2 = Transpuesta(Matriz1);
        DibujarMatriz(Matriz1,Matriz2);
          
            
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
        public void DibujarMatriz(int[][] Arr,int[][] Arr2){
           int ColumnasMatriz2 = Arr[0].length;
            System.out.println("Matriz Ingresada             "   +  "      Matriz transpuesta");
            for (int i = 0, a = 0; i < Arr.length || a < Arr2.length; i++, a++) {

        
                if (i < Arr.length) {
                    System.out.print("|");

                    for (int y1 = 0; y1 < Arr[i].length; y1++) {
                        System.out.print(Arr[i][y1]);
                        if (y1 != Arr[i].length - 1) {
                        System.out.print("\t");
                        }
                    }

                    System.out.print("|");
                } 
                else {
            
                for (i = 0; i < ColumnasMatriz2 - 1; i++) {
                System.out.print("\t");
                 }
               }

            
            if (a < Arr2.length) {
            System.out.print("\t\t|");

                for (int y2 = 0; y2 < Arr2[a].length; y2++) {
                        System.out.print(Arr2[a][y2]);

                        if (y2 != Arr2[a].length - 1) {
                            System.out.print("\t");
                        }
                 }

             System.out.println("|");
            }
            }
        }
        
        public int[][] Transpuesta(int[][] Arr){
            int[][] Arr2 = new int [4][3];
            for(int i = 0; i<Arr2.length;i++){
                for(int a = 0;a<Arr2[0].length;a++){
                    Arr2[i][a] = Arr[a][i];
                }
            }
            return Arr2;
        }
        
}