import java.util.Scanner;

public class program2 {
    public static void main(String[] args){
        System.out.println("Enter your marks:");
        Scanner sc = new Scanner(System.in);
        int marks =sc.nextInt();
        if(marks>=90) {
            System.out.println("your grade is O");
        }
        else if(marks>=80){
            System.out.println("your grade is E");
        }  else if(marks>=70){
            System.out.println("your grade is  A");
        }  else if(marks>=60){
            System.out.println("your grade is B");
        }  else if(marks>=50){
            System.out.println("your grade is C");
        }else if(marks>=40){
            System.out.println("your grade is D");
        }else if(marks>=0){
            System.out.println("your grade is F");
        }
        else {
            System.out.println("invalid marks");
        }

    }
}
