package Unit;

public class Quotient  implements Operation{
    private double a;
    private double b;
    private double result;


    public Quotient (double a_, double b_) {
        setA(a_);
        setB(b_);
        setResult(a / b);
    }


    public double getA() {
        return a;
    }


    public void setA(double a) {
        this.a = a;
    }


    public double getB() {
        return b;
    }


    public void setB(double b) {
        this.b = b;
    }


    public double getResult() {
        return result;
    }


    public void setResult(double result) {
        this.result = result;
    }
}
