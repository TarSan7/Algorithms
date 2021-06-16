// 2. Organize a hash table with open addressing using the search method
// and key inserts. To generate a hash address, use the hash function obtained
// multiplication method and linear ordering procedure to resolve the collision.
public class Main {
    public static void main(String[] args) {
        HashTable myTbl = new HashTable(10);
        myTbl.add(86, "One");
        myTbl.add(1, "Two");
        myTbl.add(3, "Three");
        myTbl.add(349, "Four");

        myTbl.show();

        myTbl.add(86, "Five");
        myTbl.add(35, "Six");

        myTbl.show();

    }
}
