package loops.object;

public class Honda extends Car {
    public Honda(String marka, double maxpred){
        super(marka, maxpred);
    }

    @Override
    public double pomnozpred() {
        return maxpred*3;
    }
}
