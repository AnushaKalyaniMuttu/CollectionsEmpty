package com.bean;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public class CollectionsEmpty {

	public static void main(String[] args) {
	/*
	 * The purpose of Collections.emptyEnumeration() is to provide a standardized way to get an empty Enumeration
	 *  without having to create a new instance every time you need an empty Enumeration	
	 */
	Enumeration<String> enumI=	Collections.emptyEnumeration();
	 while (enumI.hasMoreElements()) {
         String element = enumI.nextElement();
         System.out.println("Element: " + element);
     }
	 
	Iterator<String> emptyIterator=Collections.emptyIterator();
	while(emptyIterator.hasNext()) {
		 String element = emptyIterator.next();
         System.out.println("Element: " + element);
	}
	
	List<String> emptyList=Collections.emptyList();
	emptyList.forEach(System.out::println);
	
	ListIterator<String> emptyListIterator=Collections.emptyListIterator();
	while(emptyListIterator.hasPrevious()) {
		 String element = emptyListIterator.next();
         System.out.println("Element: " + element);
	}
	
	Map<String,Integer> emptyMap=Collections.emptyMap();
	System.out.println(emptyMap.size());
	
	NavigableMap<String,Integer> emptyNavigableMap=Collections.emptyNavigableMap();
	System.out.println(emptyNavigableMap.isEmpty());
	
	NavigableSet<Integer> emptyNavigableSet=Collections.emptyNavigableSet();
	System.out.println(emptyNavigableSet);
	
	Set<Integer> set=Collections.emptySet();
	System.out.println(set);
	
	SortedMap<String,Integer> emptySortedMap=Collections.emptySortedMap();
	System.out.println(emptySortedMap);
	
	SortedSet<Integer> emptySortedSet=Collections.emptySortedSet();
	System.out.println(emptySortedSet);
		}
		
	}
