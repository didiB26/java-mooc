/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author didiBalasic
 */
public class SaveableDictionary {

    private Map<String, String> dict;
    private Map<String, String> dict2;
    private String file;

    public SaveableDictionary() {
        this.dict = new HashMap<>();
        this.dict2 = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dict = new HashMap<>();
        this.dict2 = new HashMap<>();
        this.file = file;

    }

    public void add(String words, String translation) {
        String a = words;
        String b = translation;
        this.dict2.putIfAbsent(b, a);
        this.dict.putIfAbsent(a, b);

    }

    public void printD() {
        System.out.println("====dic1====");
        for (String x : this.dict.keySet()) {
            System.out.println(x + " : " + this.dict.get(x));
        }
        System.out.println("====dic2====");
        for (String y : this.dict2.keySet()) {
            System.out.println(y + " : " + this.dict2.get(y));
        }
    }

    public String translate(String word) {
        String returnString = "";
        if (!this.dict.containsKey(word) || !this.dict2.containsKey(word)) {
            returnString = null;
        }

        /*
        if (!this.dict.containsValue(word)){
            return null;
        }
         */
        for (String x : this.dict.keySet()) {
            if (word.equals(x)) {
                returnString = this.dict.get(x);
            }
        }

        for (String x : this.dict2.keySet()) {
            if (word.equals(x)) {
                returnString = this.dict2.get(x);
            }
        }
        return returnString;

    }

    public void delete(String word) {
        if (dict.containsKey(word)) {
            //System.out.println("caut cuv in dic1 " + word);
            String gasit = dict.get(word);
            //System.out.println("l-am gasit oare? " + gasit);
            dict2.remove(gasit);
            dict.remove(word);

        }

        if (dict2.containsKey(word)) {
            //System.out.println("caut cuv in dic2 " + word);
            String gasit = dict2.get(word);
            //System.out.println("l-am gasit oare? " + gasit);
            dict.remove(gasit);
            dict2.remove(word);

        }
    }

    public boolean load() {
        boolean returnB = false;
        try ( Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                //System.out.println(parts[0].trim());     // part of line before :
                //System.out.println(parts[1].trim()); 
                add(parts[0].trim(), parts[1].trim());

                returnB = true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            returnB = false;
        }
        return returnB;
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String key : this.dict.keySet()) {
                writer.println(key + ":" + this.dict.get(key));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("file not found" + e.getLocalizedMessage());
            return false;
        }

    }
}


