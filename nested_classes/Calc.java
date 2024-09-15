import java.util.Scanner;
public class Calc {

    static class Fac{

        public int factorial(int num){
            if(num>1){
                return num * factorial(num-1);
            }else{
                return 1;
            }
        }
    }

    public static void main(String args[]){
        Fac f = new Calc.Fac();
        System.out.print("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        number =  (int) number;

        System.out.println(f.factorial(number));;
    }
}
