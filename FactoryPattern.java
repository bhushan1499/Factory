class FactoryPattern{
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShapeInstance("circle");
        circle.draw();
        Shape sq = ShapeFactory.getShapeInstance("square");
        sq.draw();
    }
}

interface Shape {
     void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle Object");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square Object");
    }
}

class ShapeFactory {
    
    static Shape getShapeInstance(String s) {
        if(s.equals("circle")) {
            return new Circle();
        }
        else if(s.equals("square")) {
            return new Square();
        }
        return null;
    }
}