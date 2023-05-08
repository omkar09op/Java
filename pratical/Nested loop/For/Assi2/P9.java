class Main{
    public static void main (String[] args){
         int x =1;
         for (int i = 1; i <= 3; i++){
            int z= 3;
            char ch ='C';
            for(int j = 1; j<=3; j++){
                int y =x*x;
                System.out.print(y+""+ch+""+z +" ");
                x++;
                z--;
                ch -=1;
            }
            System.out.println();
        }
    }
}
                
/*output   

1C3 4B2 9A1 
16C3 25B2 36A1 
49C3 64B2 81A1 
 */