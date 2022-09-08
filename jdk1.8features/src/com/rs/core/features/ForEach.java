package com.rs.core.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("------------Iterating by passing lambda expression--------------");
		
		gamesList.forEach(game -> System.out.println(game));
		
		/*
		Iterator<String> iterator = gamesList.iterator();
		String game = null;
		while(iterator.hasNext()) {
			game = iterator.next();
			System.out.println(game);
		}
		*/
	}

}
