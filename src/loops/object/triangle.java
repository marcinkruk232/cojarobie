package loops.object;

public class triangle extends Shape {
    public triangle(double parA, double parB){

        super(parA, parB);

    }

    @Override
    public double calculateSurface() {
        return parA*0.5*parB;
    }
}
