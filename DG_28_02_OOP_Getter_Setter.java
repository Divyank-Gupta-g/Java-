package com.scaler;
class Cars {
    String model = "TATA";                  // properties
    String color = "Black";
    int price = 100000;
    boolean islocked = false;

    // Getter for price property.
    float getprice() {                            // getter provide the facility of typecasting
        return price;
    }

    // Setter for price property.
    void setprice(int priceValue) {             // setter provide security against invalid entryt.
        if (priceValue < 0) {
            System.out.println("Invalid value.");
        }
        else {
            price = priceValue;
        }
    }

    void drive() {
        System.out.println("zoom zoom zoom");
    }       // functionalities

    void lock() {
        islocked = true;
        System.out.println("Car is locked now");
    }

    void unlock() {
        islocked = false;
        System.out.println("Car is unlocked.");
    }
}


    class DG_28_02_OOP_Getter_Setter {
        public static void main(String[] args) {
            Cars c1 = new Cars();                     // objects of class car
            Cars c2 = new Cars();

            System.out.println(c1.getprice());

            c2.setprice(120000);
            System.out.println(c2.getprice());

            c1.setprice(-5000);
            System.out.println(c1.getprice());
        }
    }
