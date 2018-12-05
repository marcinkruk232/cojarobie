package loops.object;

public class Car {
    protected String marka;
    protected double maxpred = 0;

    public Car(String marka, double maxpred) { parametry(marka, maxpred); }

    public void parametry(String marka11, double maxpred11) {
        marka = marka11;
        maxpred = maxpred11;
    }

    public double pomnozpred() { return -10; };
    public String toString() {
        return getClass().getSimpleName() + "[" + marka + ", " + maxpred +
                "],surf:" + pomnozpred();
    }


    public static void main(String[] args) {
        Honda honda1 = new Honda("Honda", 9.4);
        System.out.println(honda1.pomnozpred());

    }
}
