class Triangle extends Shape{
    private double height;
    private double base;

    @Override
    public double calculateArea() {
        return 0.5 * base*height;
    }
}