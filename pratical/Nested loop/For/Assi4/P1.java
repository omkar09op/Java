class Main{
    public static void main (String [] ards){
        int x = 10;
        for(int i = 1; i<=4; i++){
            for(int j =1 ; j<=i; j++){
                    System.out.print("C2W"+x+" ");
                    x--;
                }
                System.out.println();
        }
    }
}



/*   output

C2W10 
C2W9 C2W8 
C2W7 C2W6 C2W5 
C2W4 C2W3 C2W2 C2W1 

*/