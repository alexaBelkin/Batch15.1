package MapPractice;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {
        Hashtable<String,Integer> table=new Hashtable<>();
        table.put("Rose",3);
        table.put("Daisy",5);
        table.put("Sunflower",10);
        table.put("Tulip",9);
        System.out.println(table);
        System.out.println(table.get("Tulip"));
        System.out.println(table.values());//all values
        System.out.println(table.keySet());
        System.out.println(table.entrySet());

        //table.put(null,18); NullPointException--->HashTable doesn't allow NULL keys
        //table.put("Orchird",null); //NullPointException--->HashTable doesn't allow NULL values




    }
}
