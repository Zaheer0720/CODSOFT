import java.util.*;
import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[]args){
        int subs; 
        float m1,m2,sci,soc,eng,lang;
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter then name of the student");
        name = scanner.nextLine();
        System.out.println("enter the number of subjects attended by the student");
        subs = scanner.nextInt();
        if (subs == 6){
            System.out.println("Enter the marks of the subjects");
            m1 = scanner.nextInt();
            m2 = scanner.nextInt();
            sci = scanner.nextInt();
            soc = scanner.nextInt();
            lang = scanner.nextInt();

            float total = m1+m2+sci+soc+lang;
            float b = total/600;
            float percent = b*100;
            System.out.println("The marks scored by "+ name+ "are ");
            System.out.println("MATHS 1  : "+m1 );
            System.out.println("MATHS 2  : "+m2 );
            System.out.println("SCIENCE  : "+sci );
            System.out.println("SOCIAL   : "+soc );
            System.out.println("LANGUAGE : "+lang);
            System.out.println("  ");
            System.out.println("TOTAL MARKS : "+ total);
            System.out.println("PECRCENTAGE : "+ percent);

            if (percent<=100 && percent>=90){
                System.out.println("GRADE : S\n PASS");
            }else if (percent<=89 && percent>=80){
                System.out.println("GRADE : A\n PASS");
            }else if (percent<=79 && percent>=70){
                System.out.println("GRADE : B\n PASS");
            }else if (percent<=69 && percent>=60){
                System.out.println("GRADE : C\n PASS");
            }else if (percent<=59 && percent>=50){
                System.out.println("GRADE : D\n PASS");
            }else {
                System.out.println("GRADE : F\n FAIL");
            }




        }else if (subs<6){
            int abs = 6-subs ;
            System.out.println("Student "+name+" was absent for "+abs+" subjects");
        }else {
            System.out.println("the number of subjects entered is wrong please check ");

        }



    }
}
