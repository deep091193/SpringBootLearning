package com.sorting;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClassExample {
	private final int id;
	private final String name;
	private final HashMap<String, String> testMap;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}
	public ImmutableClassExample(int id, String name, HashMap<String, String> hm) {
		super();
		this.id = id;
		this.name = name;
		//this.testMap = hm;
		
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			key = it.next();
		tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap;
	}
	
	

}
