package entities;

public class Calculo {
    private double soma;
    private double soma1;
    private double soma2;


    public double getSoma1() {
        return soma1;
    }

    public void setSoma1(double soma1) {
        this.soma1 = soma1;
    }

    public double getSoma2() {
        return soma2;
    }

    public void setSoma2(double soma2) {
        this.soma2 = soma2;
    }

    public double getSoma() {
        return soma;
    }

    public double x(){

      soma =  soma1 * soma2;
      return soma;
    }

}