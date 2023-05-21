class Box {
    private int length, breadth, height;

    public void setDimensions(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void showDimensions() {
        System.out.println("length = " + length);
        System.out.println("breadth = " + breadth);
        System.out.println("height = " + height);
    }
}

public class ObjAndClass {
    public static void main(String arg[]) {
        Box Box1 = new Box();
        Box1.setDimensions(10, 20, 30);
        Box1.showDimensions();
    }
}
    