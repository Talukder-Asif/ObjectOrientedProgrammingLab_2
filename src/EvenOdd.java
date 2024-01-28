import java.util.Scanner;
public class EvenOdd {
    void isEvenOdd(int n){
        Scanner sc = new Scanner(System.in);
        for (int x, i = 0; i< n; i++){
            x = sc.nextInt();
            if(x%2 == 0){
                System.out.println(x + " is a Even number");
            }else{
                System.out.println(x + " is an Odd number");
            }
        }
    }
}
