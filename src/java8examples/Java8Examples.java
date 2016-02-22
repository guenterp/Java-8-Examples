/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 *
 * @author gP
 */
public class Java8Examples {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("==============================================");
        List<String> names = new ArrayList<>(Arrays.asList("Mozart", "Beethoven", "Verdi", "Puccini", "Rossini"));
        names.forEach(it -> { System.out.print(it + ", ");});
        System.out.println();
        System.out.println("==============================================");
        
        // lambdas
        //
        // sort names and display their lengths
        System.out.println("sort names and display their lengths:");
        names.sort((str1, str2) -> Integer.compare(str1.length(), str2.length()));
        names.forEach(it -> System.out.print(it.length() + ", "));
        System.out.println();
        System.out.println("==============================================");
        
        // method references
        // sort names and display them
        System.out.println("sort names and display item:");
        names.sort(String::compareTo);
        names.forEach(System.out::println);
        System.out.println("==============================================");
        
        
        // bulk operations on collections
        //
        // predicates
        System.out.println("remove long names, remaining:");
        Predicate<String> isLongWord = word -> word.length() > 6;
        names.removeIf(isLongWord);
        names.forEach(System.out::println);
        System.out.println("==============================================");
        //
        // unary operator
        System.out.println("convert names to upper case:");
        UnaryOperator<String> upper = String::toUpperCase;
        names.replaceAll(upper);
        names.forEach(s -> System.out.print("'" + s + "', "));
        System.out.println();
        System.out.println("==============================================");
        
        // streams
        // filter-map-reduce
        
        // default methods
        /*
            e.g. sort for List
            public interface List<E> extends Collection<E> {
                ...
                default void sort(Comparator<? super E> c) {
                    Collections.sort(this, c);
                }
            }
 
            e.g. forEach
            public interface Iterable<T> {
                ...
                default void forEach(Consumer<? super T> action) {
                for (T t : this) {
                    action.accept(t);
                }
            }
        */
        
        
        // optionals
        // pattern matching
        // CompletableFutures
        // Date and Time
        // further examples
    }

}
