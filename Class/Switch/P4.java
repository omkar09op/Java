class Main {
    public static void main(String [] args){
        int x= 3;
        int a =1;
        int b =2;

        switch (x) {
            case a:
                System.out.println("1");
                break;
            case b:
                System.out.println("2");
                break;
            case a+b:
                System.out.println("3");
                break;
            case a+a+b:
                System.out.println("4");
                break;
            case a+b+b:
                System.out.println("5");
                 break; 
            default:
                System.out.println("Invalid");
                 break;               
        }
    }
}
/*   here case value is not fix it depends on variable a and b 
    gives error for constant expersion requried
Output 

Compilation failed due to following error(s).Main.java:8: error: constant expression required
            case a:
                 ^
Main.java:11: error: constant expression required
            case b:
                 ^
Main.java:14: error: constant expression required
            case a+b:
                  ^
Main.java:17: error: constant expression required
            case a+a+b:
                    ^
Main.java:20: error: constant expression required
            case a+b+b:
                    ^
5 errors

*/
