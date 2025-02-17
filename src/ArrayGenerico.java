public class ArrayGenerico<T> {

    private T[] vet;
    private int i;

    public ArrayGenerico(){
        vet = (T[]) new Object[100];
        this.i=0;
    }

    public void add(T elemento){
        if (i<vet.length){
            vet[i]=elemento;
            i++;
        }else{
            System.out.println("Vettore pieno");
        }
    }

    public String toString(){
        return "Elementi del vettore: " + vet;
    }

}