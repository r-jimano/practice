package com.hyuki.dp.FactoryMethod.A2.framework;

/**
 * FactoryMethodパターンのProductクラスです。<p>
 * Factoryクラスで生成する対象のクラスです。具体的な実装は実装クラスに委ねます。
 */
public abstract class Product {
//    public abstract Product(String name);// コンストラクタは継承されないし、できない
    public abstract void use();
}
