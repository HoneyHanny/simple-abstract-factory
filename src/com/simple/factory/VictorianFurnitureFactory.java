package com.simple.factory;

import com.simple.product.*;

public class VictorianFurnitureFactory extends FurnitureFactory {
	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new VictorianCoffeeTable();
	}

	@Override
	public Shelf createShelf() {
		return new VictorianShelf();
	}
}
