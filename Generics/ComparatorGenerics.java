package Generics;
interface Car{
}
interface Bike<T>{
    public default void wheelCondition(){
        System.out.println("Its Good Condition !!!");
    }
    public abstract void gear();
}
class Engine{
    public void showEngine(){
        System.out.println("Its UltraSonic Engine Which Execute High engine Power!1");
    }
}
class Vehicle extends Engine implements Bike<Double>,Car{
    @Override
    public void gear(){
        System.out.println("It has 6 gears?! ");
    }
}
class Lambourgini<T extends Engine&Bike<? extends Number>&Car>{
    T basicCar;
    Lambourgini(T basicCar){
        this.basicCar=basicCar;
    }
    public void showAboutYourSelf(){
        basicCar.showEngine();
        basicCar.gear();
        basicCar.wheelCondition();
        System.out.println("I am Give You a great Experience!!!");
    }
}
public class ComparatorGenerics {
    //Driver Mode
    public static void main(String[] args){
        Lambourgini<Vehicle> lamb=new Lambourgini<>(new Vehicle());
        lamb.showAboutYourSelf();
    }
}
