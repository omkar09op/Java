class Main{
    public static void main (String [] ards){
        int x = 1;
        char ch = 'F';
        for(int i = 1; i<=6; i++){
            char ch1 =ch;
            for(int j =1 ; j<=i; j++){
                if(j%2==1){
                    System.out.print(ch1 +" ");
                    ch1 +=1;
                }else{
                    System.out.print(x +" ");
                    x++;
                }
            }
            ch -=1;
            System.out.println();
        }
    }
}


/*   output

F 
E 1 
D 2 E 
C 3 D 4 
B 5 C 6 D 
A 7 B 8 C 9 

*/