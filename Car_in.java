class car{
    private int car_id;
    private static int count = 0;
    public car(){
        this.car_id = ++count;
    }

    public int getCar_id() {
        return car_id;
    }
    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public void display_carid(){
        System.out.println("Car ID: " + getCar_id());
    }

    public static void display_count(){
        System.out.println("Total Cars: " + count);
    }
}

public class Car_in {
    public static void main(String[] args){
        car car1 = new car();
        car car2 = new car();
        car car3 = new car();

        car1.display_carid();
        car2.display_carid();
        car3.display_carid();

        car.display_count();

    }
}
