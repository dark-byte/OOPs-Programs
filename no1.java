class Quadratic {
    private final float a;
    private final float b;
    private final float c;

    public Quadratic(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return (int) a + "x2 + " + (int) b + "x + " + (int) c;

    }

    String Evaluate(double x) {
        double Answer = a * x * x + b * x + c;
        return Answer + " for x = " + x;

    }

    String roots() {
        float value = b * b - 4 * a * c;
        if (value == 0) {
            return "Roots are Real and Equal: root = " + -b / (2 * a);
        }
        if (value > 0) {
            return "Roots are Real and distinct: root1 = " + (-b + Math.sqrt(value)) / (2 * a) + "root2 = "
                    + (-b - Math.sqrt(value)) / (2 * a);
        } else {
            return "Roots are Imaginary and distinct: \n root1 = " +
                    (-b / (2 * a)) + " + i " + (Math.sqrt(-value) / (2 * a)) +
                    " root2 = " + (-b / (2 * a)) + " - i " + (Math.sqrt(-value) / (2 * a));
        }
    }

}


public class no1 {
    public static void main(String[] args) {
        Quadratic one = new Quadratic(2, 5, 9);
        System.out.println(one);
        System.out.println(one.Evaluate(6.8));
        System.out.println(one.roots());

        Quadratic two = new Quadratic(-4, -1, 1);
        System.out.println(two);
        System.out.println(two.Evaluate(6.8));
        System.out.println(two.roots());

    }
}
