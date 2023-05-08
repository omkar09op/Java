class Main {
    public static void main(String [] args){
        String str ="Mon";
        switch (str) {
            case "Mon":
                System.out.println("Monday");
                break;
            case "Tue":
                System.out.println("Tuesday");
                break;
        
            default:
                System.out.println("It's sunday");
                break;
        }              
    }
}

/*   here java version is grater than 1.6 which allow to put string into switch case 
     

Output 

Monday


*/
