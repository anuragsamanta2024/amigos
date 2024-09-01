package oops.solids.openclosed;

public class SpeedCalculator {

    /*
        Poor Design

        public class SpeedCalculator {
            public void calculateSpeed(Vehicle vehicle) {
                if (vehicle instanceof Car){
                    calculate speed
                }
            else if (vehicle instanceOf Bus){
                    calculate speed
                }
            }
        }

        Better Design

    public interface Vehicle {
        void calculateSpeed();
    }

    public class Car implements Vehicle {

        void calculateSpeed() {
            calculate speed
        }
    }

    public class Truck implements Vehicle {

        void calculateSpeed() {
            calculate speed
        }
    }


    Vehicle car = new Car();
    vehicle.calculateSpeed();

    Vehicle truck = new Truck();
    truck.calculateSpeed();

    */

}
