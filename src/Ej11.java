package src;
import java.util.Scanner;
public class Ej11 {

    public static void main(String[] args) {
        Ej11 Iniciar = new Ej11();
    } 
    
    Scanner n = new Scanner(System.in);
    String [] Nombres = new String[6];
    String [] Resultado = new String[6];
    float [] Notas = new float[6];
    
    public Ej11(){
    LlenarNotas(Nombres,Resultado,Notas);    
    }
    
    public  void LlenarNotas(String[] Nombre,String[] Resultado,float[] Nota){
        String NamEstudiante;
        String ResulTadoEst;
        int NotaEst;
        for(int i = 0; i<Nombre.length;i++){
            System.out.println("Ingrese el nombre del estudiante");
            NamEstudiante = n.next();
            Nombre[i] = NamEstudiante;
            do{
            System.out.println("Ingrese la nota");
            NotaEst = n.nextInt();
                if(NotaEst<0  || NotaEst>10){
                    System.out.println("Ingrese una Nota Correcta");
                }
            } while(NotaEst<0 || NotaEst>10);
            
                 Nota[i] = NotaEst;
            
            do{
            System.out.println("Ingrese un  Resultado de Acuerdo A La Nota, de lo contrario Este proceso se repetira");
                System.out.println("0 y 4,99 será un Suspenso.");
                System.out.println("5 y 6,99 será un Bien");
                System.out.println("7 y 8,99 será un Notable.");
                System.out.println("9 y 10 será un Sobresaliente.");
            ResulTadoEst = n.next();
            } 
            while(!(ResulTadoEst.equals("Sobresaliente")& (NotaEst == 9 || NotaEst == 10)) & !(ResulTadoEst.equals("Suspenso") & (NotaEst >= 0 & NotaEst <= 5)) & !(ResulTadoEst.equals("Bien")& (NotaEst >= 5 & NotaEst <= 7)) & !(ResulTadoEst.equals("Notable") & (NotaEst >= 7 & NotaEst <= 9)));
            Resultado[i] = ResulTadoEst;
        }
            MostrarNotas(Nota,Nombre,Resultado);
    }
    
        public void MostrarNotas(float[] Notas,String[] Nombre,String[] Resultado){
            System.out.println("Nombre      Nota     Resultado");
            for(int i =0;i<Notas.length;i++){
                System.out.println(Nombre[i] + "    " + Notas[i] + "   " + Resultado[i]);
            }
        }
    
         
        
}