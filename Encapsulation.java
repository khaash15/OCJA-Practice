class Perimeter {

  //Variables of the class
  int length;
  int breadth;

  // constructor to initialize values
  Perimeter(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  // Method that manipulates the variables
  public void getPerimeter() {
    int perimeter = 2 * (length +  breadth);
    System.out.println("Perimeter of Rectangle : " + perimeter);
  }
}

class Main {
  public static void main(String[] args) {

    //object of class Perimeter
    Perimeter rectangle = new Perimeter(3, 6);
    rectangle.getPerimeter();
  }
}
