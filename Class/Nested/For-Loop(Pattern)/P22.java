class Main{
    public static void main(String[] args){
        int N =4;
        int x =1;
        char ch = 'A';
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N-i+1; j++){
                    if (j%2==1){
                        System.out.print(ch+"  ");
                        ch +=1;
                    }else{
                        System.out.print(x +" ");
                        x++;
                    }
                }

            System.out.println();
        }
    }
}

/*Output

A  1 B  2 
C  3 D  
E  4 
F  

*/


