package loops.object;

public class Cicrlcel extends Shape {

    double pi = 3.14;
    public Cicrlcel(double parA, double parB){
        super(parA, parB);
    }
    public double calculateSurface() {
        return pi*parA*parA;
    }

}
