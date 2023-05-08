class Main{
    public static void main (String [] args){
        char ch ='F';
        for(int i= 1; i<=6; i++){
            char ch1 =ch;
            for(int j =1; j<=i; j++){
                    System.out.print(ch1+ " ");
                    ch1 +=1;
                }
                ch -=1;
                System.out.println();
        }
    }
}

/* output

F 
E F 
D E F 
C D E F 
B C D E F 
A B C D E F 


 */