package com.hyuki.dp.FactoryMethod.A2.idcard;

import com.hyuki.dp.FactoryMethod.A2.framework.*;

public class IDCard extends Product {
    private String owner;
    private int serial;

    // 必ずファクトリクラス経由でオブジェクト生成する
    IDCard(String owner, int serial) {
	System.out.println(owner + "(" + serial + ")" + "のカードを作ります。");
	this.owner = owner;
	this.serial = serial;
    }

    @Override
    public void use() {
	System.out.println(owner + "(" + serial + ")" + "のカードを使います。");
    }

    public String getOwner() {
	return owner;
    }

    public int getSerial() {
	return serial;
    }
}
