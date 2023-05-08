class Main {
    public static void main(String [] args){
        int x= 3;

        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 5:
                System.out.println("First-5");
                break;
            case 5:
                System.out.println("Second-5");
                break;
            case 2:
                System.out.println("Second-2");
                 break; 
            default:
                System.out.println("No match");
                 break;               
        }
        System.out.println("After Switch");
    }
}
/*   Switch statement with using break(it goes till deafalt after true case )
     but their is duplicate case which is not allow in switch case 

Output 

Compilation failed due to following error(s).Main.java:15: error: duplicate case label
            case 5:
            ^
Main.java:18: error: duplicate case label
            case 2:
            ^
2 errors

*/
