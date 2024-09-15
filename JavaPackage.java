import java.util.Scanner;
public class JavaPackage{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String username = obj.nextLine();
        System.out.println(username);
    }
}