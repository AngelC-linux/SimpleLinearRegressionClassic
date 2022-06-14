/*
Resuelve las sumatorias 
Clase de procesos HelperArithmetic Set

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLR_2;

/**
 *
 * @author ANGEL
 */
import static java.lang.Math.pow;


public class HelperArithmetic {
    
     DataSet DS = new DataSet();

    int [] aux = DS.getMatrizx();
    int [] auy = DS.getMatrizy();
    int [] auxy = new int [9];
    int [] aux2 = new int [9];

    public int [] CalcularXY(){

        for(int i = 0; i < 9; i++){

            auxy[i] = aux[i] * auy[i];
        }

        return auxy;
    }

    public int [] CalcularX2(){

        for(int i = 0; i < 9; i++){

            aux2[i] = (int) pow((aux[i]), 2);
        }

        return aux2;
    }
}