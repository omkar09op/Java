class Main{
    public static void main (String [] ards){
        int N =4;
        int x = 1;
        for(int i = 1; i<=N; i++){
            int z =x;
            for(int j =1 ; j<=N-i+1; j++){
                    System.out.print(z +" ");
                    z++;
                }
                x++;
                System.out.println();
        }
    }
}



/*   output

1 2 3 4 
2 3 4 
3 4 
4 

*/