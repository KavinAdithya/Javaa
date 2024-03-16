public class InterFace {
}
interface Bike{
    void cc();
    default void show(){
        System.out.println("In bike Show!!");
    }
     static void age(){
        System.out.println("About 100 years");
    }
    static void main(String[] args){
       Bike bk=new Bike(){
         public void cc(){
             System.out.println("200 CC");
         }
       };
       bk.cc();
       Bike.age();
       bk.show();
    }
}