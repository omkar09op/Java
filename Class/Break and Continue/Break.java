import java.util.Scanner;
class Main{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter limit: "); 
        int N=in.nextInt();
        int count =0;

        for(int i =1; i<=N; i++){
            if(N%i==0){
               count++;
            }
            if(count>2){
                break;
            }
        }
        if(count==2){
            System.out.println(N+" is prime number");
        }else{
            System.out.println(N+" is not prime number");
        }
    }
}
