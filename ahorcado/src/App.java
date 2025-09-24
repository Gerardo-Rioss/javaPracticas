import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';

        }
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra adivinada: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra, por favor");
            char letra = scanner.next().charAt(0);
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println(
                        "Letra incorrecta!! te quedan " + (intentosMaximos - intentos) + " cantidad de intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicitaciones, palabra adivinada: " + palabraSecreta);

            }
        }
        if (!palabraAdivinada) {
            System.out.println("Te has quedado sin intento!!! GAME OVER");
        }
        scanner.close();
    }
}
