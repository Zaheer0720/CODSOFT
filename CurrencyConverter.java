import java.util.*;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[]args){
        int choice;
        double amount;
        Scanner sc = new Scanner(System.in);

        System.out.println("*******WELCOME TO CURRENCY CONVERTOR******");
        System.out.println("SELECT THE BASE CURRENCY");
        System.out.println("1:INR Rs \n2:USD $\n3:Euro \n4:Pound \n5:Yaun \n6:AED\n7:Yen");
        choice = sc.nextInt();
        System.out.println("ENTER THE AMOUNT YOU WANT TO CONVERT");
        amount = sc.nextDouble();


        switch (choice){
            case 1:
                Rupee_to_other(amount);
                break;

            case 2:
                Doller_to_other(amount);
                break;

            case 3:
                Euro_to_other(amount);
                break;

            case 4:
                Pound_to_other(amount);
                break;

            case 5:
                Yaun_to_other(amount);
                break;

            case 6:
                AED_to_other(amount);
                break;

            case 7:
                Yen_to_other(amount);
                break;

            default:
                System.out.println("INVALID CHOICE");
                break;

        }
    }
         /*ALL THE CURRENCY VALUES TAKEN FOLLOWING  ARE PRESENT MARKET VALUES ACCORDING TO GOOGLE*/

    public static void Rupee_to_other(double amt){
        int select;
        System.out.println("SELECT WHICH CURRENCY YO WANT TO BE CONVERTED TO:");
        System.out.println("1:USD\n2:Euro\n3:Pound\n4:Yaun\n5:AED\n6:Yen");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("1 Rupee = 0.012 Doller");
                System.out.println(amt+" Rupee" + " =" +(amt*0.012)+" Dollers");
                break;

            case 2:
                System.out.println("1 Rupee = 0.011 euros");
                System.out.println(amt+" Rupee = "+(amt*0.011)+" euros" );
                break;

            case 3:
                System.out.println("1 Rupee = 0.0094 Pounds" );
                System.out.println(amt +" Rupee = "+ (amt*0.0094)+" Pounde");
                break;

            case 4:
                System.out.println("1 Rupee = 0.086 Yuan");
                System.out.println(amt+" Rupee = "+(amt*0.086)+" Yaun");
                break;

            case 5:
                System.out.println("1 Rupee = 0.044 AED");
                System.out.println(amt+" Rupee = "+(amt*0.044)+" AED");
                break;

            case 6:
                System.out.println("1 Rupee = 1.88 Yen");
                System.out.println(amt+" Rupee = "+(amt*1.88)+" Yen");

            default:
                System.out.println("INVALIDE CHOICE");
                break;
        }

    }

    public static void Doller_to_other(double amt){
        int select;
        System.out.println("SELECT WHICH CURRENCY YO WANT TO BE CONVERTED TO:");
        System.out.println("1:Rupee\n2:Euro\n3:Pound\n4:Yaun\n5:AED\n6:Yen");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("1 Doller = 83.28 Rupee");
                System.out.println(amt+" Doller" + " =" +(amt*83.28)+" Rupee");
                break;

            case 2:
                System.out.println("1 Doller = 0.92 euros");
                System.out.println(amt+" Doller = "+(amt*0.92)+" euros" );
                break;

            case 3:
                System.out.println("1 Doller = 0.79 Pounds" );
                System.out.println(amt +" Doller = "+ (amt*0.79)+" Pounde");
                break;

            case 4:
                System.out.println("1 Doller = 7.20 Yuan");
                System.out.println(amt+" Doller = "+(amt*7.20)+" Yaun");
                break;

            case 5:
                System.out.println("1 Doller = 3.67 AED");
                System.out.println(amt+" Doller = "+(amt*3.67)+" AED");
                break;

            case 6:
                System.out.println("1 Doller = 156.50 Yen");
                System.out.println(amt+" Doller = "+(amt*156.50)+" Yen");
                break;

            default:
                System.out.println("INVALIDE CHOICE");
                break;
        }

    }

    public static void Euro_to_other(double amt){
        int select;
        System.out.println("SELECT WHICH CURRENCY YO WANT TO BE CONVERTED TO:");
        System.out.println("1:USD\n2:Rupee\n3:Pound\n4:Yaun\n5:AED\n6:Yen");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("1 Euro = 1.08 Doller");
                System.out.println(amt+" Euro" + " =" +(amt*1.08)+" Dollers");
                break;

            case 2:
                System.out.println("1 Euro = 90.24 Rupee");
                System.out.println(amt+" Euro = "+(amt*90.24)+" Rupee" );
                break;

            case 3:
                System.out.println("1 Euro = 0.85 Pounds" );
                System.out.println(amt +" Euro = "+ (amt*0.85)+" Pounds");
                break;

            case 4:
                System.out.println("1 Euro = 7.81 Yuan");
                System.out.println(amt+" Euro = "+(amt*7.81)+" Yaun");
                break;

            case 5:
                System.out.println("1 Euro = 3.98 AED");
                System.out.println(amt+" Euro = "+(amt*3.98)+" AED");
                break;

            case 6:
                System.out.println("1 Euro = 169.55 Yen");
                System.out.println(amt+" Euro = "+(amt*169.55)+" Yen");

            default:
                System.out.println("INVALIDE CHOICE");
                break;
        }

    }

    public static void Pound_to_other(double amt){
        int select;
        System.out.println("SELECT WHICH CURRENCY YO WANT TO BE CONVERTED TO:");
        System.out.println("1:USD\n2:Euro\n3:Rupee\n4:Yaun\n5:AED\n6:Yen");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("1 Pound = 1.27 Doller");
                System.out.println(amt+" Pounds" + " =" +(amt*1.27)+" Dollers");
                break;

            case 2:
                System.out.println("1 Pound = 1.18 Euros");
                System.out.println(amt+" Pounds = "+(amt*1.18)+" Euros" );
                break;

            case 3:
                System.out.println("1 Pound = 106.10 Rupee" );
                System.out.println(amt +" Pounds = "+ (amt*106.10)+" Rupee");
                break;

            case 4:
                System.out.println("1 Pound = 9.17 Yuan");
                System.out.println(amt+" Pounds = "+(amt*9.17)+" Yaun");
                break;

            case 5:
                System.out.println("1 Pound = 4.68 AED");
                System.out.println(amt+" Pounds = "+(amt*4.68)+" AED");
                break;

            case 6:
                System.out.println("1 Pound = 199.28 Yen");
                System.out.println(amt+" Pound = "+(amt*199.28)+" Yen");
                break;

            default:
                System.out.println("INVALIDE CHOICE");
                break;
        }

    }

    public static void Yaun_to_other(double amt){
        int select;
        System.out.println("SELECT WHICH CURRENCY YO WANT TO BE CONVERTED TO:");
        System.out.println("1:USD\n2:Euro\n3:Pound\n4:Rupee\n5:AED\n6:Yen");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("1 Yaun = 0.14 Doller");
                System.out.println(amt+" Yaun" + " =" +(amt*0.14)+" Dollers");
                break;

            case 2:
                System.out.println("1 Yaun = 0.13 euros");
                System.out.println(amt+" Yaun = "+(amt*0.13)+" euros" );
                break;

            case 3:
                System.out.println("1 Yaun = 0.11 Pounds" );
                System.out.println(amt +" Yaun = "+ (amt*0.11)+" Pounde");
                break;

            case 4:
                System.out.println("1 Yaun = 11.74 Rupee");
                System.out.println(amt+" Yaun = "+(amt*11.74)+" Rupee");
                break;

            case 5:
                System.out.println("1 Yaun = 0.51 AED");
                System.out.println(amt+" Yaun = "+(amt*0.51)+" AED");
                break;

            case 6:
                System.out.println("1 Yaun = 21.73 Yen");
                System.out.println(amt+" Yaun = "+(amt*21.73)+" Yen");
                break;
            default:
                System.out.println("INVALIDE CHOICE");
                break;
        }

    }

    public static void AED_to_other(double amt){
        int select;
        System.out.println("SELECT WHICH CURRENCY YO WANT TO BE CONVERTED TO:");
        System.out.println("1:USD\n2:Euro\n3:Pound\n4:Yaun\n5:Rupee\n6:Yen");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("1 AED = 0.27 Doller");
                System.out.println(amt+" AED" + " =" +(amt*0.27)+" Dollers");
                break;

            case 2:
                System.out.println("1 AED = 0.25 euros");
                System.out.println(amt+" AED = "+(amt*0.25)+" euros" );
                break;

            case 3:
                System.out.println("1 AED = 0.21 Pounds" );
                System.out.println(amt +" AED = "+ (amt*0.21)+" Pounde");
                break;

            case 4:
                System.out.println("1 AED = 1.96 Yuan");
                System.out.println(amt+" AED = "+(amt*1.96)+" Yaun");
                break;

            case 5:
                System.out.println("1 AED = 22.67 Rupee");
                System.out.println(amt+" AED = "+(amt*22.67)+" Rupee");
                break;
            case 6:
                System.out.println("1 AED = 42.67 Yen");
                System.out.println(amt+" AED = "+(amt*42.67)+" Yen");
                break;

            default:
                System.out.println("INVALIDE CHOICE");
                break;
        }

    }

    public static void Yen_to_other(double amt){
        int select;
        System.out.println("SELECT WHICH CURRENCY YO WANT TO BE CONVERTED TO:");
        System.out.println("1:USD\n2:Euro\n3:Pound\n4:Yaun\n5:AED\n6:Rupee");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("1 Yen = 0.0064 Doller");
                System.out.println(amt+" Yen" + " =" +(amt*0.0064)+" Dollers");
                break;

            case 2:
                System.out.println("1 Yen = 0.0059 euros");
                System.out.println(amt+" Yen = "+(amt*0.0059)+" euros" );
                break;

            case 3:
                System.out.println("1 Yen = 0.0050 Pounds" );
                System.out.println(amt +" Yen = "+ (amt*0.0050)+" Pounde");
                break;

            case 4:
                System.out.println("1 Yen = 0.046 Yuan");
                System.out.println(amt+" Yen = "+(amt*0.046)+" Yaun");
                break;

            case 5:
                System.out.println("1 Yen = 0.023 AED");
                System.out.println(amt+" Yen = "+(amt*0.023)+" AED");
                break;

            case 6:
                System.out.println("1 Yen = 0.53 Rupee");
                System.out.println(amt+" Yen = "+(amt*0.53)+" Rupee");

            default:
                System.out.println("INVALIDE CHOICE");
                break;
        }

    }

}
