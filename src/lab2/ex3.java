package lab2;

public class ex3 {

    public static void main(String[] args) {
        //if-else-if
        //simple Grade Calculator
        //F=0-49, D=50-59, C=60-69, B=70-79, A=80-100
        int score = 110;
        if (score >=0 && score <=49)
            System.out.println("Grade F.");
        else if (score >=50 && score <=59)
            System.out.println("Grade D.");
        else if (score >=60 && score <=69)
            System.out.println("Grade C.");
        else if (score >=70 && score <=79)
            System.out.println("Grade B.");
        else if (score >=80 && score <=100)
            System.out.println("Grade A.");
        else
            System.out.println("Invalid Score.");



    }//main


}//class
