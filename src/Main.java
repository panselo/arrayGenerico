public class Main {
    public static void main(String[]args){
        ArrayGenerico<Mobile> vetMob = new ArrayGenerico<>();
        vetMob.add(new Mobile(20, 235.0));
        vetMob.add(new Mobile(10, 46.5));
        vetMob.toString();


        ArrayGenerico<Infisso> vetInf = new ArrayGenerico<>();
        vetInf.add(new Infisso("legno", 20, 30));
        vetInf.add(new Infisso("alluminio", 40, 10));
        vetInf.toString();

    }
}
