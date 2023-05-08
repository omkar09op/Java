import java.util.Scanner;
class P5{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int size = sc.nextInt();

        int arr[] = new int [size];
        System.out.println("Enter element");

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The element divisible by 5 in given array are:");

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%5==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}