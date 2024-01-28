public class Problem2 {
    public void methood(){
        for(int k = 0, i = 1000; i>=1; i--){
           System.out.print(i + "\t");
           k++;
           if(k%5 == 0){
               System.out.println("");
           }
        }
    }
}
