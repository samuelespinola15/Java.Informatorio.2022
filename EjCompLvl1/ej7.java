package EjCompLvl1;

import java.util.Scanner;

public class ej7 {
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = scan.nextLine();
        scan.close();
        String palabraMayus = "";

        for (int n = 0; n <palabra.length (); n ++) { 
            char c = palabra.charAt (n); 
            switch (c){
                case 'a':
                    palabraMayus = palabraMayus + "A";
                    break;
                case 'b':
                    palabraMayus = palabraMayus + "B";
                    break;
                case 'c':
                    palabraMayus = palabraMayus + "C";
                    break;
                case 'd':
                    palabraMayus = palabraMayus + "D";
                    break;
                case 'e':
                    palabraMayus = palabraMayus + "E";
                    break;
                case 'f':
                    palabraMayus = palabraMayus + "F";
                    break;
                case 'g':
                    palabraMayus = palabraMayus + "G";
                    break;
                case 'h':
                    palabraMayus = palabraMayus + "H";
                    break;
                case 'i':
                    palabraMayus = palabraMayus + "I";
                    break;
                case 'j':
                    palabraMayus = palabraMayus + "J";
                    break;
                case 'k':
                    palabraMayus = palabraMayus + "K";
                    break;
                case 'l':
                    palabraMayus = palabraMayus + "L";
                    break;
                case 'm':
                    palabraMayus = palabraMayus + "M";
                    break;
                case 'n':
                    palabraMayus = palabraMayus + "N";
                    break;
                case 'ñ':
                    palabraMayus = palabraMayus + "Ñ";
                    break;
                case 'o':
                    palabraMayus = palabraMayus + "O";
                    break;
                case 'p':
                    palabraMayus = palabraMayus + "P";
                    break;
                case 'q':
                    palabraMayus = palabraMayus + "Q";
                    break;
                case 'r':
                    palabraMayus = palabraMayus + "R";
                    break;
                case 's':
                    palabraMayus = palabraMayus + "S";
                    break;
                case 't':
                    palabraMayus = palabraMayus + "T";
                    break;
                case 'u':
                    palabraMayus = palabraMayus + "U";
                    break; 
                case 'v':
                    palabraMayus = palabraMayus + "V";
                    break;
                case 'w':
                    palabraMayus = palabraMayus + "W";
                    break;
                case 'x':
                    palabraMayus = palabraMayus + "X";
                    break;
                case 'y':
                    palabraMayus = palabraMayus + "Y";
                    break;
                case 'z':
                    palabraMayus = palabraMayus + "Z";
                    break;

            
            }
        }
        System.out.println(palabraMayus);
    }

}
