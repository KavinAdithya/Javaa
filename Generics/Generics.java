package Generics;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Generics{
    @SuppressWarnings({ "removal", "unused" })
    
    public static void main(String[] args){
        new A<>("kak",8);
        A<? super Integer> obj=new A<>(45,9);
        obj.show();
        System.out.println(new Integer(12).getClass().getSuperclass().getSuperclass());
        A<? super  Number> obj22=new A<Object>(2,89);
        List<Integer> list =new ArrayList<Integer>();
        list.add(1);
        list.add(89);
        List<String> listString=Arrays.asList("kavin","Dharani");
        Generics.showList(listString);
        showList(list);
        Generics.<Integer>show(5,0);
        A<? extends Number> obj11=new A<>(8,5);
        obj.show();
    }
    public static  void showList(List<?> list){
        for(Object k:list){
            System.out.print(k+" ");
        }
    }
    public static <K>void show(K k,K t){
        System.out.println(k+" Its a Type "+t);
    }
}
class A<T extends Object> extends Object{
    T k,e;
    A(T k,T e){
        this.k=k;
        this.e=e;
    }
    public void show(){
       // System.out.println("Yes The Solution is : "+(k.intValue()+e.intValue()));
       System.out.println(e);
    }
}
class Decent extends Object{
    public void show(){
        System.out.println("In Decent Show !!!");
    }
}
class NewDescent extends Object{
    public void show(){
        System.out.println("In New Decent Show !!");
    }
}