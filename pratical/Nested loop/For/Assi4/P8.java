class Main{
    public static void main (String [] ards){
        int x = 10;
        char ch ='J';
        for(int i = 1; i<=4; i++){
            for(int j =1 ; j<=i; j++){
                if(i%2==1){
                    System.out.print(x +" ");
                }else{
                    System.out.print(ch +" ");
                }
                x--;
                ch -=1;
            }
            System.out.println();
        }
    }
}


/*   output

10 
I H 
7 6 5 
D C B A 

*/