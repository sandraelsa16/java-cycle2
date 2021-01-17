package area;

public class Triangle {
    Triangle()
    {
        System.out.println(permeter(3, 4, 5));
        System.out.println(area(3, 4, 5));
    }

    int permeter(int x,int y , int z)
    {
        return (x + y + z);
    }

    int area(int x, int y, int z)
    {
        return (int) (0.5 * 3 * 4);
    }
    public static void main(String[] args) {
        Triangle obj = new Triangle();
    }
}