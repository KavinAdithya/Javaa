package StreamAPI;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
public class ParallelStream {
    //Driver Mode
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(1,78,9,43,67);
        Consumer<Integer> consume=new Consumer<Integer>(){
            @Override
            public void accept(Integer n){
                for(int k=0;k<10000;k++){
                    try{
                        Thread.sleep(1);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        long startParallel= System.currentTimeMillis();
        list.parallelStream()
            .forEach(consume);
        long endParallel=System.currentTimeMillis();
        list.stream()
            .forEach(consume);
        long end=System.currentTimeMillis();
        System.out.println("Parallel Stream Took Time About "+(endParallel-startParallel)+" milli seconds/?");
        System.out.println("Stream TooK Time About "+(end-endParallel)+" milli Seconds/?");
    }
}
