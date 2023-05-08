import java .io.*;
class P1{
    public static void main (String [] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the  size :");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.println("Enter the element in array :");

        for(int i =0; i<arr.length; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Count of digit in numbers : ");
        for(int i =0; i<arr.length; i++){
            int count =0;
            int x=arr[i];
            while(x!=0){
                count++;
                x=x/10;
            }
            
            System.out.println(arr[i] +" is "+count );
        }
    }
}