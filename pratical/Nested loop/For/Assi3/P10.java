class Main{
    public static void main (String [] args){
        int N =4;
        int x=1;
        for(int i= 1; i<=N; i++){
            for(int j =1; j<=N-i+1; j++){
                System.out.print(x+ " ");
                x++;
                }
                x--;
                System.out.println();
        }
    }
}

/* output

1 2 3 4 
4 5 6 
6 7 
7 



 */