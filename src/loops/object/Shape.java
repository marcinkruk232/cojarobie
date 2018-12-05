package loops.object;


public class Shape {
    protected double parA = 0;
    protected double parB = 0;
    //protected to private tylko bardziej, nie mozna tego zmieniac
    public Shape(double parA, double parB) {
        setParams(parA, parB);
    }
    public void setParams(double parA, double b) {
        this.parA = parA;
        parB = b;
    }
    public void setParB(double parB) {
        this.parB = parB;
    }
    public double calculateSurface() {
        return -100;
    }
    public String toString() {
        return getClass().getSimpleName() + "[" + parA + ", " + parB +
                "],surf:" + calculateSurface();
    }
    public static void main(String[] args)
    {
        System.out.println("kkk");
        Rectangle r1 = new Rectangle(4, 5);

        System.out.println(r1.calculateSurface());
        System.out.println("that's no the shape of my heart");

        Cicrlcel cel = new Cicrlcel(5, 1);

        System.out.println(cel.calculateSurface());

        triangle illuminati = new triangle(6,6);
        System.out.println(illuminati.calculateSurface());
    }
}