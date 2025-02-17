public class Main {
    public static void main(String[]args){
        ArrayGenerico<Mobile> vetMob = new ArrayGenerico<>();
        vetMob.add(new Mobile(20, 235.0));
        vetMob.add(new Mobile(10, 46.5));
        vetMob.toString();
        vetMob.ricerca(new Mobile(69, 35.9));
        vetMob.ricerca(new Mobile(45, 75.7));
        vetMob.toString();


        ArrayGenerico<Infisso> vetInf = new ArrayGenerico<>();
        vetInf.add(new Infisso("legno", 20, 30));
        vetInf.add(new Infisso("alluminio", 40, 10));
        vetInf.toString();
        vetInf.ricerca(new Infisso("ferro", 22, 35));
        vetInf.ricerca(new Infisso("carta", 26, 56));
        vetInf.toString();
    }
}
