import java.util.* ;

//HashTables - a data structure in which the data is stored in pairs of key and value
//for example - a key might be an integer whre the value might be a string
//fast insertion deletion of key values but not ideal for small data sets
// great for small data sets

//hashing - takes the key and computes a hash for it
// the value will vary based on the formula and formula will vary based on data structures
//keyHashcode % capacity = index

//index/bucket - an indexed storage location for one or more entities
//in case of collision, a bucket can be considered as a linked list

//runtime complexity - worstcase -> O(n) bestcase -> O(1)

public class HashTables {
    public static void main(String[] args){
        //defining a hash table using the Hashtable clss inn java
    
        Hashtable<Integer, String> student = new Hashtable<>(10, 0.5f);

        //adding values to our hash table using the put method

        student.put(101, " SpongeBob");
        student.put(123, " SquidWard");
        student.put(332, " Sandie");
        student.put(459, " Patrick");
        student.put(445, " Gary");

        //printing a value usinng the get method and it's key
        System.out.println(student.get(101) + " was removed"); //SpongeBob

        //removing elements from our hash tables
        student.remove(101);

        //printing all the elements from our hash table using the for loop
        for(int key : student.keySet()){
            System.out.println( key + "\t" + student.get(key)); //the keySet method will return the or access the keys of our hash table
        }

        //we can access the hash code of a key using the hashCode method


    }
}
