import com.sun.java.accessibility.util.SwingEventMonitor;

import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        ASCII();
    }

    public static void ASCII() {
        Scanner scanner = new Scanner(System.in);
        int width;
        int heigh;
        do {
            System.out.println("Quelle largeur pour le chat (min largeur = 7) ?");
            width = scanner.nextInt();
        } while(width<7);
        do {
        System.out.println("Quelle hauteur pour le chat (min hauteur = 3) ?");
        heigh = scanner.nextInt();
        } while(heigh<3);
        System.out.print("|\\");
        for (int i = 1; i < width - 3; i++) {
            System.out.print("-");
        }
        System.out.println("/|");
        for (int i = 1; i < heigh - 1; i++) {
            if (i == heigh / 2) {
                System.out.print("| O");
                for (int n = 1; n < width - 5; n++) {
                    System.out.print("_");
                }
                System.out.println("O |");
            } else {
                System.out.print("|");
                for (int m = 1; m < width - 1; m++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
        System.out.print(" \\_");
        for (int i = 1; i < width -5 ; i++) {
            System.out.print("^");
        }
        System.out.print("_/ ");
    }
}





