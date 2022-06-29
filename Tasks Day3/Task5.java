package Day3;

public class Task5 {

    static class Vehicle {
        private int speed;
        private final int MIN_SPEED = 0;
        private final int MAX_SPEED = 220;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void driving() {
            System.out.printf("Current speed: %d km/h. %n", getSpeed());
        }

        public void gearChange(int nextGear) {
            if (nextGear == 0) {
                System.out.println("Car is in neutral.");
            } else if (nextGear < 0) {
                System.out.println("Car drives reverse.");
            } else {
                System.out.printf("Car drives forward on %d gear. %n", nextGear);
            }
        }

        public void speedIncrease(int number) {
            if (speed + number <= MAX_SPEED) {
                speed += number;
                System.out.printf("Speed was increased by: %d km/h %n", number);
                System.out.printf("Current speed: %d km/h. %n", speed);
            } else if (number > MAX_SPEED) {
                System.out.println("Can't drive faster than max speed");
            } else {
                System.out.println("Driving at max speed.");
            }
        }

        public void speedDecrease(int number) {
            if (speed - number > MIN_SPEED) {
                speed -= number;
                System.out.printf("Speed was decreased by %d km/h. %n", number);
                System.out.printf("Current speed is: %d km/h. %n", speed);
            } else if (speed == 0) {
                System.out.println("Car is stopped.");
            }
        }

        public void carStop() {
            if (speed == 0) {
                System.out.println("Car is stopped.");
            }
        }

        static class Car extends Vehicle {

            public void steering() {
                System.out.println("Steering wheel can only rotate side to side!");
            }

        }

        static class Coupe extends Car {

        }

        public static void main(String[] args) {
            Coupe coupe = new Coupe();
            coupe.steering();
            coupe.setSpeed(100);
            coupe.driving();
            coupe.speedIncrease(50);
            coupe.gearChange(5);
            coupe.speedDecrease(30);
            coupe.speedDecrease(120);
            coupe.carStop();
        }
    }
}

