public class Mobile {

    private int peso;
    private double prezzo;

    public Mobile(int peso, double prezzo) {
        this.peso = peso;
        this.prezzo = prezzo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String toString() {
        return "peso=" + peso + ", prezzo=" + prezzo;
    }

    public boolean equals(Object o){
        if (o instanceof Mobile){
            Mobile m = (Mobile) o;
            return ((m.peso==this.peso) && (m.prezzo==this.prezzo));
        } else{return false;}
    }

}
