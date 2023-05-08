import java.util.Scanner;
class P2{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int size = sc.nextInt();

        int arr[] = new int [size];
        System.out.println("Enter element");

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int mult =1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                mult=mult*arr[i];
            }
        }
        System.out.println("Product of even element is :" + mult);
    }
}