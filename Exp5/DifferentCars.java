//using inheritance 
class Vehicle {
    String brand;
    String model;
    float price;

    public Vehicle(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    public Car(String brand, String model, int price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        // error super.(brand, model, price);
        // error did not wrote brand , model and price in car constructor
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    double batteryCapacity;
    double chargingTime;

    public ElectricCar(String brand, String model, int price, int seatingCapacity, String fuelType,
            double batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

public class DifferentCars {
    public static void main(String[] args) {
        Car myCar = new Car("Alto", "800", 20000, 5, "Petrol");
        myCar.displayDetails();
        System.out.println();

        ElectricCar myElectricCar = new ElectricCar("GMC", "Hummer EV", 15000, 7, "Electric", 70, 6);
        myElectricCar.displayDetails();
    }
}