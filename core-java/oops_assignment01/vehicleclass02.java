class vehicle {
    int speed;
    String colour;

    vehicle(int s, String c) {
        this.speed = s;
        this.colour = c;
    }

      void move() {
        System.out.println("The vehicle is moving at speed: " + speed + " km/h.");
    }
}

    class car extends vehicle {
        int numberOfDoors;

        car(int s,String c,int n) {
            super(s, c);
            this.numberOfDoors = n;
        }


         void move() {
        System.out.println("The car with " + numberOfDoors + " doors is driving  at " + speed + " km/h.");
    }


            public static void main(String[] args) {
        vehicle v = new vehicle(60, "Red");
        v.move();

        car c = new car(100, "Blue", 4);
        c.move();
    }
    }
