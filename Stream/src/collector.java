
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H.P
 */
public class collector {
    public static void main(String[] args) {
        List<String> letters=new ArrayList<>();
        letters.add("3");
        letters.add("4");
        letters.add("5");
        //List<String> list = letters.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        // Accumulate into a TreeSet
Set<String> set = letters.stream()
                          .map(s -> s.toUpperCase())
                          .collect(Collectors.toCollection(TreeSet::new));

// Convert elements to strings and concatenate them, separated by commas
String joined = letters.stream()
                      .map(s -> s.toUpperCase())
                      .collect(Collectors.joining(", "));

// Compute sum of all letters
int total = letters.stream()
                     .collect(Collectors.summingInt(s->Integer.parseInt(s)));

// Group by starting letter
Map<String, List<String>> grouped = letters.stream()
                                    .collect(Collectors.groupingBy(s->s.substring(0,1)));
                                            

// Partition letters into uppercase and lowercase
Map<Boolean, List<String>> upperLower = letters.stream()
                                    .collect(Collectors.partitioningBy(s->Integer.parseInt(s)>3));
       
   
     //   System.out.println(list);
        System.out.println(set);
        System.out.println(joined);
        System.out.println(upperLower);
        System.out.println(total);
        System.out.println(grouped);
        System.out.println(upperLower);
    }
    
}
