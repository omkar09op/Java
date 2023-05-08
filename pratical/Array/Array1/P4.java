import java.util.Scanner;
class P4{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
        int size = sc.nextInt();

        char arr[] = new char [size];
        System.out.println("Enter element");

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.next().charAt(0);
        }
        System.out.println("The vowels are :");

        for(int i = 0; i<arr.length; i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||
            arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                System.out.print(arr[i]+" ");
            }
        }
    }
}