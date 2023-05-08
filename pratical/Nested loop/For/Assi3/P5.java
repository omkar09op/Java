class Main{
    public static void main (String [] args){
        int x =10;
        int N =4;
        for(int i= 1; i<=N; i++){
            for(int j =1; j<=N-i+1; j++){
                System.out.print(x +" ");
            }
            x++;
            System.out.println();
        }
    }
}

/* output

10 10 10 10 
11 11 11 
12 12 
13


 */