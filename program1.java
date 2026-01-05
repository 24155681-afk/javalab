import java.util.Scanner;
public class program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        System.out.println("Enter your roll no:");
        String ROLL=sc.nextLine();
        System.out.println("Enter your section: ");
        String sec = sc.nextLine();
        System.out.println("Enter your branch:");
        String branch = sc.nextLine();
        System.out.println("Your name is :"+name);
        System.out.println("Your roll no is:"+ROLL);
        System.out.println("your section is:"+sec);
        System.out.println("your branch is :"+branch);


    }
}
