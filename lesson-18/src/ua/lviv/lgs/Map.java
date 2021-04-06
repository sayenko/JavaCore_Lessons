package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Map<K, V> {
	
	private int capacity = 16;

    private MyEntry<K, V>[] table; 

    public Map(){
        table = new MyEntry[capacity];
    }

    public Map(int capacity){
        this.capacity = capacity;
        table = new MyEntry[capacity];
    }
    
    public void put(K key, V value){
        int index = index(key);
        MyEntry newEntry = new MyEntry(key, value, null);
        if(table[index] == null){
            table[index] = newEntry;
        }else {
        	MyEntry<K, V> previousNode = null;
        	MyEntry<K, V> currentNode = table[index];
            while(currentNode != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null)
                previousNode.setNext(newEntry);
            }
    }
    
    public V get(K key){
        V value = null;
        int index = index(key);
        MyEntry<K, V> entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }
    
    public void removeByKey(K key){
        int index = index(key);
        MyEntry previous = null;
        MyEntry entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(key)){
                if(previous == null){
                    entry = entry.getNext();
                    table[index] = entry;
                    return;
                }else {
                    previous.setNext(entry.getNext());
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();
        }
    }
    
    public void removeByValue(V value){
    	for(int i = 0; i < capacity; i++){
            if(table[i] != null){
            	MyEntry previous = null;
            	MyEntry entry = table[i];
            	while (entry != null){
            		if(entry.getValue().equals(value)){
            			if(previous == null){
            				entry = entry.getNext();
            				table[i] = entry;
            				continue;
            			}else {
            				previous.setNext(entry.getNext());
            				continue;
            			}
            		}
            		previous = entry;
            		if (entry != null) {
            			entry = entry.getNext();
            			int u = 0;
            		}
        		}
            }
    	}
    }
    
    public void displayKeys(){
    	Set<K> set = new HashSet();
        for(int i = 0; i < capacity; i++){
            if(table[i] != null){
            	MyEntry<K, V> currentNode = table[i];
                while (currentNode != null){
                	set.add(currentNode.getKey());
                    currentNode = currentNode.getNext();
                }
            }
        }
        System.out.println(set);
    }
    
    public void displayValues(){
    	List<V> set = new ArrayList<>();
        for(int i = 0; i < capacity; i++){
            if(table[i] != null){
            	MyEntry<K, V> currentNode = table[i];
                while (currentNode != null){
                	set.add(currentNode.getValue());
                    currentNode = currentNode.getNext();
                }
            }
        }
        System.out.println(set);
    }
    
    public void displayMap(){
        for(int i = 0; i < capacity; i++){
            if(table[i] != null){
            	MyEntry<K, V> currentNode = table[i];
                while (currentNode != null){
                	System.out.println("Key = " + currentNode.getKey() + ", Value = " + currentNode.getValue());
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    private int index(K key){
        if(key == null){
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }
	
}
