package src;
import java.util.Random;
public class Ej7 {

    public static void main(String[] args) {
        Ej7 Iniciar = new Ej7();
    } 
    int [][] Matriz = new int [4][3];
    Random r = new Random();
    
    public Ej7(){
        int[][] MatrizLlena = LlenarMatriz(Matriz);
        SumarFilaPar(MatrizLlena);
        
    }
    
        public int [][] LlenarMatriz(int[][] Arr){
         for(int i = 0;i<Arr.length;i++){
            for(int a = 0;a<Arr[0].length;a++){
                int Num = r.nextInt(555);
                Arr[i][a] = Num;
                System.out.println("Fila " + i + "Columna" + a + " Valor:" + Num);
            }
         }
         return Arr;
        }
        public void SumarFilaPar(int[][] Arr){
            int Sum = 0;
            for(int i = 0;i<Arr.length;i++){
            for(int a = 0;a<Arr[0].length;a++){
                if(i%2 == 0){
                    Sum += Arr[i][a];
                }
            }
         }
            System.out.println("La suma de los numeros en filas pares es de " + Sum);
        }
    }