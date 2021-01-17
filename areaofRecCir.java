package area;

public class areaofRecCir
{
    public int Area(int l, int b)
    {
        return l * b;
    }

    public float Area(float r)
    {
        return (float) (3.14 * r * r);
    }
        public static void main(String[] args) {
        areaofRecCir obj = new areaofRecCir();
         System.out.println("Area of Rectangle:-");
        System.out.println(obj.Area(3, 7));
        System.out.println("Area of Circle:-");
        System.out.println(obj.Area(5));
        
    }
}