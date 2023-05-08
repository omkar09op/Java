class Main{
    public static void main (String [] args){
        int x=1;
        for(int i= 1; i<=3; i++){
            for(int j =1; j<=i; j++){
                int num = x*x*x;
                System.out.print(num+ " ");
                x++;
                }
                System.out.println();
        }
    }
}

/* output

1 
8 27 
64 125 216 



 */