class Main{
    public static void main(String[]args){
        for(int i =1; i<=4; i++){
            int x=i;
            for(int j =1; j<=4; j++){
                System.out.print(x++ +13+" ");
            }
            System.out.println( );
        }
    }
}
/* output

14 15 16 17 
15 16 17 18 
16 17 18 19 
17 18 19 20  

*/