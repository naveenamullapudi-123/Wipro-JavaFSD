import java.util.*;

class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Box))
            return false;

        Box b = (Box) obj;
        return Double.compare(this.getVolume(), b.getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(getVolume()).hashCode();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        Set<Box> set = new TreeSet<>(new Comparator<Box>() {
            @Override
            public int compare(Box b1, Box b2) {
                return Double.compare(b1.getVolume(), b2.getVolume());
            }
        });

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double l = sc.nextDouble();

            System.out.println("Enter Width");
            double w = sc.nextDouble();

            System.out.println("Enter Height");
            double h = sc.nextDouble();

            set.add(new Box(l, w, h));
        }

        System.out.println("Unique Boxes in the Set are");

        for (Box b : set) {
            System.out.printf(
                    "Length = %.1f Width = %.1f Height = %.1f Volume = %.2f%n",
                    b.length, b.width, b.height, b.getVolume());
        }

        sc.close();
    }
}