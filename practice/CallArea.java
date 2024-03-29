class Area {
    static int area; // class variable

    static int computeArea(int width, int height) {
        area = width * height;
        return area;
    }

   
}

class CallArea {
    public static void main(String args[]) {
        System.out.println("Area of rectangle: " + Area.computeArea(4, 3));
    }
}
