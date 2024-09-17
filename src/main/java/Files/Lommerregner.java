public class Lommerregner {

    private double førsteTal;
    private double andenTal;

    public Lommerregner() {
    }

    public Lommerregner(double førsteTal) {
        this.førsteTal = førsteTal;
    }

    public Lommerregner(double førsteTal, double andenTal) {
        this.førsteTal = førsteTal;
        this.andenTal = andenTal;
    }


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
