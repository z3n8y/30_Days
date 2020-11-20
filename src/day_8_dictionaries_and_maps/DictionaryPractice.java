package day_8_dictionaries_and_maps;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	
	
	
	public static void main(String[] args) {
		// English to Spanish Dictionary
		//key: value  <-- Map
		Map<String,String> englSpanDictionary = new HashMap<String,String>();
		
		//Inserting into dictionary
		englSpanDictionary.put("Monday", "Lunes");
		englSpanDictionary.put("Tuesday", "Martes");
		englSpanDictionary.put("Wednesday", "Miercoles");
		englSpanDictionary.put("Thursday", "Jueves");
		englSpanDictionary.put("Friday", "Viernes");
		englSpanDictionary.put("Saturday", "Sabado");
		englSpanDictionary.put("Sunday", "Domingo");
		
		
		//Retrieve from dictionary
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));
		System.out.println(englSpanDictionary.get("Wednesday"));
		System.out.println(englSpanDictionary.get("Thursday"));
		System.out.println(englSpanDictionary.get("Friday"));
		System.out.println(englSpanDictionary.get("Saturday"));
		System.out.println(englSpanDictionary.get("Sunday"));
		//print key and value sets
		System.out.println(englSpanDictionary.keySet());
		System.out.println(englSpanDictionary.values());
		// size
		System.out.println("The size of our dictionary is: " + englSpanDictionary.size());
		
		
		//Shopping List
		Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
		//Put some stuff in dictionary
		shoppingList.put("Bread", true);
		shoppingList.put("Ham", Boolean.TRUE);
		shoppingList.put("Donuts", true);
		shoppingList.put("Sugar", Boolean.FALSE);
		shoppingList.put("Eggs", false);
		System.out.println(shoppingList.isEmpty());
		System.out.println(shoppingList.toString());
		shoppingList.replace("Bread", false);
		System.out.println(shoppingList.toString());
		shoppingList.clear();
		System.out.println(shoppingList.isEmpty());

		
		
		
		
		
		
		
		
		
		
		
	}

}
