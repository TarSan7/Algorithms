import java.util.ArrayList;

public class HashTable {
    private ArrayList<Element> table;
    private int counter;
    private int size;

    public HashTable(int size){
        this.size = size;
        this.counter = 0;
        table = new ArrayList<>(size);
        for(int i = 0; i < size; i++){
            table.add(null);
        }
    }

    public void add(int key, String value){
        int hash = hashFunc(key);
        if(table.get(hash) == null){
            table.set(hash, new Element(key, value));
            counter++;
        } else {
            if(counter < size){
                while (table.get(hash) != null){
                    hash++;
                    hash %= size;
                }
                table.set(hash, new Element(key, value));
                counter++;
            }
        }
        if(counter >= size / 2){
            increase();
        }
    }

    public void increase(){
        ArrayList<Element> t = table;
        size *= 2;
        counter = 0;
        table = new ArrayList<>(size);
        for(int i = 0; i < size; i++){
            table.add(null);
        }
        for(int i = 0; i < size / 2; i++){
            if(t.get(i) != null){
                add(t.get(i).getKey(), t.get(i).getValue());
            }
        }
    }

    public void getElement(int key){
        int hash = hashFunc(key);
        while(table.get(hash) != null){
            if(table.get(hash).getKey() == key){
                System.out.println("Element: " + table.get(hash).getValue());
                return;
            } else {
                hash++;
                hash %= size;
            }
        }
        System.out.println("No such elements.");
    }

    public void show(){
        for (int i = 0; i < size; i++){
            if(table.get(i) != null)
                System.out.println("[" + i + "]: " + table.get(i).getKey() + " " + table.get(i).getValue());
        }
        System.out.println();
    }

    public int hashFunc(int key){
        return (int)(size * (key * 0.618033 % 1)) % size;
    }

}

class Element{
    private int key;
    private String value;

    Element(int key, String value){
        this.key = key;
        this.value = value;
    }

    public int getKey(){
        return this.key;
    }

    public String getValue() {
        return value;
    }

    public void setElem(int key, String value) {
        this.key = key;
        this.value = value;
    }

}