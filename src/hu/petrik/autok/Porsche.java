package hu.petrik.autok;

public class Porsche implements Auto{
    private double sebesseg;

    public Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    @Override
    public void gyorsul() {
        this.sebesseg+=10;
    }

    @Override
    public double getSebbesseg() {
        return this.sebesseg;
    }
}
