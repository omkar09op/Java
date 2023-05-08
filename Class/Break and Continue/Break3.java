import java.util.Scanner;
class Main{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter limit: "); 
        int N=in.nextInt();

        for(int i =1; i<=N; i++){
            if(i%3==0 && i%5==0){
                break;
            }
            System.out.println(i);
        }
    }
}

