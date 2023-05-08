import java.util.Scanner;
class P1{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int size = sc.nextInt();

        int arr[] = new int [size];
        System.out.println("Enter element");

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int sum =0;
        for(int i = 0; i<arr.length; i++){
                sum=sum+arr[i];
            }
            System.out.println("Sum of all element is :" + sum);
        }
    
}