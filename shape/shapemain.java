package shape;

public class shapemain {
    public static void main(String[] args) {
        circle Circle=new circle();
        square Square=new square();
        triangle Triangle=new triangle();
        Circle.getdata(3.0);
        System.out.println("Area of circle"+Circle.area());
        Square.getdata(4.0);
        System.out.println("Area of Square"+Square.area());
        Triangle.getdata(5.0, 5.0);
        System.out.println("Area of Triangle"+Triangle.area());
    }
    
}
