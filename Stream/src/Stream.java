/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author H.P
 */
public class Stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Integer> number = Arrays.asList(7,1,4,5);
        List<Integer> number1 = Arrays.asList(4,1,3,5);
        number.stream().map(m->m*3).forEach(System.out::println);
        number.stream().peek(System.out::println).count();
        System.out.println(number.stream().findFirst());
        System.out.println(number.stream().findAny());
        System.out.println(number.stream().allMatch(n->n%2!=0));
        System.out.println(number.stream().anyMatch(n->n%2!=0));
        System.out.println(number.stream().noneMatch(n->n%2!=0));
        
        List<List<Integer>> c = new ArrayList<>();
        c.add(number);
        c.add(number1);
        List<Integer> a=c.stream().flatMap(m->m.stream()).collect(Collectors.toList());
        System.out.println(a);
        number.stream().sorted().forEach(System.out::println);
    }
    
    
}