package shape;

public class triangle {
    double base;
    double length;
    public void getdata(double temp1,double temp2){
        base=temp1;
        length=temp2;
    }
    public double area()
    {
        return((1.0/2.0)*(base*length));
    }
    
}
