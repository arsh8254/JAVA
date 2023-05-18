
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.*;
import java.util.stream.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;
public class Stream1 
{
    public static void main(String[] args) 
    {
        
        List<Integer> list=Arrays.asList(8,4,2,7,5);

        Stream<Integer> streamData=list.stream();

        // long count=streamData.count();   // gives the count of values in stream
        // System.out.println(count);

        // Predicate<Integer> pre= i -> i%2==0;

        Stream<Integer> finalStream=streamData
        .filter(n->n%2==0)
        .sorted()               // method chaining as return type is same in all
        .map(n->n*2);

        // Stream<Integer> sortedStream=streamData.sorted();   // it will return a stream with sorted values

        // Stream<Integer> mapStream=sortedStream.map(n->n*2);  // it also gives a stream in return

        finalStream.forEach(n->System.out.println(n));

        //streamData.forEach(n->System.out.println(n));
    }
    
}
