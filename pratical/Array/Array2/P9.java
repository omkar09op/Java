import java.util.Scanner;
class P9{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size of array 1 :");
        int size1 = sc.nextInt();

        int arr1[] = new int [size1];
        System.out.println("Enter element of array 1 :");

        for(int i=0; i<arr1.length; i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter array Size of array 2 :");
        int size2 = sc.nextInt();

        int arr2[] = new int [size2];
        System.out.println("Enter element of array 2 :");

        for(int i=0; i<arr2.length; i++){
            arr2[i]= sc.nextInt();
        }

        int arr3[] = new int[size1 + size2];
        for(int i=0; i<arr1.length; i++){
            arr3[i]=arr1[i];
        }

        for(int i=0; i<arr2.length; i++){
            arr3[size1+i]=arr2[i];
        }


        System.out.println("Merged array is :" );

        for (int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }
}

