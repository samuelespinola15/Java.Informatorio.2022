package EjCompLvl2;

public class ej2 {

    static int numeros[];
    public static void main(String[] args){
        numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        mostrarLista();
        numeros[5] = 60;
        numeros[6] = 70;
        mostrarLista();
    }

    private static void mostrarLista() {
        for (int elementos : numeros){
            System.out.println(elementos);
        }
        System.out.println("Longitud del arreglo :" + numeros.length);
    }
}
