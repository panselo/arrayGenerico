public class Infisso {

    private String materiale;
    private int altrezza;
    private int larghezza;

    public Infisso(String materiale, int altrezza, int larghezza) {
        this.materiale = materiale;
        this.altrezza = altrezza;
        this.larghezza = larghezza;
    }

    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public int getAltrezza() {
        return altrezza;
    }

    public void setAltrezza(int altrezza) {
        this.altrezza = altrezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public String toString() {
        return "materiale= " + materiale + ", altrezza= " + altrezza + ", larghezza= " + larghezza;
    }

    public boolean equals(Object o){
        if (o instanceof Infisso){
            Infisso i = (Infisso) o;
            return ((i.altrezza==this.altrezza) && (i.materiale==this.materiale) && (i.larghezza==this.larghezza));
        } else{return false;}
    }

}
