import java.util.Scanner;  
class Strongnumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter the Number: "); 
        int X=in.nextInt(); 
        int temp =X;
        int sum=0;

        while(X!=0){
            int rem =X%10;
            int fact;

            for(inti=1;  i<=rem; i++){
                fact=fact*i;
            }

            sum=sum+fact;
            X=X/10;
        }
        if(sum== temp){
            System.out.println("It is Strong Number");
        }else{
            System.out.println("It is not Strong Number");
        }
        
        
    }
}