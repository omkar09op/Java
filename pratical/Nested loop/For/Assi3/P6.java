class Main{
    public static void main (String [] args){
        for(int i= 1; i<=4; i++){
            int x=9;
            for(int j =1; j<=i; j++){
                if(j%2==1){
                    System.out.print(x+" ");
                }else{
                    System.out.print(x+ " ");
                }
                x--;
            }
            System.out.println();
        }
    }
}

/* output

9 
9 8 
9 8 7 
9 8 7 6 


 */