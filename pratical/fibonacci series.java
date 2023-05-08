import java.util.Scanner;  
class Fibo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter the limit: "); 
        int X=in.nextInt(); 
        int a=0;
        int b=1;
        while(X>=0){
            System.out.println(a);

            int c=a+b;
             a=b;
             b=c;
             X--;
        }
    }
}