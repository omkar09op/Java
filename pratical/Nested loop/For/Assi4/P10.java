class Main{
    public static void main (String [] ards){
        int x = 1;
        for(int i = 1; i<=4; i++){
            int z = x;
            for(int j =1 ; j<=i; j++){
                if(z%2==1){
                    int num =z*z;
                    System.out.print(num +" ");
                }else{
                    int num1 =z*z*z;
                    System.out.print(num1 +" ");
                }
                z++;
            }
            x++;
            System.out.println();
        }
    }
}


/*   output

1 
8 9 
9 64 25 
64 25 216 49 

*/