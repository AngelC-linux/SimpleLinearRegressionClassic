/* 
Clase main SLR_2
*/
package SLR_2;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;


public class Result extends Agent{
    
     @Override
    protected void setup(){

        System.out.println("Agent " + getLocalName() + " Started.");
        addBehaviour(new MyOneShotBehaviour());

    }

    private class MyOneShotBehaviour extends OneShotBehaviour{

        @Override
        public void action(){

            SLR slr = new SLR();

            double sumax = slr.sumax();
            double sumay = slr.sumay();
            double sumaxy = slr.sumaxy();
            double sumax2 = slr.sumax2();

            double b0 = slr.CalculateB0();
            double b1 = slr.CalculateB1();

            System.out.println("");
            System.out.println("B0: " + b0);
            System.out.println("B1: " + b1 + "\n");
            //System.out.println("");
            System.out.println("Sumax: " + sumax);
            System.out.println("Sumay: " + sumay);
            System.out.println("Sumaxy: " + sumaxy);
            System.out.println("Sumax2: " + sumax2 + "\n");
            //System.out.println("");

            slr.displayRegressioEquation();
            System.out.println("");
            slr.Prediction(b0,b1);

        }
/*
        @Override
        public int onEnd(){

            myAgent.doDelete();
            return super.onEnd();

        }*/
    }
}