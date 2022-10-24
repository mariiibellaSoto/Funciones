public class Principal {
    public static void main(String[] args) {
        suma(45, 70, 80);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int n1, int n2, int n3){
        int resultado = n1 + n2 + n3;
        System.out.println(resultado);
    }
}

class Coche{
    public int puertas = 4;

    public void incrementarPuertas(){
        this.puertas++;
    }
}
