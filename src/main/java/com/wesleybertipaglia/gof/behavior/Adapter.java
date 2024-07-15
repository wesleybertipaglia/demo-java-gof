package com.wesleybertipaglia.gof.behavior;

public class Adapter {
    public static void main(String[] args) {
        Shape shape = new SquareAdapter(new Square());
        shape.draw();
    }
}

interface Shape {
    void draw();
}

class Square {
    public void drawSquare() {
        System.out.println("Drawing square");
    }
}

class SquareAdapter implements Shape {
    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void draw() {
        square.drawSquare();
    }
}
