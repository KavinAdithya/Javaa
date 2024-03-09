package VarAndNewSwitch;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class NewUpdate {
  public static void main(String []args){
    // var a=19;
    // var array=new int[10];
    // var lap=new Laptop();
    // lap.show();
    // for(int k:array){
    //   System.out.print(k+" ");
    // }
    // System.out.println(a);
    // AbtrClass absObject=new AbtrClass(){
    //     public void show(){
    //         System.out.println("IN Absttract Show!!");
    //     }
    // };
    // absObject.show();
    // absObject.runMachine();
    // Mobile mob=new Mobile();
    // mob.showMobile();
    //absObject.showMobile();
    switchCase();
  }
  public static void switchCase(){
    BufferedReader scanBuff=new BufferedReader(new InputStreamReader(System.in));
    try{
        int n=Integer.parseInt(scanBuff.readLine())-1;
        switch(n){
            case 1 ->{
                System.out.println("Monday!!!");
            }
            case 2->{
                System.out.println("TuesDay!!!");
            }
            case 3->{
                System.out.println("WednesDay!!!");
            }
            case 0->{
                System.out.println("Sunday!!!");
            }
            case 5->{
                System.out.println("Thursday!!!");
            }
            case 6->{
                System.out.println("Friday!!!");
            }
            case 7->{
                System.out.println("Saturday!!!");
            }
            default->{
                System.out.println("Out of range!!");
            }
        }
        int result=switch(n){
            case 1 :
                System.out.println("kaavin");
                yield 19;
            case 2,3 :
            System.out.println("Dharani..");
                yield 43;
            default :
                System.out.println("Nothing..");
                yield 90;
        };
        System.out.println(result);
    }
    catch(IOException e){
        e.printStackTrace();
    }
  }
}
sealed class Mobile permits AbtrClass,Laptop{
    public void showMobile(){
        System.out.println("In Mobile Show");
    }
}
final class Laptop extends Mobile{
  public void show(){
    System.out.println("Its A Techno Laptop!!!");
  }
}
abstract non-sealed class AbtrClass extends Mobile{
    public abstract void show();
    public void runMachine(){
        System.out.println("Machine Has Been Running Successfully!!!");
    }
}