package com.hyuki.dp.FactoryMethod.A2.framework;

/**
 * FactoryMethodパターンのFactoryクラスです。<p>
 * 生成の枠組みを提供し、具体的な実装は実装クラスに委ねます。
 */
public abstract class Factory {
    public final Product create(String owner) {
	Product p = createProduct(owner);
	registerProduct(p);
	return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
