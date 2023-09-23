package com.simple.factory;

import com.simple.product.Chair;
import com.simple.product.CoffeeTable;
import com.simple.product.Shelf;
import com.simple.product.Sofa;

public abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract Sofa createSofa();
    public abstract CoffeeTable createCoffeeTable();
	public abstract Shelf createShelf();
}
