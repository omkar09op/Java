// Even number count

import java.util.Scanner;
class P1{
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);

        System.out.println("Enter array size");
        int size =sc.nextInt();

        int arr[]= new int [size];
        System.out.println("Enter Element");
        int count =0;

        for( int i=0; i<arr.length; i++){
            arr[i] =sc.nextInt();

            if(arr[i]%2==0){
                count++;
            }
       }
       System.out.println("Even number count is: "+count);
    }
}