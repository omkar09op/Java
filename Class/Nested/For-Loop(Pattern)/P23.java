class Main{
    public static void main(String[] args){
        int N =4;
        int x =1;
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N-i+1; j++){
                    int num = x*x;
                    if (j%2==1){
                        System.out.print(x +"  ");
                        
                    }else{
                        System.out.print(num +" ");
                    }
                    x++;
                }

            System.out.println();
        }
    }
}

/*Output

1  4 3  16 
5  36 7  
8  81 
10 

*/


