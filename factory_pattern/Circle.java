package designPattern;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
        System.out.println("实现了接口Shape的Circle 的实例方法draw");
    }
}
