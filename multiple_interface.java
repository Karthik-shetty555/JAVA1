interface rect{
    float area_rect(float x,float y);
}
interface tri{
    float area_tri(float x,float y);
}
class area implements rect,tri{
    public float area_rect(float x,float y){
        return(x*y);
    }
    public float area_tri(float x,float y){
        return(x*y/2);
    }
}
public class multiple_interface {
    public static void main(String[] args) {
        area a=new area();
        System.out.println("Area of Rectangle:"+a.area_rect(10,20));
        System.out.println("Area of Rectangle:"+a.area_tri(10,20));
    }
    
}
