package shape;

public class main {
    public static void main(String[] args) {
        circle cr=new circle();
        cr.getdata((double)3.0);
        System.out.println("Area of circle is:"+cr.area());
        triangle tr=new triangle();
        tr.getdata(4.3, 4);
        System.out.println("Area of triangle is:"+tr.area());
        square sq=new square();
        sq.getdata((float)4);
        System.out.println("Area of square is:"+sq.area());
    }
    
}
