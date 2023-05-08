class Main{
    public static void main(String[] args){
        int N =4;
            for(int i=1; i<=N; i++){
                char ch ='A';
                for(int j=1; j<=N-i+1; j++){
            System.out.print(ch +" ");
            ch +=1;
        }
        System.out.println();
    }
}
}
                

/*Output

A B C D 
A B C 
A B 
A 

*/


