import java .io.*;
class P2{
    public static void main (String [] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the  size :");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.println("Enter the element in array :");

        for(int i =0; i<arr.length; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("Reverse numbers are : ");
        for(int i =0; i<arr.length; i++){
            int rev =0;
            int x=arr[i];
            while(x!=0){
                int rem =x%10;
                rev =rev*10+rem;
                x=x/10;
            }
            
            System.out.println(rev );
        }
    }
}