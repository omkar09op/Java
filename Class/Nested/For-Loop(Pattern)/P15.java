class Main{
    public static void main(String[] args){
        int num = 10;
            for(int i=1; i<=4; i++){
                for(int j=1; j<=i; j++){
            System.out.print(num +" ");
            num -= 1;
        }
        System.out.println();
    }
}
}
                

/*Output

10 
9 8 
7 6 5 
4 3 2 1 



*/