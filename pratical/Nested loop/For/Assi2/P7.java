class Main{
    public static void main (String[] args){
        for (int i = 1; i <= 3; i++){
            int x =1;
            char ch ='A';
            for(int j = 1; j<=3; j++){
                System.out.print(j+""+ch+" ");
                ch +=1;
                
            }
            System.out.println();
        }
    }
}
                
/* output

1  2  9  
4  25  6  
49  8  81  

*/