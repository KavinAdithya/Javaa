
 abstract class Laptop {
    private String name;
    private double price;
    public Laptop(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void showDetails(){
        System.out.println("Model name : "+name+"\nPrice : "+price);
    }
    public abstract void processor();
}
class Techno extends Laptop{
    Techno(String name,double price){
        super(name,price);
    }
    @Override
    public void processor(){//concrete class
        System.out.println("Intel I5 11th Generation...");
    }
    public static void main(String[] args){
        Techno tn=new Techno("Techno Mega Book T1",29990.00);
        tn.processor();
        tn.showDetails();
        Laptop lp=new Laptop("Techno",100000.00){
            public void processor(){
                System.out.println("In Mac Book Ios");
            }
        };
        lp.processor();
        lp.showDetails();
    }
}
