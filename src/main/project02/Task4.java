package main.project02;

abstract class Vehicle {
    double vehiclePrice;

    abstract double calculateSalePrice();
}

class Sedan extends Vehicle {
    double length;

    Sedan(double vehiclePrice, double length) {
        this.vehiclePrice = vehiclePrice;
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return vehiclePrice / 100 * 95;
        } else {
            return vehiclePrice / 100 * 90;
        }
    }
}

class Truck extends Vehicle {
    double weight;

    Truck(double vehiclePrice, double weight) {
        this.vehiclePrice = vehiclePrice;
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return vehiclePrice / 100 * 90;
        } else {
            return vehiclePrice / 100 * 80;
        }
    }
}

class Task4 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Sedan(66000, 19.00), new Truck(990000, 2000)};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.calculateSalePrice());
        }
    }
}
