package ClassesType;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
class Dog{
    int n=0;
    Dog(int n){
        this.n=n;
    }
    public void show(){
        System.out.println("Its A Cute Dog!!! "+n);
    }
}
public class OptionalClass {
    //Driver Mode
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(9,18,8,19,13,43,19,43);
        list.stream()
            .distinct()
            .forEach(n->System.out.print(n+" "));
        System.out.println(list.stream().min(Integer::compare).get());
        System.out.println(list.stream().max(Integer::compare).get());
        Optional<Integer> op=list.stream()
                                 .filter(n->n<1)
                                 .findFirst();
        System.out.println(op);
        System.out.println(op.orElse(89));
        list.stream()
                          .map(Dog::new)
                          .forEach(n->n.show());
    }
}
