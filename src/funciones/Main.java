package funciones;

public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(1, 2, 3);

        Coche miCoche = new Coche();
        miCoche.AddPuertas();

        System.out.println(miCoche.numPuertas);


        System.out.println(resultado);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}


class Coche {
    public int numPuertas = 4;

    public void AddPuertas() {
        this.numPuertas--;
    }
}
