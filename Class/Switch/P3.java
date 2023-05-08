class Main {
    public static void main(String [] args){
        int ch= 65;

        switch (ch) {
            case 'A':
                  System.out.println("char-A");
                  break;
            case 65:
                  System.out.println("Num-65");
                  break;
            case 'B':
                  System.out.println("char-B");
                  break;
            case 66:
                  System.out.println("Num-66");
                  break;
            default:
                break;
        }
    }
}
/*   Here is duplicate case lable as A as value 65 and B as value  66

Output 

Compilation failed due to following error(s).Main.java:9: error: duplicate case label
            case 65:
            ^
Main.java:15: error: duplicate case label
            case 66:
            ^
2 errors

*/
