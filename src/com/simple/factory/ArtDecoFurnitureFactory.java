package com.simple.factory;

import com.simple.product.*;

public class ArtDecoFurnitureFactory extends FurnitureFactory {
	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ArtDecoCoffeeTable();
	}

	@Override
	public Shelf createShelf() {
		return new ArtDecoShelf();
	}
}
