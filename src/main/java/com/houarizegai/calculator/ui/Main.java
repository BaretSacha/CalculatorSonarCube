// Ce programme calcul la factorielle d'un nombre et vérifie sa 

public class Main {

    // Fonction pour calculer la factorielle d'un nombre
    public static long factorielle(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorielle(n - 1);
        }
    }

    // Fonction pour vérifier si un nombre est premier
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Fonction Principale
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is " + factorielle(number));
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
