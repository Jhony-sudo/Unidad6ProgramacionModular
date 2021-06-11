package src;
import java.util.Scanner;
public class Ej8 {

    public static void main(String[] args) {
        Ej8 Iniciar = new Ej8();
    } 
    
    String [] Matriz1 = new String[5];
    String [] Matriz2 = new String[5];
  
    Scanner n = new Scanner(System.in);
    
    public Ej8(){
        System.out.println("Ingrese 5 palabra para llenar el primer arreglo");
        String[]MatrizLlena1 = LlenarMatriz(Matriz1);
        
        System.out.println("Ingrese 5 palabra para llenar el segundo arreglo");
        String[]MatrizLlena2 = LlenarMatriz(Matriz2);
        CompararArreglo(MatrizLlena1,MatrizLlena2);
    } 
    
        public String[] LlenarMatriz(String[] Arr){
         for(int i = 0;i<Arr.length;i++){
            String Palabra = n.next();
            Arr[i] = Palabra;
             //System.out.println("Palabra en la posicion " + i + " = " + Palabra);
         }
         return Arr;
        }
        public void CompararArreglo(String[] Arr1,String[] Arr2){
            System.out.println("\n Comparando tamaño de letras de la palabra " + Arr1[0] + " con el segundo Arreglo");
            for(int i = 0; i<Arr1.length;i++){
                int Tam1 = Arr1[0].length();
                int Tam2 = Arr2[i].length();
                if(Tam1 == Tam2){
                System.out.println("Indice " + i + " tamaño = " + Tam2 + " Son iguales");
                }
                else{
                System.out.println("Indice " + i + " tamaño = " + Tam2 + " No Son iguales");
                }
            }
                
            
        }
    }