class Main{
    public static void main (String [] ards){
        int x = 1;
        for(int i = 1; i<=4; i++){
            int z =x;
            for(int j =1 ; j<=i; j++){
                    System.out.print(z +" ");
                    z++;
                }
                x++;
                System.out.println();
        }
    }
}



/*   output

1 
2 3 
3 4 5 
4 5 6 7 

*/