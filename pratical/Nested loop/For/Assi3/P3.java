class Main{
    public static void main (String [] args){
        int x = 10;
        for(int i= 1; i<=4; i++){
            for(int j =1; j<=i; j++){
                System.out.print(x +" ");
                x--;
            }
            System.out.println();
        }
    }
}

/* output

10 
9 8 
7 6 5 
4 3 2 1 


 */