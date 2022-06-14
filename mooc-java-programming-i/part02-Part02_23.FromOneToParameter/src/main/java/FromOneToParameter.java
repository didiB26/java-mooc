

public class FromOneToParameter {

    public static void main(String[] args) {
        
        printUntilNumber(5);
    }

    public static void printUntilNumber(int x) {
        int i = 1;
        while (i <= x) {
            System.out.println(i);
            i++;
        }
    }
}
