/*
Calcula y manda llamar B0 y B1, imprime la ecuacion de regresión y predice el resultado

 * CLASE FIND BETA
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SLR_2;

import javax.swing.JOptionPane;
/**
 *
 * @author ANGEL
 */
public class SLR {
    
    Algebra AL = new Algebra();

    double sumax = AL.sumatoriax();
    double sumay = AL.sumatoriay();
    double sumaxy = AL.sumatoriaxy();
    double sumax2 = AL.sumatoriax2();

    double CalculateB0 = 0;
    double CalculateB1 = 0;
    double Prediction;

    public double CalculateB1(){

        CalculateB1 = ( 9 * sumaxy - (sumax * sumay)) / ( 9 * sumax2 - (sumax * sumax));
        //CalculateB1 = (sumaxy - ((sumax * sumay)/9))    /     (sumax2 - ((sumax * sumax) / 9)) ;

        return CalculateB1; // B1 = m = pendiente
    }
    
    public double CalculateB0(){

        CalculateB0 = (sumax2 * sumay - (sumax * sumaxy)) / ( 9 * sumax2 - (sumax * sumax));
        //CalculateB0 = ((sumay/9)-((sumax/9) * (CalculateB1)));

        return CalculateB0; // B0 = b = intercepto
    }

    public double Prediction(double b0, double b1){

        double Valor = Double.parseDouble(JOptionPane.showInputDialog("Valor de X: "));

        Prediction = (Valor * b1) + b0;

        JOptionPane.showMessageDialog(null, "Resultado = " + Prediction);
        //JOptionPane.showInputDialog("Resultado: " + Prediction);
        System.out.println("Resultado = " + b0 + " + " + "(" + b1 + " * " + Valor + ")" + "\n");
        //System.out.println("Resultado = " + "(" + Valor + " * " + b1 + ")" + " + " + b0 + "\n");
        System.out.println("Resultado: " + Prediction);

        return Prediction;
    }

    public void displayRegressioEquation(){

        System.out.println("SLR: y = B0 + B1 X");
    }

    public double sumax(){

        return sumax;
    }

    public double sumay(){

        return sumay;
    }

    public double sumaxy(){

        return sumaxy;
    }

    public double sumax2(){

        return sumax2;
    }
}