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
        int count1 =0, count2=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                count1++;
            }
            else{
                count2++;
            }
        }
            System.out.println("Number of Even element is :"+ count1);
            System.out.println("Number of Odd element is :"+count2);

        }
}