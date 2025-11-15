class Rectangle extends Shape{
    private double width;
    private double height;

    @Override
    public double calculateArea() {
        return width * height;
    }

}