/*
 * SIMULATION
 * JOSÉ ÁNGEL CARDONA GARCÍA
 * 15/09/21

 * Favor de ir a los apuntes de simulación para entrar en contexto
 */
package handsOn3;
import java.util.Scanner;


/**
 *
 * @author ANGEL
 */
public class LinearRegression {

    String [] Benetton = {"Year", "Sale", "Advertising"};
    int [] year = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int [] sale = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
    int [] advertising = {23, 26, 30, 34, 43, 48, 52, 57, 58};
    
    double m = 23.42;
    double b = 167.79;
    
    public void arreglos(){
        
    System.out.println(Benetton[0] + "  |  " + Benetton[1] + "  |  " + Benetton[2]);
        
    for(int i=0; i<year.length; i++){
        System.out.println(year[i] + "     |  " + sale[i] + "   |  " + advertising[i]);
        }
    
    } //Arreglos
    
    public void cargar(){
        System.out.println("\n-----------------------\n");
        
        int numeros[] = new int [3];
        numeros[0] = 62;
        numeros[1] = 72;
        numeros[2] = 82;
        
        for(int i=0; i< numeros.length; i++){
            double resultado = m*numeros[i]+b;
            System.out.println(numeros[i] + "    |  " + resultado + "   |  ");
        }
        
        
        
    }//Cargar
    
    public void mostrar(){

    }
    
    
    public static void main(String[] args) {
        LinearRegression LR = new LinearRegression();
        LR.arreglos();
        LR.cargar();
        
    }
    
}
