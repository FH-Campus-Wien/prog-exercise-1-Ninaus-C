package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int sum = (a+b+c+(int)d+(int)e+(int)f+(int)g+(int)h);
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(number1 + number2);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        int x = 2;
        int y = 5;
        System.out.print("x: y: ");
        System.out.println("After Swap:");
        x=x+y-x;
        y=y+2-y;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1<n2) {
            System.out.println("n1: n2: n2 > n1");
        }
        else if (n1>n2) {
            System.out.println("n1: n2: n1 > n2");
        }
        else {
            System.out.println("n1: n2: n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        int Umsatz = scanner.nextInt();

        if (Umsatz < 0 || Umsatz >= 100000) {
            System.out.println("Enter annual Revenue: Invalid Revenue");
        } else if (0 <= Umsatz && Umsatz < 20000) {
            System.out.println("Enter annual Revenue: Poor Sales Revenue");
        } else if (20000 <= Umsatz && Umsatz < 50000) {
            System.out.println("Enter annual Revenue: Average Sales Revenue");
        } else if (50000 <= Umsatz && Umsatz < 80000) {
            System.out.println("Enter annual Revenue: Good Sales Revenue");
        } else if (80000 <= Umsatz && Umsatz < 100000) {
            System.out.println("Enter annual Revenue: Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        int SalesProvision = scanner.nextInt();
        switch (SalesProvision) {
            case 1 :System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.01");
                break;
            case 2: System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.02");
                break;
            case 3: System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.03");
                break;
            case 4: System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.04");
                break;
            default: System.out.println("Enter CommissionClass: Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        int Year = scanner.nextInt();

        if (Year % 4 != 0) {
            System.out.println("Year: Not a Leapyear");
        } else if (Year % 100 != 0) {
            System.out.println("Year: Leapyear");
        } else if (Year % 400 == 0) {
            System.out.println("Year: Leapyear");
        } else {
            System.out.println("Year: Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int zaehler = 0;
        int zwiErgebnis = 0;
        int Zehner = 1;
        int reversenumber = 0;
        zwiErgebnis=number;

        while (zwiErgebnis !=0) {
            zwiErgebnis=zwiErgebnis/10;
            zaehler++;
        }
        for (int i = 1; i < zaehler; i++) {
            Zehner = Zehner * 10;
        }
        zwiErgebnis=number;
        while (zwiErgebnis !=0) {
            reversenumber=(zwiErgebnis%10) * Zehner + reversenumber;
            zwiErgebnis = zwiErgebnis/10;
            Zehner=Zehner/10;
        }
        System.out.println("Number: " + reversenumber);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}