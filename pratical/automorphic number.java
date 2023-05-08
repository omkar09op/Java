import java.util.Scanner;  
class Automorphic number{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a number to check: "); 
        int x=in.nextInt(); 
        int temp= x;
        int count =0;
        int N= x*x;
        int rev =0;
        int rev1=0;
        
        while(x!=0){
            count=count +1;
            x=x/10;
        }
        for(int i=1; i<=count; i++){
            int a= N%10;
            rev = rev*10+a;
            N=N/10;
        }
        while(rev!=0){
            int b =rev%10;
            rev1 = rev1*10+b;
            rev = rev/10;
        }
        if(rev1==temp){
            System.out.println("It is Automorphic");
        }
        else{
            System.out.println("It is not Automorphic"); 
            }
    }
}