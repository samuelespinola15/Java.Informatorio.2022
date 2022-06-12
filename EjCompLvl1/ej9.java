package EjCompLvl1;
import java.util.Scanner;


public class ej9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra o texto");
        String texto = scan.nextLine();

        System.out.println("Ingrese una letra para contar su cantidad que hay en el texto anterior");
        String letra = scan.nextLine();
        
        scan.close();
        
        int cantidad = 0;

        char letraDelTexto = letra.charAt(0);  //convertimos el string 'letra' a un char 'letraDelTexto'

        for (int i = 0; i<texto.length(); i++) {
            if (letraDelTexto == texto.charAt(i)){
                
                cantidad++;
            }
        }

        System.out.println("La cantidad de veces que aparecio: '" + letra + "' en el texto fue: " + cantidad + " veces");
        
    }
}
