import java.util.Scanner;
class P8{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int size = sc.nextInt();

        int arr1[] = new int [size];
        System.out.println("Enter element of array 1 :");

        for(int i=0; i<arr1.length; i++){
            arr1[i]= sc.nextInt();
        }

        int arr2[] = new int [size];
        System.out.println("Enter element of array 2 :");

        for(int i=0; i<arr2.length; i++){
            arr2[i]= sc.nextInt();
        }

        System.out.println("Uncomman element in given 2 array is :" );

        for (int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }        
}