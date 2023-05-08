class Main{
    public static void main (String [] ards){
        int N =4;
        char ch = 'A';
        for(int i = 1; i<=N; i++){
            char ch1 = ch;
            for(int j =1 ; j<=N-i+1; j++){
                    System.out.print(ch1 +" ");
                    ch1 +=1;
                }
                ch +=1;
                System.out.println();
        }
    }
}



/*   output

A B C D 
B C D 
C D 
D 


*/