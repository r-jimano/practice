package com.hyuki.dp.FactoryMethod.A2.idcard;

import com.hyuki.dp.FactoryMethod.A2.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private HashMap<Integer, String> database = new HashMap<>();
    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
	return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
	IDCard card = (IDCard) product;
	database.put(new Integer(card.getSerial()), card.getOwner());
    }

    public HashMap<Integer, String> getDatabase() {
	return database;
    }
}
