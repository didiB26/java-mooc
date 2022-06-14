
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        System.out.print("File to read: ");
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> read = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();//cooking time in all arays

        String fileToRead = scanner.nextLine();

        try ( Scanner sc = new Scanner(Paths.get(fileToRead))) 
//Scanner sc = new Scanner(Paths.get("recipes.txt"))) 
        {
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                read.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String r : read) {
            //System.out.println(r);
            //index pt timp
            int j;
            if (isInteger(r)) {
                //indice unde am timpul
                j = read.indexOf(r);
                indices.add(j);
                //System.out.println(j);
                //recipes.add(new Recipe(read.get(j-1), Integer.valueOf(read.get(j)), read.subList(j+1, x)))
            }
        }

        // split and group recipes
        for (int i = 0; i < indices.size() - 1; i++) {

            int time = Integer.valueOf(read.get(indices.get(i)));
            String name = read.get(indices.get(i) - 1);

            recipes.add(new Recipe(name, time, read.subList(indices.get(i) + 1, indices.get(i + 1) - 1)));
        }

        int j = indices.size() - 1;
        int time = Integer.valueOf(read.get(indices.get(j)));
        String name = read.get(indices.get(j) - 1);

        recipes.add(new Recipe(name, time, read.subList(indices.get(j) + 1, read.size())));
        /*
        for (Recipe r : recipes){
            System.out.println(r);
        }
         */

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        // accept command from user and execute command
        //Scanner user = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command: ");
            
            String command = scanner.nextLine();

            // command "stop" implementation 
            if (command.equals("stop")) {
                break;
            }

            // command "list" implementation
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    System.out.println(r);
                }
                System.out.println("");
            }
            // command "find name" implementation
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String search = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getName().contains(search)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            // command "find cooking time" implementation
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getTime() <= maxTime) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }

            // command "find ingredient" implementation
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getIngredients().contains(ingredient)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
        }
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
