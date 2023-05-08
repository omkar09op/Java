class Main{
    public static void main(String[]args){
        int x =1;
        char ch1 ='A';
        char ch2 = 'b';
        for(int i =1; i<=4; i++){
            for(int j =1; j<=4; j++){
                if(x%2==0){
                    System.out.print(ch2 +"  ");
                    ch2 +=2;
                }else{
                    System.out.print(ch1 +"  ");
                    ch1 +=2;
                }
                x++;
            }
            System.out.println( );
        }
    }
}
/* output

A  b  C  d  
E  f  G  h  
I  j  K  l  
M  n  O  p  

*/