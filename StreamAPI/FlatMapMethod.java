package StreamAPI;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapMethod {
    //Driver Mode
    public static void main(String[] args){
        
        List<Integer> list=Arrays.asList(89,9,3,10,76);
        List<Integer> list1=Arrays.asList(84,45,53,93);
        List<List<Integer>> list2=Arrays.asList(list,list1);
        Stream<List<Integer>> str=list2.stream();
         Consumer<Integer> consume0=new Consumer<Integer>(){
            @Override
            public void accept(Integer m){
                System.out.print(m+" ");
            }
        };
         Consumer<List<Integer>> consume=new Consumer<List<Integer>>(){
            @Override
            public void accept(List<Integer> n){
                n.forEach(consume0);
            }
        };
       list2.forEach(consume);
        List<Integer> newList=str.flatMap(n->n.stream().map(m->m*2)).toList();
        newList.forEach(consume0);
        newList.stream().skip(2).limit(5).forEach(consume0);
        
    }
   
}
