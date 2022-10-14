import java.util.Scanner;

public class TP2 {

    public static void main(String[] args) {
        //discriminant();
        //parite();
        //max();
        //min();
        //egaliteStr();
        //factorielle();
        //countdown();
        //carres();
        //tableMultiplication();
        //division();
        //regle();
        nombrePremier();


    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if(delta< 0) {
            double x1 = Math.sqrt(-delta);
            System.out.println("Les racines de ce polynome sont : ("+ -b +"+i"+x1+ ")/"+ 2*a +" et ("+ -b +"-i"+x1+ ")/"+ 2*a );
        }
        else if (delta == 0) {
            float x = -b/(2*a);
            System.out.println("Ce polynome à une racine double qui est : "+ x);
        }
        else {
            double y = (-b + Math.sqrt(delta))/(2*a);
            double z = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Ce polynome à deux racine qui sont : "+ y + " et " + z);
        }
    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " est un nombre Pair");
        } else {
            System.out.println(x + " est un nombre Impair");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier entier");
        int x1 = scanner.nextInt();
        System.out.println("Veuillez saisir un deuxième entier");
        int x2 = scanner.nextInt();
        if (x1>x2) {
            System.out.println(x1+" est plus grand que "+x2);
        }
        else{
            System.out.println(x2+" est plus grand que "+x1);
        }
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier entier");
        int x1 = scanner.nextInt();
        System.out.println("Veuillez saisir un deuxième entier");
        int x2 = scanner.nextInt();
        if (x1>x2) {
            System.out.println(x2+" est plus petit que "+x1);
        }
        else{
            System.out.println(x1+" est plus petit que "+x2);
        }
    }

    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une première chaine de  caractère");
        String x1 = scanner.nextLine();
        System.out.println("Veuillez saisir une deuxième chaine de caractère");
        String x2 = scanner.nextLine();
        boolean test1 = (x1 == x2);
        System.out.println(test1);
        boolean test2 = x1.equals(x2);
        System.out.println(test2);

    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        if (n==0){
            System.out.println(n + "! = " + factorielle);
        }
        else{
            for (int i = 1; i <= n; i++) {
                factorielle *= i;
            }
            System.out.println(n + "! = " + factorielle);
        }
    }

    public static void countdown() {
        int i = 10;
        System.out.println(i);
        while (i != 0){
            i = i-1;
            System.out.println(i);
        }
        System.out.println("BOOOM!!!");
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int n = scanner.nextInt();
        System.out.println(n +" "+ n*n);
    }

    public static void tableMultiplication() {
        for (int i = 1; i < 11; i++){
            for (int x = 1; x < 11; x++){
                System.out.print(x*i+" ");

            }
            System.out.println();
        }
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le numérateur");
        int premierEntier = scanner.nextInt();
        int deuxiemeEntier;
        do {
            System.out.println("Veuillez saisir le dénominateur");
            deuxiemeEntier = scanner.nextInt();
        } while (deuxiemeEntier ==0 );
        float div = premierEntier / deuxiemeEntier;
        System.out.println("la division de "+premierEntier+" par "+deuxiemeEntier+" est égale à : "+ div);
    }

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Veuillez saisir un entier possitif ou nul");
            n = scanner.nextInt();
        } while (n<0);
        for (int i = 1; i < n; i++){
            if (i%10==0){
                System.out.print("|");
            }
            else {
                System.out.print("-");
            }
        }
    }

    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        int x = 1;
        int n = scanner.nextInt();
        for (int i =2; i<n; i++){
            if (n%i == 0){
                x+=1;
            }
        }
        if (x==1){
            System.out.println(n+ " est un nombre premier");
        }
        else {
            System.out.println(n+ " n'est pas un nombre premier");
        }
    }



}

