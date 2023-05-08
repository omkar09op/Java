class Main{
    public static void main(String[] args){
        int N =4;
        int x =1;
        char ch ='a';
            for(int i=1; i<=N; i++){
                for(int j=1; j<=i; j++){
                    if (j%2==1){
                        System.out.print(x +"  ");

                    }else{
                        System.out.print(ch +" ");
                    }
                    ch +=1;
                    x++;
                }

            System.out.println();
        }
    }
}

/*Output

1  
2  c 
4  e 6  
7  h 9  j

*/


