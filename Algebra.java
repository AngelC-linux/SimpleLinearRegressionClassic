/*
 * CLASE ARITMÉTICA

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLR_2;

/**
 *
 * @author ANGEL
 */
public class Algebra {
    
     DataSet DS = new DataSet();
    HelperArithmetic CL = new HelperArithmetic();

    int [] aux = DS.getMatrizx();
    int [] auy = DS.getMatrizy();

    int [] auxy = CL.CalcularXY();
    int [] aux2 = CL.CalcularX2();

    double sumax;
    double sumay;
    double sumaxy;
    double sumax2;

    public double sumatoriax(){

        for(int i = 0; i < 9; i++){

            sumax = aux[i] + sumax;
        }

        return sumax;
    }

    public double sumatoriay(){
        
        for(int i = 0; i < 9; i++){

            sumay = auy[i] + sumay;
        }

        return sumay;
    }

    public double sumatoriaxy(){

        for(int i = 0; i < 9; i++){

            sumaxy = auxy[i] + sumaxy;
        }

        return sumaxy;
    }

    public double sumatoriax2(){

        for(int i = 0; i < 9; i++){

            sumax2 = aux2[i] + sumax2;
        }

        return sumax2;
    }
}
