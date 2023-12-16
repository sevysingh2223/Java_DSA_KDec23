package Function;

class SolidSquare {

    static void printStar(int startCol , int endCol){
        for(int j=startCol;j<=endCol;j++){
                System.out.print("* ");
            }
    }

    static void printPattern(int startRow , int endrow){
        for(int i = startRow ; i<=endrow;i++){
            printStar(1 , endrow);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printPattern(1 , n);
    }
    
}