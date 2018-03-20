package designPattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
        System.out.println("实现了接口Shape的Square 的实例方法draw");
    }
}
