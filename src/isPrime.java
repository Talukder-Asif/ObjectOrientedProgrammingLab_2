import java.util.Scanner;
public class isPrime {
public void methood(){
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.print("enter the starting point - ");
        int n1 = sc.nextInt();
        System.out.print("enter the ending point - ");
        int n2 = sc.nextInt();

        for(i = n1; i <= n2; i++){
            boolean flag = true;
            for (j =2; j<i; j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }if(flag && i>1){
                System.out.print(i+ "\t");
            }
        }
    }

}
