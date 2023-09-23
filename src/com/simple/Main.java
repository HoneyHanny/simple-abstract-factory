package com.simple;

import com.simple.factory.ArtDecoFurnitureFactory;
import com.simple.factory.FurnitureFactory;
import com.simple.factory.ModernFurnitureFactory;
import com.simple.factory.VictorianFurnitureFactory;
import com.simple.product.*;

import java.util.ArrayList;

/**
 * @author Hans Duran
 */
public class Main {

	static FurnitureFactory mf = new ModernFurnitureFactory();
	static FurnitureFactory vf = new VictorianFurnitureFactory();
	static FurnitureFactory adf = new ArtDecoFurnitureFactory();


	// Try adding a new style of product without touching the other styles already implemented.

	public static void main(String[] args) {

		var chairs = new ArrayList<Chair>();
		var coffeeTables = new ArrayList<CoffeeTable>();
		var sofas = new ArrayList<Sofa>();
		var shelves = new ArrayList<Shelf>();

		chairs = getChairs();
		coffeeTables = getCoffeeTables();
		sofas = getSofas();
		shelves = getShelves();

		System.out.println("\nUsing chairs:");
		for (Chair chair : chairs)
			chair.use();

		System.out.println("\nUsing coffee tables:");
		for (CoffeeTable coffeeTable : coffeeTables)
			coffeeTable.use();

		System.out.println("\nUsing sofas:");
		for (Sofa sofa : sofas)
			sofa.use();

		System.out.println("\nUsing shelves:");
		for (Shelf shelf : shelves)
			shelf.use();

	}

	private static ArrayList<Chair> getChairs() {
		var chairs = new ArrayList<Chair>();

		chairs.add(mf.createChair());
		chairs.add(vf.createChair());
		chairs.add(adf.createChair());

		return chairs;
	}

	private static ArrayList<Shelf> getShelves() {
		var shelves = new ArrayList<Shelf>();

		shelves.add(mf.createShelf());
		shelves.add(vf.createShelf());
		shelves.add(adf.createShelf());

		return shelves;
	}

	private static ArrayList<Sofa> getSofas() {
		var sofas = new ArrayList<Sofa>();

		sofas.add(mf.createSofa());
		sofas.add(vf.createSofa());
		sofas.add(adf.createSofa());

		return sofas;
	}

	private static ArrayList<CoffeeTable> getCoffeeTables() {
		var coffeeTables = new ArrayList<CoffeeTable>();

		coffeeTables.add(mf.createCoffeeTable());
		coffeeTables.add(vf.createCoffeeTable());
		coffeeTables.add(adf.createCoffeeTable());

		return coffeeTables;
	}

}