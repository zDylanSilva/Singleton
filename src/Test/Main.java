package Test;

import Machinery.Boiler;

public class Main {

	public static void main(String[] args) {
		
		Boiler boiler = Boiler.getInstance();
		
		//Procedure methods for output proof
		System.out.println(boiler.addIngredients());
		
		System.out.println(boiler.startMixing());
		
		System.out.println(boiler.emptyContainer());
		
		//Failure test
		
		System.out.println("\nThe message below should send an error since it skips the ingredient method");
		System.out.println(boiler.startMixing());
		
	}

}