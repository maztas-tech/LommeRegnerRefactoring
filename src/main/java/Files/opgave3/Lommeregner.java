package Files.opgave3;

public class Lommeregner {
    //Attributer
    private double førsteTal;
    private double andenTal;

    //Overloaded constructors

    public Lommeregner() {
    }

    public Lommeregner(double førsteTal) {
        this.førsteTal = førsteTal;
    }

    public Lommeregner(double førsteTal, double andenTal) {
        this.førsteTal = førsteTal;
        this.andenTal = andenTal;
    }


    //Getters og setters

    public double getFørsteTal() {
        return førsteTal;
    }

    public void setFørsteTal(double førsteTal) {
        this.førsteTal = førsteTal;
    }

    public double getAndenTal() {
        return andenTal;
    }

    public void setAndenTal(double andenTal) {
        this.andenTal = andenTal;
    }
}
