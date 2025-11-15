class Circle extends Shape {
    private double radius;

    @Override
    public Circle(double radius) {
        return MATH.PI * radius*radius;
    }

}