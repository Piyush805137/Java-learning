// area
class Arpna {
    public void area1(int l, int b) {
        int add = l * b;
        System.out.println("area of rectangle is " + add);
    }

    public void area2(int side) {
        int area = side * side;
        System.out.println("area of a square is " + area);
    }

    public void area3(float r) {
        float pie = 3.14f;
        float area = pie * r * r;
        System.out.println("area of a circle is " + area);
    }

    public static void main(String args[]) {
        Arpna o = new Arpna();
        o.area1(10, 20);
        o.area2(50);
        o.area3(20.5f);
    }
}