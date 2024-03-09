package ClassesType;
record Alien(int age,String name){
    static int life;
    public static void whatAboutYou(){
        System.out.println("I am A passionated Java Full Stack Developer!!!");
    }
    Alien(){
        this(19,"Dharani");
        int age=21;
        if(age==0)
            throw new IllegalArgumentException();
    }
    public void show(){
        System.out.println("Kavin_Adithya?/!Dharani_Adithii?/!");
    }
}
public class RecordClass {
    //driver mode
    public static void main(String[] args){
        Alien obj1=new Alien();
        obj1.show();
        Alien obj=new Alien(2,"KavinDharani");
        obj.show();
        Alien.whatAboutYou();
        Alien.life=20;
        System.out.println(Alien.life);
        System.out.println(obj);
        System.out.println(obj.age());
        System.out.println(obj.name());
    }
}
