package designPattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
        System.out.println("实现了接口Shape的Rectangle 的实例方法draw");
    }
}
