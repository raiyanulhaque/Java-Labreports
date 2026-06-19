class Car {
String brand;
String model;
double price;
Car(String b, String m, double p) {
brand = b;
model = m;
price = p;
}
void displayCar() {
System.out.println("Car Brand: " + brand);
System.out.println("Car Model: " + model);
System.out.println("Car Price: $" + price);
}
public static void main(String[] args) {
Car myCar = new Car("BMW", "M5", 123000);
myCar.displayCar();
}
}
