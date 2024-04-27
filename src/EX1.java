import com.sun.source.doctree.IndexTree;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EX1 {
    public static void main(String[] args) {

        System.out.println("*****--Q1--*****");

        List<String> mots=new ArrayList<>();
        mots.add("Achraf");
        mots.add("Maaatoui");
        mots.add("enset");
        mots.stream().filter(mot ->mot.contains("a")).forEach(System.out::println);

        System.out.println("*****--Q2--*****");

        mots.stream().filter(mot->mot.length()>3)
                .map(mot->new StringBuilder(mot).reverse())
                .forEach(System.out::println);

        System.out.println("*****--Q3--*****");

        mots.stream().filter(mot->mot.contains("e"))
                .flatMap(mot-> Stream.of(mot.toCharArray()))
                .forEach(System.out::println);

        System.out.println("*****--Q4--*****");

        mots.stream()
                .map(mot->mot.toUpperCase())
                .forEach(System.out::println);

        System.out.println("*****--Q5--*****");
        mots.stream()
                .mapToInt(mot->mot.length())
                .forEach(System.out::println);

        System.out.println("*****--Q6--*****");

        mots.stream().flatMap(mot->mot.chars().mapToObj(c->(char)c))
                .forEach(System.out::println);

        System.out.println("*****--Q7--*****");
        AtomicInteger counter =new AtomicInteger(0);
        mots.stream().map(mot->new StringBuilder(mot).append(-mots.indexOf(mot))).forEach(System.out::println);

    }
}
