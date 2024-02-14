package com.edubridge.generic;
class Dictionary<K,V>{
	K key;
	V value;
	void print(K key,V value) {
		this.key = key;
		this.value = value;
		System.out.println(this.key+" "+this.value);
	}
}
public class GenericClassUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary<Character,String> word1 = new Dictionary<>();
		word1.print('h', "hippopotomous");
		
		Dictionary<Integer,String> word13 = new Dictionary<>();
		word13.print(34, "thirty four");
	}

}
