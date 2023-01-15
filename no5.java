class Quadrilateral
{
    double l, b, h = 0;
    public Quadrilateral(double l, double b){
        this.l = l;
        this.b = b;
    }

    public Quadrilateral(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public double Area(){
        if(h != 0){
            return l*b*h;
        }
        else
            return l*b;
    }

}

class no5
{

    public static void main(String args[])
    {
        double length = 3.0;
        double Breadth = 4.0;
        double Height = 5.0;
        Quadrilateral A = new Quadrilateral(length, Breadth);
        Quadrilateral B = new Quadrilateral(length, Breadth, Height);
        double Area1 = A.Area();
        double Area2 = B.Area();
        System.out.printf("Area of Rectangle A is %f\nArea of Cuboid B is %f\n", Area1, Area2);
    }

}