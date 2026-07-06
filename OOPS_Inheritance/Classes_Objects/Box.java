class BoxDemo {

    double width;
    double height;
    double depth;

    BoxDemo(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Box {
    public static void main(String[] args) {

        BoxDemo box1 = new BoxDemo(5, 4, 3);

        System.out.println("Width  : " + box1.width);
        System.out.println("Height : " + box1.height);
        System.out.println("Depth  : " + box1.depth);
        System.out.println("Volume = " + box1.volume());
    }
}