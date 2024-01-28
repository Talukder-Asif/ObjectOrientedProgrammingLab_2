import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        EvenOdd Obj = new EvenOdd();
        Problem2 Objii = new Problem2();
        isPrime Obj3 = new isPrime();
        TwoSum Obj4 = new TwoSum();
        Scanner sc = new Scanner(System.in);
        System.out.print("How  many test do you want - ");
        int x = sc.nextInt();
        Obj.isEvenOdd(x);
        Objii.methood();
        Obj3.methood();
        Obj4.methood();
    }
}