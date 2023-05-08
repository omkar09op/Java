class Main{
    public static void main (String [] args){
        char ch ='J';
        for(int i= 1; i<=4; i++){
            for(int j =1; j<=i; j++){
                    System.out.print(ch+ " ");
                    ch -=1;
                }
                System.out.println();
        }
    }
}

/* output

J 
I H 
G F E 
D C B A 


 */