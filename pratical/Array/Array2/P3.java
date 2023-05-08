import java.util.Scanner;
class P3{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int size = sc.nextInt();

        int arr[] = new int [size];
        System.out.println("Enter element");

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int sum1 =0, sum2=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum1 =sum1 +arr[i];
            }
            else{
                sum2 =sum2 +arr[i];
            }
        }
            System.out.println("Even element sum is :"+ sum1);
            System.out.println("Odd element sum is :"+sum2);

        }
}