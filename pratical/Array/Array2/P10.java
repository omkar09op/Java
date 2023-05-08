import java.util.Scanner;
class P10{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size:");
        int size = sc.nextInt();

        int arr[] = new int [size];
        System.out.println("Enter element of array:");

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int sum =0;

        System.out.println("Element whose addition of didits is even are :");

        for(int i =0; i<arr.length; i++){
            int x =arr[i];
            while (x!=0){

                int rem =x%10;
                sum =sum + rem ;
                x = x/10;
            }
            if (sum%2==0){
                System.out.println(arr[i]);
            }
            sum= 0;
        }
      
    }
}

