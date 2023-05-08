import java.util.Scanner;
class P4{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int size = sc.nextInt();

        int arr[] = new int [size];
        System.out.println("Enter element");

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter element to find it's index:");
        int x = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.println("Element found at index :"+ i);
            }
        }
    }        
}