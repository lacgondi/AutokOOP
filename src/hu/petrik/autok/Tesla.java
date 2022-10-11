package hu.petrik.autok;

public class Tesla implements Auto{
    private double sebesseg;

    public Tesla() {
        this.sebesseg=Math.floor(Math.random()*60);
    }

    @Override
    public void gyorsul() {
        this.sebesseg+=(Math.random()*15)+5;
    }

    @Override
    public double getSebbesseg() {
        return this.sebesseg;
    }
}
