package com.wesleybertipaglia.gof.create;

public class Factory {
    public static void main(String[] args) {
        FactoryInterface computerFactory = new ComputerFactory();
        ProductInterface computer = computerFactory.make();
        computer.use();
    }
}

abstract class ProductInterface {
    abstract void use();
}

abstract class FactoryInterface {
    abstract ProductInterface make();
}

class Computer extends ProductInterface {
    @Override
    void use() {
        System.out.println("Using Computer");
    }
}

class ComputerFactory extends FactoryInterface {
    @Override
    ProductInterface make() {
        return new Computer();
    }
}
