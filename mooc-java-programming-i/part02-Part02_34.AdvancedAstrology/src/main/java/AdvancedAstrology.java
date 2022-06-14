
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i=0; i<number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i=0; i<number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i=1; i<=size; i++){
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int j = 0;
        for (int i=0; i<height; i++){
            j = i*2+1;
            printSpaces(height -i-1);
            printStars(j);
            //printSpaces(height/2 -j);
        }
        
        //System.out.println(j);
        
        //int jum = height/2;

        printSpaces(j/2 -1);
        printStars(3);
        printSpaces(j/2 -1);
        printStars(3);
       
    
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
